package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.ApplicationEntity;
import pe.telefonica.siam.domain.entity.PoliciesPasswordEntity;
import pe.telefonica.siam.domain.entity.ProfileFunctionalEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ApplicationSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PoliciesPasswordSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ProfileFunctionalSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:20-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class ProfileFunctionalSIAMMapperImpl implements ProfileFunctionalSIAMMapper {

    @Override
    public ProfileFunctionalEntity asProfileFunctionalEntity(ProfileFunctionalSIAMEntity profileFunctionalSIAMEntity) {
        if ( profileFunctionalSIAMEntity == null ) {
            return null;
        }

        ProfileFunctionalEntity profileFunctionalEntity = new ProfileFunctionalEntity();

        profileFunctionalEntity.setAplicacion( applicationSIAMEntityToApplicationEntity( profileFunctionalSIAMEntity.getAplicacion() ) );
        profileFunctionalEntity.setCodigo( profileFunctionalSIAMEntity.getCodigo() );
        profileFunctionalEntity.setNombre( profileFunctionalSIAMEntity.getNombre() );
        profileFunctionalEntity.setPerfilId( profileFunctionalSIAMEntity.getPerfilId() );

        return profileFunctionalEntity;
    }

    @Override
    public List<ProfileFunctionalEntity> asProfileFunctionalEntities(List<ProfileFunctionalSIAMEntity> profileFunctionalSIAMEntities) {
        if ( profileFunctionalSIAMEntities == null ) {
            return null;
        }

        List<ProfileFunctionalEntity> list = new ArrayList<ProfileFunctionalEntity>( profileFunctionalSIAMEntities.size() );
        for ( ProfileFunctionalSIAMEntity profileFunctionalSIAMEntity : profileFunctionalSIAMEntities ) {
            list.add( asProfileFunctionalEntity( profileFunctionalSIAMEntity ) );
        }

        return list;
    }

    @Override
    public List<ProfileFunctionalSIAMEntity> asProfileFunctionalSIAMEntities(List<ProfileFunctionalEntity> profileFunctionalEntities) {
        if ( profileFunctionalEntities == null ) {
            return null;
        }

        List<ProfileFunctionalSIAMEntity> list = new ArrayList<ProfileFunctionalSIAMEntity>( profileFunctionalEntities.size() );
        for ( ProfileFunctionalEntity profileFunctionalEntity : profileFunctionalEntities ) {
            list.add( profileFunctionalEntityToProfileFunctionalSIAMEntity( profileFunctionalEntity ) );
        }

        return list;
    }

    protected PoliciesPasswordEntity policiesPasswordSIAMEntityToPoliciesPasswordEntity(PoliciesPasswordSIAMEntity policiesPasswordSIAMEntity) {
        if ( policiesPasswordSIAMEntity == null ) {
            return null;
        }

        PoliciesPasswordEntity policiesPasswordEntity = new PoliciesPasswordEntity();

        policiesPasswordEntity.setCreatedAt( policiesPasswordSIAMEntity.getCreatedAt() );
        policiesPasswordEntity.setDeleteAt( policiesPasswordSIAMEntity.getDeleteAt() );
        policiesPasswordEntity.setState( policiesPasswordSIAMEntity.isState() );
        policiesPasswordEntity.setUpdateAt( policiesPasswordSIAMEntity.getUpdateAt() );
        policiesPasswordEntity.setUserCreate( policiesPasswordSIAMEntity.getUserCreate() );
        policiesPasswordEntity.setUserDelete( policiesPasswordSIAMEntity.getUserDelete() );
        policiesPasswordEntity.setUserUpdate( policiesPasswordSIAMEntity.getUserUpdate() );

        return policiesPasswordEntity;
    }

    protected ApplicationEntity applicationSIAMEntityToApplicationEntity(ApplicationSIAMEntity applicationSIAMEntity) {
        if ( applicationSIAMEntity == null ) {
            return null;
        }

        ApplicationEntity applicationEntity = new ApplicationEntity();

        applicationEntity.setCreatedAt( applicationSIAMEntity.getCreatedAt() );
        applicationEntity.setDeleteAt( applicationSIAMEntity.getDeleteAt() );
        applicationEntity.setState( applicationSIAMEntity.isState() );
        applicationEntity.setUpdateAt( applicationSIAMEntity.getUpdateAt() );
        applicationEntity.setUserCreate( applicationSIAMEntity.getUserCreate() );
        applicationEntity.setUserDelete( applicationSIAMEntity.getUserDelete() );
        applicationEntity.setUserUpdate( applicationSIAMEntity.getUserUpdate() );
        applicationEntity.setAplicacionId( applicationSIAMEntity.getAplicacionId() );
        applicationEntity.setCodigo( applicationSIAMEntity.getCodigo() );
        applicationEntity.setPoliticaContrasena( policiesPasswordSIAMEntityToPoliciesPasswordEntity( applicationSIAMEntity.getPoliticaContrasena() ) );

        return applicationEntity;
    }

    protected PoliciesPasswordSIAMEntity policiesPasswordEntityToPoliciesPasswordSIAMEntity(PoliciesPasswordEntity policiesPasswordEntity) {
        if ( policiesPasswordEntity == null ) {
            return null;
        }

        PoliciesPasswordSIAMEntity policiesPasswordSIAMEntity = new PoliciesPasswordSIAMEntity();

        policiesPasswordSIAMEntity.setCreatedAt( policiesPasswordEntity.getCreatedAt() );
        policiesPasswordSIAMEntity.setDeleteAt( policiesPasswordEntity.getDeleteAt() );
        policiesPasswordSIAMEntity.setState( policiesPasswordEntity.isState() );
        policiesPasswordSIAMEntity.setUpdateAt( policiesPasswordEntity.getUpdateAt() );
        policiesPasswordSIAMEntity.setUserCreate( policiesPasswordEntity.getUserCreate() );
        policiesPasswordSIAMEntity.setUserDelete( policiesPasswordEntity.getUserDelete() );
        policiesPasswordSIAMEntity.setUserUpdate( policiesPasswordEntity.getUserUpdate() );

        return policiesPasswordSIAMEntity;
    }

    protected ApplicationSIAMEntity applicationEntityToApplicationSIAMEntity(ApplicationEntity applicationEntity) {
        if ( applicationEntity == null ) {
            return null;
        }

        ApplicationSIAMEntity applicationSIAMEntity = new ApplicationSIAMEntity();

        applicationSIAMEntity.setCreatedAt( applicationEntity.getCreatedAt() );
        applicationSIAMEntity.setDeleteAt( applicationEntity.getDeleteAt() );
        applicationSIAMEntity.setState( applicationEntity.isState() );
        applicationSIAMEntity.setUpdateAt( applicationEntity.getUpdateAt() );
        applicationSIAMEntity.setUserCreate( applicationEntity.getUserCreate() );
        applicationSIAMEntity.setUserDelete( applicationEntity.getUserDelete() );
        applicationSIAMEntity.setUserUpdate( applicationEntity.getUserUpdate() );
        applicationSIAMEntity.setAplicacionId( applicationEntity.getAplicacionId() );
        applicationSIAMEntity.setCodigo( applicationEntity.getCodigo() );
        applicationSIAMEntity.setPoliticaContrasena( policiesPasswordEntityToPoliciesPasswordSIAMEntity( applicationEntity.getPoliticaContrasena() ) );

        return applicationSIAMEntity;
    }

    protected ProfileFunctionalSIAMEntity profileFunctionalEntityToProfileFunctionalSIAMEntity(ProfileFunctionalEntity profileFunctionalEntity) {
        if ( profileFunctionalEntity == null ) {
            return null;
        }

        ProfileFunctionalSIAMEntity profileFunctionalSIAMEntity = new ProfileFunctionalSIAMEntity();

        profileFunctionalSIAMEntity.setAplicacion( applicationEntityToApplicationSIAMEntity( profileFunctionalEntity.getAplicacion() ) );
        profileFunctionalSIAMEntity.setCodigo( profileFunctionalEntity.getCodigo() );
        profileFunctionalSIAMEntity.setNombre( profileFunctionalEntity.getNombre() );
        profileFunctionalSIAMEntity.setPerfilId( profileFunctionalEntity.getPerfilId() );

        return profileFunctionalSIAMEntity;
    }
}
