package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.RequestTypeEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestTypeSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:19-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class RequestTypeSIAMMapperImpl implements RequestTypeSIAMMapper {

    @Override
    public List<RequestTypeEntity> asRequestsTypesEntitys(List<RequestTypeSIAMEntity> requestTypeSIAMEntities) {
        if ( requestTypeSIAMEntities == null ) {
            return null;
        }

        List<RequestTypeEntity> list = new ArrayList<RequestTypeEntity>( requestTypeSIAMEntities.size() );
        for ( RequestTypeSIAMEntity requestTypeSIAMEntity : requestTypeSIAMEntities ) {
            list.add( requestTypeSIAMEntityToRequestTypeEntity( requestTypeSIAMEntity ) );
        }

        return list;
    }

    protected RequestTypeEntity requestTypeSIAMEntityToRequestTypeEntity(RequestTypeSIAMEntity requestTypeSIAMEntity) {
        if ( requestTypeSIAMEntity == null ) {
            return null;
        }

        RequestTypeEntity requestTypeEntity = new RequestTypeEntity();

        requestTypeEntity.setNombre( requestTypeSIAMEntity.getNombre() );
        requestTypeEntity.setTipoSolicitudId( requestTypeSIAMEntity.getTipoSolicitudId() );

        return requestTypeEntity;
    }
}
