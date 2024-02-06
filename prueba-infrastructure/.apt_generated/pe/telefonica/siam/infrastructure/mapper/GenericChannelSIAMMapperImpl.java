package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.GenericChannelEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.GenericChannelSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:23-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class GenericChannelSIAMMapperImpl implements GenericChannelSIAMMapper {

    @Override
    public GenericChannelEntity asGenericChannelEntity(GenericChannelSIAMEntity genericChannelSIAMEntity) {
        if ( genericChannelSIAMEntity == null ) {
            return null;
        }

        GenericChannelEntity genericChannelEntity = new GenericChannelEntity();

        genericChannelEntity.setCreatedAt( genericChannelSIAMEntity.getCreatedAt() );
        genericChannelEntity.setDeleteAt( genericChannelSIAMEntity.getDeleteAt() );
        genericChannelEntity.setState( genericChannelSIAMEntity.isState() );
        genericChannelEntity.setUpdateAt( genericChannelSIAMEntity.getUpdateAt() );
        genericChannelEntity.setUserCreate( genericChannelSIAMEntity.getUserCreate() );
        genericChannelEntity.setUserDelete( genericChannelSIAMEntity.getUserDelete() );
        genericChannelEntity.setUserUpdate( genericChannelSIAMEntity.getUserUpdate() );
        genericChannelEntity.setCanalGenericoId( genericChannelSIAMEntity.getCanalGenericoId() );
        genericChannelEntity.setNombre( genericChannelSIAMEntity.getNombre() );

        return genericChannelEntity;
    }

    @Override
    public GenericChannelSIAMEntity asGenericChannelSIAMEntity(GenericChannelEntity genericChannelEntity) {
        if ( genericChannelEntity == null ) {
            return null;
        }

        GenericChannelSIAMEntity genericChannelSIAMEntity = new GenericChannelSIAMEntity();

        genericChannelSIAMEntity.setCreatedAt( genericChannelEntity.getCreatedAt() );
        genericChannelSIAMEntity.setDeleteAt( genericChannelEntity.getDeleteAt() );
        genericChannelSIAMEntity.setState( genericChannelEntity.isState() );
        genericChannelSIAMEntity.setUpdateAt( genericChannelEntity.getUpdateAt() );
        genericChannelSIAMEntity.setUserCreate( genericChannelEntity.getUserCreate() );
        genericChannelSIAMEntity.setUserDelete( genericChannelEntity.getUserDelete() );
        genericChannelSIAMEntity.setUserUpdate( genericChannelEntity.getUserUpdate() );
        genericChannelSIAMEntity.setCanalGenericoId( genericChannelEntity.getCanalGenericoId() );
        genericChannelSIAMEntity.setNombre( genericChannelEntity.getNombre() );

        return genericChannelSIAMEntity;
    }

    @Override
    public List<GenericChannelEntity> asGenericChannelEntities(List<GenericChannelSIAMEntity> genericChannelSIAMEntities) {
        if ( genericChannelSIAMEntities == null ) {
            return null;
        }

        List<GenericChannelEntity> list = new ArrayList<GenericChannelEntity>( genericChannelSIAMEntities.size() );
        for ( GenericChannelSIAMEntity genericChannelSIAMEntity : genericChannelSIAMEntities ) {
            list.add( asGenericChannelEntity( genericChannelSIAMEntity ) );
        }

        return list;
    }
}
