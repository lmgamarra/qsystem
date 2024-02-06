package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.ApplicationEntity;
import pe.telefonica.siam.domain.entity.PoliciesPasswordEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ApplicationSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PoliciesPasswordSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:19-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class ApplicationSIAMMapperImpl implements ApplicationSIAMMapper {

    @Override
    public ApplicationEntity asApplicationEntity(ApplicationSIAMEntity applicationSIAMEntity) {
        if ( applicationSIAMEntity == null ) {
            return null;
        }

        ApplicationEntity applicationEntity = new ApplicationEntity();

        applicationEntity.setPoliticaContrasena( policiesPasswordSIAMEntityToPoliciesPasswordEntity( applicationSIAMEntity.getPoliticaContrasena() ) );
        applicationEntity.setNombreAplicacion( applicationSIAMEntity.getName() );
        applicationEntity.setPoliticaContrasenaId( applicationSIAMEntityPoliticaContrasenaPolicyPasswordId( applicationSIAMEntity ) );
        applicationEntity.setCreatedAt( applicationSIAMEntity.getCreatedAt() );
        applicationEntity.setDeleteAt( applicationSIAMEntity.getDeleteAt() );
        applicationEntity.setState( applicationSIAMEntity.isState() );
        applicationEntity.setUpdateAt( applicationSIAMEntity.getUpdateAt() );
        applicationEntity.setUserCreate( applicationSIAMEntity.getUserCreate() );
        applicationEntity.setUserDelete( applicationSIAMEntity.getUserDelete() );
        applicationEntity.setUserUpdate( applicationSIAMEntity.getUserUpdate() );
        applicationEntity.setAplicacionId( applicationSIAMEntity.getAplicacionId() );
        applicationEntity.setCodigo( applicationSIAMEntity.getCodigo() );

        return applicationEntity;
    }

    @Override
    public List<ApplicationEntity> asApplicationEntitys(List<ApplicationSIAMEntity> applicationSIAMEntity) {
        if ( applicationSIAMEntity == null ) {
            return null;
        }

        List<ApplicationEntity> list = new ArrayList<ApplicationEntity>( applicationSIAMEntity.size() );
        for ( ApplicationSIAMEntity applicationSIAMEntity1 : applicationSIAMEntity ) {
            list.add( asApplicationEntity( applicationSIAMEntity1 ) );
        }

        return list;
    }

    @Override
    public ApplicationSIAMEntity asApplicationSIAMEntity(ApplicationEntity applicationEntity) {
        if ( applicationEntity == null ) {
            return null;
        }

        ApplicationSIAMEntity applicationSIAMEntity = new ApplicationSIAMEntity();

        if ( applicationEntity.getPoliticaContrasena() != null ) {
            if ( applicationSIAMEntity.getPoliticaContrasena() == null ) {
                applicationSIAMEntity.setPoliticaContrasena( new PoliciesPasswordSIAMEntity() );
            }
            policiesPasswordEntityToPoliciesPasswordSIAMEntity( applicationEntity.getPoliticaContrasena(), applicationSIAMEntity.getPoliticaContrasena() );
        }
        if ( applicationSIAMEntity.getPoliticaContrasena() == null ) {
            applicationSIAMEntity.setPoliticaContrasena( new PoliciesPasswordSIAMEntity() );
        }
        applicationEntityToPoliciesPasswordSIAMEntity( applicationEntity, applicationSIAMEntity.getPoliticaContrasena() );
        applicationSIAMEntity.setCreatedAt( applicationEntity.getCreatedAt() );
        applicationSIAMEntity.setDeleteAt( applicationEntity.getDeleteAt() );
        applicationSIAMEntity.setState( applicationEntity.isState() );
        applicationSIAMEntity.setUpdateAt( applicationEntity.getUpdateAt() );
        applicationSIAMEntity.setUserCreate( applicationEntity.getUserCreate() );
        applicationSIAMEntity.setUserDelete( applicationEntity.getUserDelete() );
        applicationSIAMEntity.setUserUpdate( applicationEntity.getUserUpdate() );
        applicationSIAMEntity.setAplicacionId( applicationEntity.getAplicacionId() );
        applicationSIAMEntity.setCodigo( applicationEntity.getCodigo() );

        return applicationSIAMEntity;
    }

    protected PoliciesPasswordEntity policiesPasswordSIAMEntityToPoliciesPasswordEntity(PoliciesPasswordSIAMEntity policiesPasswordSIAMEntity) {
        if ( policiesPasswordSIAMEntity == null ) {
            return null;
        }

        PoliciesPasswordEntity policiesPasswordEntity = new PoliciesPasswordEntity();

        policiesPasswordEntity.setNombrePolitica( policiesPasswordSIAMEntity.getPolicyName() );
        policiesPasswordEntity.setIniciaMayuscula( policiesPasswordSIAMEntity.getStartUpperCase() );
        policiesPasswordEntity.setSoloMinuscula( policiesPasswordSIAMEntity.getOnlyLowercase() );
        policiesPasswordEntity.setCaracteresMinimos( policiesPasswordSIAMEntity.getMinLenght() );
        policiesPasswordEntity.setCaracteresMaximos( policiesPasswordSIAMEntity.getMax_lenght() );
        policiesPasswordEntity.setContieneMinuscula( policiesPasswordSIAMEntity.getContainLowerCase() );
        policiesPasswordEntity.setContieneMayuscula( policiesPasswordSIAMEntity.getContainUpperCase() );
        policiesPasswordEntity.setContieneNumero( policiesPasswordSIAMEntity.getContainNumber() );
        policiesPasswordEntity.setContieneCaracteresEspeciales( policiesPasswordSIAMEntity.getContainSpecialCharacters() );
        policiesPasswordEntity.setMapaCaracteres( policiesPasswordSIAMEntity.getCharactersMapper() );
        policiesPasswordEntity.setContieneNombreUsuario( policiesPasswordSIAMEntity.getContainUsername() );
        policiesPasswordEntity.setContieneNombreUsuarioInverso( policiesPasswordSIAMEntity.getContainUsernameInverse() );
        policiesPasswordEntity.setNombres( policiesPasswordSIAMEntity.getNames() );
        policiesPasswordEntity.setApellidos( policiesPasswordSIAMEntity.getLastNames() );
        policiesPasswordEntity.setNumeroDocumento( policiesPasswordSIAMEntity.getDocumentNumber() );
        policiesPasswordEntity.setCreatedAt( policiesPasswordSIAMEntity.getCreatedAt() );
        policiesPasswordEntity.setDeleteAt( policiesPasswordSIAMEntity.getDeleteAt() );
        policiesPasswordEntity.setState( policiesPasswordSIAMEntity.isState() );
        policiesPasswordEntity.setUpdateAt( policiesPasswordSIAMEntity.getUpdateAt() );
        policiesPasswordEntity.setUserCreate( policiesPasswordSIAMEntity.getUserCreate() );
        policiesPasswordEntity.setUserDelete( policiesPasswordSIAMEntity.getUserDelete() );
        policiesPasswordEntity.setUserUpdate( policiesPasswordSIAMEntity.getUserUpdate() );

        return policiesPasswordEntity;
    }

    private Integer applicationSIAMEntityPoliticaContrasenaPolicyPasswordId(ApplicationSIAMEntity applicationSIAMEntity) {
        if ( applicationSIAMEntity == null ) {
            return null;
        }
        PoliciesPasswordSIAMEntity politicaContrasena = applicationSIAMEntity.getPoliticaContrasena();
        if ( politicaContrasena == null ) {
            return null;
        }
        Integer policyPasswordId = politicaContrasena.getPolicyPasswordId();
        if ( policyPasswordId == null ) {
            return null;
        }
        return policyPasswordId;
    }

    protected void policiesPasswordEntityToPoliciesPasswordSIAMEntity(PoliciesPasswordEntity policiesPasswordEntity, PoliciesPasswordSIAMEntity mappingTarget) {
        if ( policiesPasswordEntity == null ) {
            return;
        }

        mappingTarget.setPolicyName( policiesPasswordEntity.getNombrePolitica() );
        mappingTarget.setStartUpperCase( policiesPasswordEntity.getIniciaMayuscula() );
        mappingTarget.setOnlyLowercase( policiesPasswordEntity.getSoloMinuscula() );
        mappingTarget.setMinLenght( policiesPasswordEntity.getCaracteresMinimos() );
        mappingTarget.setMax_lenght( policiesPasswordEntity.getCaracteresMaximos() );
        mappingTarget.setContainLowerCase( policiesPasswordEntity.getContieneMinuscula() );
        mappingTarget.setContainUpperCase( policiesPasswordEntity.getContieneMayuscula() );
        mappingTarget.setContainNumber( policiesPasswordEntity.getContieneNumero() );
        mappingTarget.setContainSpecialCharacters( policiesPasswordEntity.getContieneCaracteresEspeciales() );
        mappingTarget.setCharactersMapper( policiesPasswordEntity.getMapaCaracteres() );
        mappingTarget.setContainUsername( policiesPasswordEntity.getContieneNombreUsuario() );
        mappingTarget.setContainUsernameInverse( policiesPasswordEntity.getContieneNombreUsuarioInverso() );
        mappingTarget.setNames( policiesPasswordEntity.getNombres() );
        mappingTarget.setLastNames( policiesPasswordEntity.getApellidos() );
        mappingTarget.setDocumentNumber( policiesPasswordEntity.getNumeroDocumento() );
        mappingTarget.setCreatedAt( policiesPasswordEntity.getCreatedAt() );
        mappingTarget.setDeleteAt( policiesPasswordEntity.getDeleteAt() );
        mappingTarget.setState( policiesPasswordEntity.isState() );
        mappingTarget.setUpdateAt( policiesPasswordEntity.getUpdateAt() );
        mappingTarget.setUserCreate( policiesPasswordEntity.getUserCreate() );
        mappingTarget.setUserDelete( policiesPasswordEntity.getUserDelete() );
        mappingTarget.setUserUpdate( policiesPasswordEntity.getUserUpdate() );
    }

    protected void applicationEntityToPoliciesPasswordSIAMEntity(ApplicationEntity applicationEntity, PoliciesPasswordSIAMEntity mappingTarget) {
        if ( applicationEntity == null ) {
            return;
        }

        mappingTarget.setPolicyPasswordId( applicationEntity.getPoliticaContrasenaId() );
    }
}
