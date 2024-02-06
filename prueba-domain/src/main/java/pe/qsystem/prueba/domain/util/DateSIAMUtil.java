package pe.qsystem.prueba.domain.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.lang3.time.DateUtils;

public class DateSIAMUtil {

    private static final String DD_MM_YY_HH_MM_SS = "dd/MM/yy HH:mm:ss";
    public static final String FORMATO_DD_MM_YYYY = "dd/MM/yyyy";
    public static final String FORMATO_YYYY_MM_DD = "yyyy-MM-dd";

    public static Date atStartOfDay(Date date) {
        return DateUtils.truncate(date, Calendar.DAY_OF_MONTH);
    }

    public static Date atEndOfDay(Date date) {
        date = DateUtils.setHours(date, 23);
        date = DateUtils.setMinutes(date, 59);
        date = DateUtils.setSeconds(date, 59);
        return date;
    }

    public static String dateToString(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(FORMATO_DD_MM_YYYY);
        return simpleDateFormat.format(date);

    }

    public static String dateHourToString(Date date) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DD_MM_YY_HH_MM_SS);
        return simpleDateFormat.format(date);

    }

    public static Date stringToDate(String stringDate) {
        Date date = null;
        if (stringDate == null) {
            return null;
        }
        try {
            date = new SimpleDateFormat(FORMATO_DD_MM_YYYY).parse(stringDate);
        } catch (ParseException e) {
            throw new RuntimeException("Error al formatear fecha",e);
        }
        return date;
    }

    /**
     * @deprecated No tiene sentido. usar new Date()
     */
    @Deprecated(forRemoval = true)
    public static Date getCurrentDate() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(FORMATO_DD_MM_YYYY);
        Date currentDate = stringToDate(dateTimeFormatter.format(LocalDateTime.now()));
        return currentDate;
    }

    public static String dateToString(Date date, String format) {
        if (date == null) {
            return null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);

    }

    public static Integer getDateDifferenceInMinutes(Date fecha) {
        String dateStart = dateToString(fecha, DD_MM_YY_HH_MM_SS);
        String dateStop = dateToString(new Date(), DD_MM_YY_HH_MM_SS);
        // Custom date format
        SimpleDateFormat format = new SimpleDateFormat(DD_MM_YY_HH_MM_SS);

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Get msec from each, and subtract.
        Long diff = d2.getTime() - d1.getTime();
        Long diffMinutes = diff / (60 * 1000);
        return diffMinutes.intValue();
    }

    public static boolean isDate(String dateString, String format) {
        if (dateString == null) {
            return false;
        }
        try {
            Date date = new SimpleDateFormat(format).parse(dateString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static String formatDateAprovFail(Integer dias) {
        String fechaFin = dateToString(new Date(), FORMATO_YYYY_MM_DD);
        String formatInicio = "";
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -dias);
        formatInicio = dateToString(new Date(cal.getTimeInMillis()), FORMATO_YYYY_MM_DD);
        return formatInicio.concat(",").concat(fechaFin);
    }

    public static Date convertLocalDateToDate(LocalDate localDate) {
        ZoneId systemTimeZone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(systemTimeZone);
        return Date.from(zonedDateTime.toInstant());
    }

}
