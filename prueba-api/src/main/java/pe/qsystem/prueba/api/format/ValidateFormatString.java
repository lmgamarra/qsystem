package pe.qsystem.prueba.api.format;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.mapstruct.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
@Component
public class ValidateFormatString {

	@Qualifier
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.SOURCE)
	public static @interface FormatString {
		
	}

	@FormatString
	public static String formatString(String cadena) {
		if (ObjectUtils.isEmpty(cadena)) {
			return null;
		}

		return cadena.trim().toUpperCase();
	}
	
	
	

}
