package pe.telefonica.siam.infrastructure.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.PoliciesPasswordEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PoliciesPasswordSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:21-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class PoliciesPasswordSIAMMapperImpl implements PoliciesPasswordSIAMMapper {

    @Override
    public PoliciesPasswordEntity asPoliciesPasswordEntity(PoliciesPasswordSIAMEntity policiesPasswordSIAMEntity) {
        if ( policiesPasswordSIAMEntity == null ) {
            return null;
        }

        PoliciesPasswordEntity policiesPasswordEntity = new PoliciesPasswordEntity();

        policiesPasswordEntity.setPoliticaContrasenaId( policiesPasswordSIAMEntity.getPolicyPasswordId() );
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

    @Override
    public PoliciesPasswordSIAMEntity asPoliciesPasswordSIAMEntity(PoliciesPasswordEntity policiesPasswordEntity) {
        if ( policiesPasswordEntity == null ) {
            return null;
        }

        PoliciesPasswordSIAMEntity policiesPasswordSIAMEntity = new PoliciesPasswordSIAMEntity();

        policiesPasswordSIAMEntity.setPolicyPasswordId( policiesPasswordEntity.getPoliticaContrasenaId() );
        policiesPasswordSIAMEntity.setPolicyName( policiesPasswordEntity.getNombrePolitica() );
        policiesPasswordSIAMEntity.setStartUpperCase( policiesPasswordEntity.getIniciaMayuscula() );
        policiesPasswordSIAMEntity.setOnlyLowercase( policiesPasswordEntity.getSoloMinuscula() );
        policiesPasswordSIAMEntity.setMinLenght( policiesPasswordEntity.getCaracteresMinimos() );
        policiesPasswordSIAMEntity.setMax_lenght( policiesPasswordEntity.getCaracteresMaximos() );
        policiesPasswordSIAMEntity.setContainLowerCase( policiesPasswordEntity.getContieneMinuscula() );
        policiesPasswordSIAMEntity.setContainUpperCase( policiesPasswordEntity.getContieneMayuscula() );
        policiesPasswordSIAMEntity.setContainNumber( policiesPasswordEntity.getContieneNumero() );
        policiesPasswordSIAMEntity.setContainSpecialCharacters( policiesPasswordEntity.getContieneCaracteresEspeciales() );
        policiesPasswordSIAMEntity.setCharactersMapper( policiesPasswordEntity.getMapaCaracteres() );
        policiesPasswordSIAMEntity.setContainUsername( policiesPasswordEntity.getContieneNombreUsuario() );
        policiesPasswordSIAMEntity.setContainUsernameInverse( policiesPasswordEntity.getContieneNombreUsuarioInverso() );
        policiesPasswordSIAMEntity.setNames( policiesPasswordEntity.getNombres() );
        policiesPasswordSIAMEntity.setLastNames( policiesPasswordEntity.getApellidos() );
        policiesPasswordSIAMEntity.setDocumentNumber( policiesPasswordEntity.getNumeroDocumento() );
        policiesPasswordSIAMEntity.setCreatedAt( policiesPasswordEntity.getCreatedAt() );
        policiesPasswordSIAMEntity.setDeleteAt( policiesPasswordEntity.getDeleteAt() );
        policiesPasswordSIAMEntity.setState( policiesPasswordEntity.isState() );
        policiesPasswordSIAMEntity.setUpdateAt( policiesPasswordEntity.getUpdateAt() );
        policiesPasswordSIAMEntity.setUserCreate( policiesPasswordEntity.getUserCreate() );
        policiesPasswordSIAMEntity.setUserDelete( policiesPasswordEntity.getUserDelete() );
        policiesPasswordSIAMEntity.setUserUpdate( policiesPasswordEntity.getUserUpdate() );

        return policiesPasswordSIAMEntity;
    }
}
