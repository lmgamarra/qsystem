package pe.telefonica.siam.domain.dto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import pe.telefonica.siam.domain.enums.DirectionEnum;
import pe.telefonica.siam.domain.enums.FilterTypeEnum;

/**
 *
 * @author Nestor Hernandez Loli
 */
public class CustomPaginableTest {

    private static final Map<String, String> COLS = new LinkedHashMap<>();

    static {
        COLS.put("RESPONSABLEID", "r.responsable_id");
        COLS.put("PERSONA_NUMDOCUMENTO", "p.documento");
        COLS.put("PERSONA_NOMBRES", "p.nombres");
        COLS.put("PERSONA_TIPODOC", "p.tipodoc");
    }

    @Test
    public void testToWhereSql() {
        var attrs = List.of(
                new EntityAttribute("PERSONA_NUMDOCUMENTO", "45218273", FilterTypeEnum.TEXT),
                new EntityAttribute("RESPONSABLEID", "1", FilterTypeEnum.NUMBER),
                new EntityAttribute("PERSONA_TIPODOC", "100", FilterTypeEnum.NUMBER)
        );
        var pag = new CustomPaginable(1, 10, "PERSONA_NUMDOCUMENTO", DirectionEnum.ASC, attrs);
        var where = pag.toWhereSql(COLS);
        var expectedSql = "p.documento LIKE CONCAT('%', :PERSONA_NUMDOCUMENTO, '%') AND r.responsable_id = :RESPONSABLEID AND p.tipodoc = :PERSONA_TIPODOC";

        assertThat(where.sql).isEqualTo(expectedSql);
        assertThat(where.parameters).contains(entry("PERSONA_NUMDOCUMENTO", "45218273"));
        assertThat(where.parameters).contains(entry("RESPONSABLEID", "1"));
        assertThat(where.parameters).contains(entry("PERSONA_TIPODOC", "100"));
    }

    @Test
    public void testToWhereSql2() {
        var attrs = List.of(
                new EntityAttribute("PERSONA_NUMDOCUMENTO", "45218273", FilterTypeEnum.TEXT),
                new EntityAttribute("RESPONSABLEID", "1", FilterTypeEnum.NUMBER),
                new EntityAttribute("PERSONA_TIPODOC", "1,2", FilterTypeEnum.SELECT_MULTIPLE)
        );
        var pag = new CustomPaginable(1, 10, "PERSONA_NUMDOCUMENTO", DirectionEnum.DESC, new ArrayList<>(attrs));
        var where = pag.toWhereSql(COLS);
        var expectedSql = "p.documento LIKE CONCAT('%', :PERSONA_NUMDOCUMENTO, '%') AND r.responsable_id = :RESPONSABLEID AND p.tipodoc IN (1,2)";
        assertThat(where.sql).isEqualTo(expectedSql);

        assertThat(where.parameters).contains(entry("PERSONA_NUMDOCUMENTO", "45218273"));
        assertThat(where.parameters).contains(entry("RESPONSABLEID", "1"));
    }

    @Test
    public void testToWhereSql_invalido() {
        var attrs = List.of(
                new EntityAttribute("PERSONA_NUMDOCUMENTO_no_mapeado", "45218273", FilterTypeEnum.TEXT),
                new EntityAttribute("RESPONSABLEID", "1", FilterTypeEnum.NUMBER)
        );
        var pag = new CustomPaginable(1, 10, "RESPONSABLEID", DirectionEnum.DESC, new ArrayList<>(attrs));

        var ex = assertThrows(NullPointerException.class, () -> pag.toWhereSql(COLS));
        assertThat(ex.getMessage()).isEqualTo("El campo 'PERSONA_NUMDOCUMENTO_no_mapeado' no tiene una columna asociada!");
    }

    @Test
    public void testToWhereSql_busqueda_completa() {
        var attrs = List.of(
                new EntityAttribute(CustomPaginable.ALL_TEXT_COLS, "100", FilterTypeEnum.TEXT)
        );
        var pag = new CustomPaginable(1, 10, "RESPONSABLEID", DirectionEnum.DESC, new ArrayList<>(attrs));
        var where = pag.toWhereSql(COLS);

        var expectedSql = "(r.responsable_id LIKE CONCAT('%', :RESPONSABLEID, '%') OR p.documento LIKE CONCAT('%', :PERSONA_NUMDOCUMENTO, '%') "
                + "OR p.nombres LIKE CONCAT('%', :PERSONA_NOMBRES, '%') OR p.tipodoc LIKE CONCAT('%', :PERSONA_TIPODOC, '%'))";
        assertThat(where.sql).isEqualTo(expectedSql);
        assertThat(where.parameters).containsExactlyInAnyOrderEntriesOf(Map.of(
                "RESPONSABLEID", "100",
                "PERSONA_NUMDOCUMENTO", "100",
                "PERSONA_NOMBRES", "100",
                "PERSONA_TIPODOC", "100"));
    }

    @Test
    public void testToWhereSql_busqueda_completa_y_condicion() {
        var attrs = List.of(
                new EntityAttribute(CustomPaginable.ALL_TEXT_COLS, "100", FilterTypeEnum.TEXT),
                new EntityAttribute("RESPONSABLEID", "1000", FilterTypeEnum.NUMBER)
        );
        var pag = new CustomPaginable(1, 10, "RESPONSABLEID", DirectionEnum.DESC, new ArrayList<>(attrs));
        var where = pag.toWhereSql(COLS);

        var expectedSql = "(p.documento LIKE CONCAT('%', :PERSONA_NUMDOCUMENTO, '%') "
                + "OR p.nombres LIKE CONCAT('%', :PERSONA_NOMBRES, '%') OR p.tipodoc LIKE CONCAT('%', :PERSONA_TIPODOC, '%'))"
                + " AND r.responsable_id = :RESPONSABLEID";
        assertThat(where.sql).isEqualTo(expectedSql);
        assertThat(where.parameters).containsExactlyInAnyOrderEntriesOf(Map.of(
                "RESPONSABLEID", "1000",
                "PERSONA_NUMDOCUMENTO", "100",
                "PERSONA_NOMBRES", "100",
                "PERSONA_TIPODOC", "100"));
    }

    @Test
    public void testToWhereSql_vacio() {
        var attrs = new ArrayList<EntityAttribute>();
        var pag = new CustomPaginable(1, 10, "RESPONSABLEID", DirectionEnum.DESC, attrs);
        var where = pag.toWhereSql(COLS);

        var expectedSql = "1 = 1";
        assertThat(where.sql).isEqualTo(expectedSql);
        assertThat(where.parameters).isEmpty();
    }

    @Test
    public void testToWhereSql_campo_ordenamiento_invalido() {
        var attrs = new ArrayList<EntityAttribute>();
        var pag = new CustomPaginable(1, 10, "ENTIDAD", DirectionEnum.DESC, attrs);

        var ex = assertThrows(NullPointerException.class, () -> pag.toWhereSql(COLS));
        assertThat(ex.getMessage()).isEqualTo("El campo 'ENTIDAD' no tiene una columna asociada!");
    }

    @Test
    public void testToWhereSql_campo_filtro_invalido() {
        var attrs = List.of(
                new EntityAttribute("ENTIDAD", "ALICORP", FilterTypeEnum.NUMBER)
        );
        var pag = new CustomPaginable(1, 10, "RESPONSABLEID", DirectionEnum.DESC, new ArrayList<>(attrs));

        var ex = assertThrows(NullPointerException.class, () -> pag.toWhereSql(COLS));
        assertThat(ex.getMessage()).isEqualTo("El campo 'ENTIDAD' no tiene una columna asociada!");
    }
}
