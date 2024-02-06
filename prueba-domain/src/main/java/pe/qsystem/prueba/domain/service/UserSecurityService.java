package pe.qsystem.prueba.domain.service;

import java.util.List;

import pe.qsystem.prueba.domain.entity.UserSecurityEntity;
import pe.qsystem.prueba.domain.enums.UserSecurityPageableActiveEnum;

public interface UserSecurityService extends CrudService<UserSecurityEntity, Integer,UserSecurityPageableActiveEnum> {
	
	UserSecurityEntity findByDocument(Integer tipoDocumentoId, String numDocumento);
	
	public List<UserSecurityEntity> encontrarGestorSocioFranquiciaCesados(Integer perfilId, Integer empresaId, Integer entidadId);
	
	void updatePasswordInitial(Integer usuarioId, String password);
	
	void notifyByEmailPasswordChange();
	
	void notifyByEmailExpiredPassword();
	
	void LockUsersNotUsingSIAM();
	
	void delete(Integer id,String ip);
	
	boolean isBloqueado(Integer usuarioId);
	
	boolean isState(Integer usuarioId);

	String getHashUsuario(String usuario);
}