package pe.telefonica.siam.infrastructure.repository;

import java.util.Map;
import org.apache.commons.lang3.RandomStringUtils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import pe.telefonica.siam.domain.BajaTrabajadorRequest;
import pe.telefonica.siam.domain.repository.MuerteInformaticaRepository;
import static pe.telefonica.siam.infrastructure.repository.MuerteInformaticaRepositoryImpl.*;

/**
 *
 * @author Néstor Hernández Loli
 */
@SpringJUnitConfig(classes = {TestITConfig.class, MuerteInformaticaRepositoryImpl.class})
@Sql(config = @SqlConfig(separator = "GO"), scripts = {"/schema.sql"})
@Sql(config = @SqlConfig(separator = ";"), scripts = {"/data.sql"})
public class MuerteInformaticaRepositoryImplIT {

    @Autowired
    MuerteInformaticaRepository repository;

    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Test
    public void testBajaTrabajador() {
        {
            var resp = repository.bajaTrabajador(request("DNI", "0000000"));
            assertEquals(RESP_TRAB_NO_HALLADO, resp.getCodigoError());
        }
        testFlujoNormal("DNI", "46513273");
        testFlujoNormal("CEX", "002039883");
        testFlujoNormal("CEX", "000234884");
    }

    private void testFlujoNormal(String tipo, String doc) {
        String msg = "Falló trabajador " + tipo + " " + doc;
        Map<String, Object> paramsSol;
        {
            var resp = repository.bajaTrabajador(request(tipo, doc));
            assertEquals(RESP_TICKET_CREADO, resp.getCodigoError(),
                    msg + ". Debería haber creado el ticket");
            paramsSol = Map.of("solicitud_id", Long.parseLong(resp.getTicketSIAM()));
        }
        {
            var resp = repository.bajaTrabajador(request(tipo, doc));
            assertEquals(RESP_BAJA_EJECUCION, resp.getCodigoError(),
                    msg + ". Debería haber indicado que el ticket está creado");

            jdbcTemplate.update("update tga_solicitudes set estado_ejecucion_sol_id=" + ESTADO_SOL_EJECUCION + " where solicitud_id=:solicitud_id",
                    paramsSol);
            resp = repository.bajaTrabajador(request(tipo, doc));
            assertEquals(RESP_BAJA_EJECUCION, resp.getCodigoError(),
                    msg + ". Debería haber indicado que el ticket está creado");

            jdbcTemplate.update("update tga_solicitudes set estado_ejecucion_sol_id=5,estado_reintento=0 where solicitud_id=:solicitud_id",
                    paramsSol);
            resp = repository.bajaTrabajador(request(tipo, doc));
            assertEquals(RESP_SE_VA_REINTENTAR, resp.getCodigoError(),
                    msg + ". Debería haber indicado que se va reintentar una falla");

            resp = repository.bajaTrabajador(request(tipo, doc));
            assertEquals(RESP_YA_SOLICI_REINTENTO, resp.getCodigoError(),
                    msg + ". Debería haber indicado que YA se pidió el reintento de la falla");
        }
    }

    private BajaTrabajadorRequest request(String tipo, String doc) {
        var req = new BajaTrabajadorRequest();
        req.setTipoDocumento(tipo);
        req.setDocumentoUsuario(doc);
        req.setNroTicketHaross(RandomStringUtils.randomAlphanumeric(20));
        req.setCodigoAccion(RandomStringUtils.randomAlphanumeric(10));
        req.setUsuarioSolic(RandomStringUtils.randomAlphanumeric(10));
        return req;
    }
}
