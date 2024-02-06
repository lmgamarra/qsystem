package pe.telefonica.siam.infrastructure.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.AttachmentsEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.AttachmentsSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:20-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class AttachmentsSIAMMapperImpl implements AttachmentsSIAMMapper {

    @Override
    public AttachmentsEntity asAttachmentsEntity(AttachmentsSIAMEntity attachmentsSIAMEntity) {
        if ( attachmentsSIAMEntity == null ) {
            return null;
        }

        AttachmentsEntity attachmentsEntity = new AttachmentsEntity();

        attachmentsEntity.setAdjuntoId( attachmentsSIAMEntity.getAdjuntoId() );
        attachmentsEntity.setArchivo( attachmentsSIAMEntity.getArchivo() );
        attachmentsEntity.setNombreArchivo( attachmentsSIAMEntity.getNombreArchivo() );
        attachmentsEntity.setReferencia( attachmentsSIAMEntity.getReferencia() );

        return attachmentsEntity;
    }
}
