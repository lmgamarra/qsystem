package pe.telefonica.siam.infrastructure.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import pe.telefonica.siam.infrastructure.util.SqlQuery;

/**
 *
 * @author Nestor Hernandez Loli
 */
public class SqlQueryTest {

    @Test
    public void test_consulta_hallada() {
        assertEquals("select t.tipo_politica_id, t.nombre, t.descripcion \n"
                + " from tccm_tipos_politicas t",
                SqlQuery.from("PolicyTypeSIAMEntity.listarTipos", "orm_policy"));
        //Otra vez para ver si funciona la caché
        assertEquals("select t.tipo_politica_id, t.nombre, t.descripcion \n"
                + " from tccm_tipos_politicas t",
                SqlQuery.from("PolicyTypeSIAMEntity.listarTipos", "orm_policy"));

        assertEquals("select t.tipo_frecuencia_id, t.nombre, t.dias\n"
                + " from tm_tipos_frecuencias t\n"
                + " order by t.orden",
                SqlQuery.from("FrequencyTypeSIAMEntity.listarFrecuencias", "orm_policy"));
    }

    @Test
    public void test_consulta_no_hallada() {
        var msg = assertThrows(NullPointerException.class, () -> SqlQuery.from("PolicyTypeSIAMEntity.listarTipos", "no_encontrado")).getMessage();
        assertTrue(msg.startsWith("File not found"), "Mensaje no esperado = " + msg);
    
        var msg2 = assertThrows(NullPointerException.class, () -> SqlQuery.from("PolicyTypeSIAMEntity.metodo_no_hallado", "orm_policy")).getMessage();
        assertTrue(msg2.startsWith("Query not found"), "Mensaje no esperado = " + msg2);
    }
}
