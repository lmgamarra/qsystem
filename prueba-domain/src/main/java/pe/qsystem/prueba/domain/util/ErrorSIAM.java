package pe.qsystem.prueba.domain.util;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorSIAM {

	private String code;
	private String modulo;
	private String msg;

	public String getMensaje() {

		return this.code.concat(": ").concat(this.msg);

	}

}
