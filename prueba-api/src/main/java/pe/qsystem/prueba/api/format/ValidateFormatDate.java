package pe.qsystem.prueba.api.format;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.ParseException;
import java.util.Date;
import org.mapstruct.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import pe.qsystem.prueba.domain.util.DateSIAMUtil;

@Component
public class ValidateFormatDate {

	@Qualifier
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.SOURCE)
	public static @interface FormatDateToString {

	}

	@Qualifier
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.SOURCE)
	public static @interface FormatStringToDate {

	}

	@FormatDateToString
	public String formatDateToString(Date date) {
		if (ObjectUtils.isEmpty(date)) {
			return null;
		}
		return DateSIAMUtil.dateToString(date);
	}

	@FormatStringToDate
	public static Date formatStringToDate(String stringDate) throws ParseException {
		if (ObjectUtils.isEmpty(stringDate)) {
			return null;
		}
		return DateSIAMUtil.stringToDate(stringDate);
	}

}
