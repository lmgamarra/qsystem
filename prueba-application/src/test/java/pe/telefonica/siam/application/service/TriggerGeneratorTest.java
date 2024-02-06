package pe.telefonica.siam.application.service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.quartz.TriggerKey;
import static org.quartz.TriggerUtils.*;
import org.quartz.spi.OperableTrigger;
import static pe.telefonica.siam.application.service.TriggerGenerator.*;
import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Nestor Hernandez Loli
 */
public class TriggerGeneratorTest {

    @Test
    public void test_frecuencia_diaria() {
        var fecha = LocalDateTime.parse("2021-01-02T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_DAILY, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 15));
        var expectedDates = datesOf(
                "2021-01-02T08:00",
                "2021-01-03T08:00",
                "2021-01-04T08:00",
                "2021-01-05T08:00",
                "2021-01-06T08:00",
                "2021-01-07T08:00",
                "2021-01-08T08:00",
                "2021-01-09T08:00",
                "2021-01-10T08:00",
                "2021-01-11T08:00",
                "2021-01-12T08:00",
                "2021-01-13T08:00",
                "2021-01-14T08:00",
                "2021-01-15T08:00",
                "2021-01-16T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    @Test
    public void test_frecuencia_semanal() {
        var fecha = LocalDateTime.parse("2021-08-01T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_WEEKLY, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 6));
        var expectedDates = datesOf(
                "2021-08-01T08:00",
                "2021-08-08T08:00",
                "2021-08-15T08:00",
                "2021-08-22T08:00",
                "2021-08-29T08:00",
                "2021-09-05T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    @Test
    public void test_frecuencia_quincenal() {
        var fecha = LocalDateTime.parse("2021-08-01T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_BIWEEKLY, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 4));
        var expectedDates = datesOf(
                "2021-08-01T08:00",
                "2021-08-15T08:00",
                "2021-08-29T08:00",
                "2021-09-12T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    @Test
    public void test_frecuencia_mensual_dia_1() {
        var fecha = LocalDateTime.parse("2021-08-01T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_MONTHLY, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 4));
        var expectedDates = datesOf(
                "2021-08-01T08:00",
                "2021-09-01T08:00",
                "2021-10-01T08:00",
                "2021-11-01T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    @Test
    public void test_frecuencia_mensual_dia_29() {
        var fecha = LocalDateTime.parse("2021-01-29T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_MONTHLY, this::triggerKey);
        assertEquals(2, triggers.size());
        var it = triggers.iterator();
        {
            var actualDates = datesOf(computeFireTimes((OperableTrigger) it.next(), null, 4));
            var expectedDates = datesOf(
                    "2021-01-29T08:00",
                    "2021-03-29T08:00",
                    "2021-04-29T08:00",
                    "2021-05-29T08:00"
            );
            assertThat(actualDates).containsExactlyElementsOf(expectedDates);
        }
        {
            var actualDates = datesOf(computeFireTimes((OperableTrigger) it.next(), null, 3));
            var expectedDates = datesOf(
                    "2021-02-28T08:00",
                    "2022-02-28T08:00",
                    "2023-02-28T08:00"
            );
            assertThat(actualDates).containsExactlyElementsOf(expectedDates);
        }
    }

    @Test
    public void test_frecuencia_mensual_dia_31() {
        var fecha = LocalDateTime.parse("2021-01-31T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_MONTHLY, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 4));
        var expectedDates = datesOf(
                "2021-01-31T08:00",
                "2021-02-28T08:00",
                "2021-03-31T08:00",
                "2021-04-30T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    @Test
    public void test_frecuencia_semestral_1() {
        var fecha = LocalDateTime.parse("2021-01-01T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_BIANNUAL, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 4));
        var expectedDates = datesOf(
                "2021-01-01T08:00",
                "2021-07-01T08:00",
                "2022-01-01T08:00",
                "2022-07-01T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    @Test
    public void test_frecuencia_semestral_2() {
        var fecha = LocalDateTime.parse("2021-03-26T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_BIANNUAL, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 4));
        var expectedDates = datesOf(
                "2021-03-26T08:00",
                "2021-09-26T08:00",
                "2022-03-26T08:00",
                "2022-09-26T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    @Test
    public void test_frecuencia_semestral_dia_29() {
        var fecha = LocalDateTime.parse("2020-02-29T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_BIANNUAL, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 10));
        var expectedDates = datesOf(
                "2020-02-29T08:00",
                "2020-08-31T08:00",
                "2021-02-28T08:00",
                "2021-08-31T08:00",
                "2022-02-28T08:00",
                "2022-08-31T08:00",
                "2023-02-28T08:00",
                "2023-08-31T08:00",
                "2024-02-29T08:00",
                "2024-08-31T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    @Test
    public void test_frecuencia_anual_1() {
        var fecha = LocalDateTime.parse("2020-02-01T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_ANNUAL, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 5));
        var expectedDates = datesOf(
                "2020-02-01T08:00",
                "2021-02-01T08:00",
                "2022-02-01T08:00",
                "2023-02-01T08:00",
                "2024-02-01T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    @Test
    public void test_frecuencia_anual_dia_29() {
        var fecha = LocalDateTime.parse("2020-02-29T08:00");
        var triggers = generateByFrequency(fecha, FREQUENCY_ANNUAL, this::triggerKey);
        assertEquals(1, triggers.size());
        var actualDates = datesOf(computeFireTimes((OperableTrigger) triggers.iterator().next(), null, 5));
        var expectedDates = datesOf(
                "2020-02-29T08:00",
                "2021-02-28T08:00",
                "2022-02-28T08:00",
                "2023-02-28T08:00",
                "2024-02-29T08:00"
        );
        assertThat(actualDates).containsExactlyElementsOf(expectedDates);
    }

    private List<LocalDateTime> datesOf(String... dates) {
        return Arrays.stream(dates).map(LocalDateTime::parse).collect(toList());
    }

    private List<LocalDateTime> datesOf(List<Date> dates) {
        return dates.stream().map(this::toLocalDateTime).collect(toList());
    }

    private LocalDateTime toLocalDateTime(Date date) {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    private TriggerKey triggerKey(int index) {
        return new TriggerKey("TRIGGER|" + index);
    }
}
