package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.RequestStatusEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestStatusSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:21-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class RequestStatusSIAMMapperImpl implements RequestStatusSIAMMapper {

    @Override
    public List<RequestStatusEntity> asRequestStatusEntities(List<RequestStatusSIAMEntity> requestStatusSIAMEntities) {
        if ( requestStatusSIAMEntities == null ) {
            return null;
        }

        List<RequestStatusEntity> list = new ArrayList<RequestStatusEntity>( requestStatusSIAMEntities.size() );
        for ( RequestStatusSIAMEntity requestStatusSIAMEntity : requestStatusSIAMEntities ) {
            list.add( asRequestStatusEntity( requestStatusSIAMEntity ) );
        }

        return list;
    }

    @Override
    public RequestStatusEntity asRequestStatusEntity(RequestStatusSIAMEntity requestStatusSIAMEntity) {
        if ( requestStatusSIAMEntity == null ) {
            return null;
        }

        RequestStatusEntity requestStatusEntity = new RequestStatusEntity();

        requestStatusEntity.setCodigo( requestStatusSIAMEntity.getCodigo() );
        requestStatusEntity.setColorHex( requestStatusSIAMEntity.getColorHex() );
        requestStatusEntity.setEstadoSolicitudId( requestStatusSIAMEntity.getEstadoSolicitudId() );
        requestStatusEntity.setNombre( requestStatusSIAMEntity.getNombre() );

        return requestStatusEntity;
    }
}
