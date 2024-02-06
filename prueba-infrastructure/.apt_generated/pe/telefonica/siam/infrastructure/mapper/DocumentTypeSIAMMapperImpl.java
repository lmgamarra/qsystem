package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.DocumentTypeEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.DocumentTypeSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:29-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class DocumentTypeSIAMMapperImpl implements DocumentTypeSIAMMapper {

    @Override
    public DocumentTypeEntity asDocumentTypeEntity(DocumentTypeSIAMEntity documentTypeSIAMEntity) {
        if ( documentTypeSIAMEntity == null ) {
            return null;
        }

        DocumentTypeEntity documentTypeEntity = new DocumentTypeEntity();

        documentTypeEntity.setCaracteresMax( documentTypeSIAMEntity.getCaracteresMax() );
        documentTypeEntity.setCodigo( documentTypeSIAMEntity.getCodigo() );
        documentTypeEntity.setLongitudExacta( documentTypeSIAMEntity.isLongitudExacta() );
        documentTypeEntity.setMascara( documentTypeSIAMEntity.getMascara() );
        documentTypeEntity.setNombre( documentTypeSIAMEntity.getNombre() );
        documentTypeEntity.setRegExp( documentTypeSIAMEntity.getRegExp() );
        documentTypeEntity.setState( documentTypeSIAMEntity.isState() );
        documentTypeEntity.setTipo( documentTypeSIAMEntity.getTipo() );
        documentTypeEntity.setTipoCodificacion( documentTypeSIAMEntity.getTipoCodificacion() );
        documentTypeEntity.setTipoDocumentoId( documentTypeSIAMEntity.getTipoDocumentoId() );

        return documentTypeEntity;
    }

    @Override
    public List<DocumentTypeEntity> asDocumentTypeEntitys(List<DocumentTypeSIAMEntity> documentTypeSIAMEntity) {
        if ( documentTypeSIAMEntity == null ) {
            return null;
        }

        List<DocumentTypeEntity> list = new ArrayList<DocumentTypeEntity>( documentTypeSIAMEntity.size() );
        for ( DocumentTypeSIAMEntity documentTypeSIAMEntity1 : documentTypeSIAMEntity ) {
            list.add( asDocumentTypeEntity( documentTypeSIAMEntity1 ) );
        }

        return list;
    }

    @Override
    public DocumentTypeSIAMEntity asDocumentTypeSIAMEntity(DocumentTypeEntity tipDocumentEntity) {
        if ( tipDocumentEntity == null ) {
            return null;
        }

        DocumentTypeSIAMEntity documentTypeSIAMEntity = new DocumentTypeSIAMEntity();

        documentTypeSIAMEntity.setCaracteresMax( tipDocumentEntity.getCaracteresMax() );
        documentTypeSIAMEntity.setCodigo( tipDocumentEntity.getCodigo() );
        documentTypeSIAMEntity.setLongitudExacta( tipDocumentEntity.isLongitudExacta() );
        documentTypeSIAMEntity.setMascara( tipDocumentEntity.getMascara() );
        documentTypeSIAMEntity.setNombre( tipDocumentEntity.getNombre() );
        documentTypeSIAMEntity.setRegExp( tipDocumentEntity.getRegExp() );
        documentTypeSIAMEntity.setState( tipDocumentEntity.isState() );
        documentTypeSIAMEntity.setTipo( tipDocumentEntity.getTipo() );
        documentTypeSIAMEntity.setTipoCodificacion( tipDocumentEntity.getTipoCodificacion() );
        documentTypeSIAMEntity.setTipoDocumentoId( tipDocumentEntity.getTipoDocumentoId() );

        return documentTypeSIAMEntity;
    }
}
