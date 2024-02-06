package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.ProfileEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ProfileSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:30-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class ProfileSIAMMapperImpl implements ProfileSIAMMapper {

    @Override
    public ProfileEntity asProfileEntity(ProfileSIAMEntity profileSIAMEntity) {
        if ( profileSIAMEntity == null ) {
            return null;
        }

        ProfileEntity profileEntity = new ProfileEntity();

        profileEntity.setNombrePerfil( profileSIAMEntity.getName() );
        profileEntity.setModulos( ProfileSIAMMapper.asModule( profileSIAMEntity.getRoles() ) );
        profileEntity.setCreatedAt( profileSIAMEntity.getCreatedAt() );
        profileEntity.setDeleteAt( profileSIAMEntity.getDeleteAt() );
        profileEntity.setState( profileSIAMEntity.isState() );
        profileEntity.setUpdateAt( profileSIAMEntity.getUpdateAt() );
        profileEntity.setUserCreate( profileSIAMEntity.getUserCreate() );
        profileEntity.setUserDelete( profileSIAMEntity.getUserDelete() );
        profileEntity.setUserUpdate( profileSIAMEntity.getUserUpdate() );
        profileEntity.setIpUsuarioActualiza( profileSIAMEntity.getIpUsuarioActualiza() );
        profileEntity.setIpUsuarioCreacion( profileSIAMEntity.getIpUsuarioCreacion() );
        profileEntity.setIpUsuarioElimina( profileSIAMEntity.getIpUsuarioElimina() );
        profileEntity.setPerfilId( profileSIAMEntity.getPerfilId() );

        return profileEntity;
    }

    @Override
    public List<ProfileEntity> asProfileEntitys(List<ProfileSIAMEntity> profileSIAMEntity) {
        if ( profileSIAMEntity == null ) {
            return null;
        }

        List<ProfileEntity> list = new ArrayList<ProfileEntity>( profileSIAMEntity.size() );
        for ( ProfileSIAMEntity profileSIAMEntity1 : profileSIAMEntity ) {
            list.add( asProfileEntity( profileSIAMEntity1 ) );
        }

        return list;
    }

    @Override
    public ProfileSIAMEntity asProfileSIAMEntity(ProfileEntity profileEntity) {
        if ( profileEntity == null ) {
            return null;
        }

        ProfileSIAMEntity profileSIAMEntity = new ProfileSIAMEntity();

        profileSIAMEntity.setName( profileEntity.getNombrePerfil() );
        profileSIAMEntity.setRoles( ProfileSIAMMapper.asRole( profileEntity.getModulos() ) );
        profileSIAMEntity.setCreatedAt( profileEntity.getCreatedAt() );
        profileSIAMEntity.setDeleteAt( profileEntity.getDeleteAt() );
        profileSIAMEntity.setState( profileEntity.isState() );
        profileSIAMEntity.setUpdateAt( profileEntity.getUpdateAt() );
        profileSIAMEntity.setUserCreate( profileEntity.getUserCreate() );
        profileSIAMEntity.setUserDelete( profileEntity.getUserDelete() );
        profileSIAMEntity.setUserUpdate( profileEntity.getUserUpdate() );
        profileSIAMEntity.setIpUsuarioActualiza( profileEntity.getIpUsuarioActualiza() );
        profileSIAMEntity.setIpUsuarioCreacion( profileEntity.getIpUsuarioCreacion() );
        profileSIAMEntity.setIpUsuarioElimina( profileEntity.getIpUsuarioElimina() );
        profileSIAMEntity.setPerfilId( profileEntity.getPerfilId() );

        return profileSIAMEntity;
    }
}
