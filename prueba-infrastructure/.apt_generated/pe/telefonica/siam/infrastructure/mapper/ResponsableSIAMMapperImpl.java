package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.AmdocsChannelEntity;
import pe.telefonica.siam.domain.entity.ChannelEntity;
import pe.telefonica.siam.domain.entity.CommercialChannelEntity;
import pe.telefonica.siam.domain.entity.DocumentTypeEntity;
import pe.telefonica.siam.domain.entity.GenericChannelEntity;
import pe.telefonica.siam.domain.entity.PersonEntity;
import pe.telefonica.siam.domain.entity.ResponsableEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.AmdocsChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.DocumentTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.GenericChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PersonSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ResponsableSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:19-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class ResponsableSIAMMapperImpl implements ResponsableSIAMMapper {

    @Override
    public List<ResponsableEntity> asResponsableEntitys(List<ResponsableSIAMEntity> responsableSIAMEntities) {
        if ( responsableSIAMEntities == null ) {
            return null;
        }

        List<ResponsableEntity> list = new ArrayList<ResponsableEntity>( responsableSIAMEntities.size() );
        for ( ResponsableSIAMEntity responsableSIAMEntity : responsableSIAMEntities ) {
            list.add( asResponsableEntity( responsableSIAMEntity ) );
        }

        return list;
    }

    @Override
    public ResponsableSIAMEntity asResponsableSIAMEntity(ResponsableEntity responsableEntity) {
        if ( responsableEntity == null ) {
            return null;
        }

        ResponsableSIAMEntity responsableSIAMEntity = new ResponsableSIAMEntity();

        responsableSIAMEntity.setCanal( channelEntityToChannelSIAMEntity( responsableEntity.getCanal() ) );
        responsableSIAMEntity.setCargo( responsableEntity.getCargo() );
        responsableSIAMEntity.setCip( responsableEntity.getCip() );
        responsableSIAMEntity.setDireccion( responsableEntity.getDireccion() );
        responsableSIAMEntity.setGerencia( responsableEntity.getGerencia() );
        responsableSIAMEntity.setResponsableId( responsableEntity.getResponsableId() );
        responsableSIAMEntity.setSustento( responsableEntity.getSustento() );
        responsableSIAMEntity.setTicketRemedy( responsableEntity.getTicketRemedy() );
        responsableSIAMEntity.setTipo( responsableEntity.getTipo() );

        return responsableSIAMEntity;
    }

    @Override
    public ResponsableEntity asResponsableEntity(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }

        ResponsableEntity responsableEntity = new ResponsableEntity();

        responsableEntity.setCanal( channelSIAMEntityToChannelEntity( responsableSIAMEntity.getCanal() ) );
        responsableEntity.setCargo( responsableSIAMEntity.getCargo() );
        responsableEntity.setCip( responsableSIAMEntity.getCip() );
        responsableEntity.setDireccion( responsableSIAMEntity.getDireccion() );
        responsableEntity.setGerencia( responsableSIAMEntity.getGerencia() );
        responsableEntity.setResponsableId( responsableSIAMEntity.getResponsableId() );
        responsableEntity.setSustento( responsableSIAMEntity.getSustento() );
        responsableEntity.setTicketRemedy( responsableSIAMEntity.getTicketRemedy() );
        responsableEntity.setTipo( responsableSIAMEntity.getTipo() );

        return responsableEntity;
    }

    @Override
    public List<PersonEntity> asPersonEntities(List<ResponsableSIAMEntity> responsableSIAMEntities) {
        if ( responsableSIAMEntities == null ) {
            return null;
        }

        List<PersonEntity> list = new ArrayList<PersonEntity>( responsableSIAMEntities.size() );
        for ( ResponsableSIAMEntity responsableSIAMEntity : responsableSIAMEntities ) {
            list.add( asPersonEntity( responsableSIAMEntity ) );
        }

        return list;
    }

    @Override
    public PersonEntity asPersonEntity(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setResponsable( responsableSIAMEntityToResponsableEntity( responsableSIAMEntity ) );
        personEntity.setNombres( responsableSIAMEntityPersonaNombres( responsableSIAMEntity ) );
        personEntity.setPaterno( responsableSIAMEntityPersonaPaterno( responsableSIAMEntity ) );
        personEntity.setMaterno( responsableSIAMEntityPersonaMaterno( responsableSIAMEntity ) );
        personEntity.setPersonaId( responsableSIAMEntityPersonaPersonaId( responsableSIAMEntity ) );
        personEntity.setNumDocumento( responsableSIAMEntityPersonaNumDocumento( responsableSIAMEntity ) );
        personEntity.setTipoDocumento( documentTypeSIAMEntityToDocumentTypeEntity( responsableSIAMEntityPersonaTipoDocumento( responsableSIAMEntity ) ) );
        personEntity.setCelular( responsableSIAMEntityPersonaCelular( responsableSIAMEntity ) );
        personEntity.setEmail( responsableSIAMEntityPersonaUsername( responsableSIAMEntity ) );
        personEntity.setCreatedAt( responsableSIAMEntity.getCreatedAt() );
        personEntity.setDeleteAt( responsableSIAMEntity.getDeleteAt() );
        personEntity.setState( responsableSIAMEntity.isState() );
        personEntity.setUpdateAt( responsableSIAMEntity.getUpdateAt() );
        personEntity.setUserCreate( responsableSIAMEntity.getUserCreate() );
        personEntity.setUserDelete( responsableSIAMEntity.getUserDelete() );
        personEntity.setUserUpdate( responsableSIAMEntity.getUserUpdate() );

        return personEntity;
    }

    protected AmdocsChannelSIAMEntity amdocsChannelEntityToAmdocsChannelSIAMEntity(AmdocsChannelEntity amdocsChannelEntity) {
        if ( amdocsChannelEntity == null ) {
            return null;
        }

        AmdocsChannelSIAMEntity amdocsChannelSIAMEntity = new AmdocsChannelSIAMEntity();

        amdocsChannelSIAMEntity.setCreatedAt( amdocsChannelEntity.getCreatedAt() );
        amdocsChannelSIAMEntity.setDeleteAt( amdocsChannelEntity.getDeleteAt() );
        amdocsChannelSIAMEntity.setState( amdocsChannelEntity.isState() );
        amdocsChannelSIAMEntity.setUpdateAt( amdocsChannelEntity.getUpdateAt() );
        amdocsChannelSIAMEntity.setUserCreate( amdocsChannelEntity.getUserCreate() );
        amdocsChannelSIAMEntity.setUserDelete( amdocsChannelEntity.getUserDelete() );
        amdocsChannelSIAMEntity.setUserUpdate( amdocsChannelEntity.getUserUpdate() );
        amdocsChannelSIAMEntity.setCanalAmdocsCod( amdocsChannelEntity.getCanalAmdocsCod() );
        amdocsChannelSIAMEntity.setCanalAmdocsId( amdocsChannelEntity.getCanalAmdocsId() );
        amdocsChannelSIAMEntity.setDescripcionIngles( amdocsChannelEntity.getDescripcionIngles() );
        amdocsChannelSIAMEntity.setNombre( amdocsChannelEntity.getNombre() );

        return amdocsChannelSIAMEntity;
    }

    protected CommercialChannelSIAMEntity commercialChannelEntityToCommercialChannelSIAMEntity(CommercialChannelEntity commercialChannelEntity) {
        if ( commercialChannelEntity == null ) {
            return null;
        }

        CommercialChannelSIAMEntity commercialChannelSIAMEntity = new CommercialChannelSIAMEntity();

        commercialChannelSIAMEntity.setCreatedAt( commercialChannelEntity.getCreatedAt() );
        commercialChannelSIAMEntity.setDeleteAt( commercialChannelEntity.getDeleteAt() );
        commercialChannelSIAMEntity.setState( commercialChannelEntity.isState() );
        commercialChannelSIAMEntity.setUpdateAt( commercialChannelEntity.getUpdateAt() );
        commercialChannelSIAMEntity.setUserCreate( commercialChannelEntity.getUserCreate() );
        commercialChannelSIAMEntity.setUserDelete( commercialChannelEntity.getUserDelete() );
        commercialChannelSIAMEntity.setUserUpdate( commercialChannelEntity.getUserUpdate() );
        commercialChannelSIAMEntity.setCanalAmdocs( amdocsChannelEntityToAmdocsChannelSIAMEntity( commercialChannelEntity.getCanalAmdocs() ) );
        commercialChannelSIAMEntity.setCanalComercialCod( commercialChannelEntity.getCanalComercialCod() );
        commercialChannelSIAMEntity.setCanalComercialId( commercialChannelEntity.getCanalComercialId() );
        commercialChannelSIAMEntity.setCodigoAtis( commercialChannelEntity.getCodigoAtis() );
        commercialChannelSIAMEntity.setNombre( commercialChannelEntity.getNombre() );

        return commercialChannelSIAMEntity;
    }

    protected GenericChannelSIAMEntity genericChannelEntityToGenericChannelSIAMEntity(GenericChannelEntity genericChannelEntity) {
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

    protected ChannelSIAMEntity channelEntityToChannelSIAMEntity(ChannelEntity channelEntity) {
        if ( channelEntity == null ) {
            return null;
        }

        ChannelSIAMEntity channelSIAMEntity = new ChannelSIAMEntity();

        channelSIAMEntity.setCanalComercial( commercialChannelEntityToCommercialChannelSIAMEntity( channelEntity.getCanalComercial() ) );
        channelSIAMEntity.setCanalGenerico( genericChannelEntityToGenericChannelSIAMEntity( channelEntity.getCanalGenerico() ) );
        channelSIAMEntity.setCanalId( channelEntity.getCanalId() );

        return channelSIAMEntity;
    }

    protected AmdocsChannelEntity amdocsChannelSIAMEntityToAmdocsChannelEntity(AmdocsChannelSIAMEntity amdocsChannelSIAMEntity) {
        if ( amdocsChannelSIAMEntity == null ) {
            return null;
        }

        AmdocsChannelEntity amdocsChannelEntity = new AmdocsChannelEntity();

        amdocsChannelEntity.setCreatedAt( amdocsChannelSIAMEntity.getCreatedAt() );
        amdocsChannelEntity.setDeleteAt( amdocsChannelSIAMEntity.getDeleteAt() );
        amdocsChannelEntity.setState( amdocsChannelSIAMEntity.isState() );
        amdocsChannelEntity.setUpdateAt( amdocsChannelSIAMEntity.getUpdateAt() );
        amdocsChannelEntity.setUserCreate( amdocsChannelSIAMEntity.getUserCreate() );
        amdocsChannelEntity.setUserDelete( amdocsChannelSIAMEntity.getUserDelete() );
        amdocsChannelEntity.setUserUpdate( amdocsChannelSIAMEntity.getUserUpdate() );
        amdocsChannelEntity.setCanalAmdocsCod( amdocsChannelSIAMEntity.getCanalAmdocsCod() );
        amdocsChannelEntity.setCanalAmdocsId( amdocsChannelSIAMEntity.getCanalAmdocsId() );
        amdocsChannelEntity.setDescripcionIngles( amdocsChannelSIAMEntity.getDescripcionIngles() );
        amdocsChannelEntity.setNombre( amdocsChannelSIAMEntity.getNombre() );

        return amdocsChannelEntity;
    }

    protected CommercialChannelEntity commercialChannelSIAMEntityToCommercialChannelEntity(CommercialChannelSIAMEntity commercialChannelSIAMEntity) {
        if ( commercialChannelSIAMEntity == null ) {
            return null;
        }

        CommercialChannelEntity commercialChannelEntity = new CommercialChannelEntity();

        commercialChannelEntity.setCreatedAt( commercialChannelSIAMEntity.getCreatedAt() );
        commercialChannelEntity.setDeleteAt( commercialChannelSIAMEntity.getDeleteAt() );
        commercialChannelEntity.setState( commercialChannelSIAMEntity.isState() );
        commercialChannelEntity.setUpdateAt( commercialChannelSIAMEntity.getUpdateAt() );
        commercialChannelEntity.setUserCreate( commercialChannelSIAMEntity.getUserCreate() );
        commercialChannelEntity.setUserDelete( commercialChannelSIAMEntity.getUserDelete() );
        commercialChannelEntity.setUserUpdate( commercialChannelSIAMEntity.getUserUpdate() );
        commercialChannelEntity.setCanalAmdocs( amdocsChannelSIAMEntityToAmdocsChannelEntity( commercialChannelSIAMEntity.getCanalAmdocs() ) );
        commercialChannelEntity.setCanalComercialCod( commercialChannelSIAMEntity.getCanalComercialCod() );
        commercialChannelEntity.setCanalComercialId( commercialChannelSIAMEntity.getCanalComercialId() );
        commercialChannelEntity.setCodigoAtis( commercialChannelSIAMEntity.getCodigoAtis() );
        commercialChannelEntity.setNombre( commercialChannelSIAMEntity.getNombre() );

        return commercialChannelEntity;
    }

    protected GenericChannelEntity genericChannelSIAMEntityToGenericChannelEntity(GenericChannelSIAMEntity genericChannelSIAMEntity) {
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

    protected ChannelEntity channelSIAMEntityToChannelEntity(ChannelSIAMEntity channelSIAMEntity) {
        if ( channelSIAMEntity == null ) {
            return null;
        }

        ChannelEntity channelEntity = new ChannelEntity();

        channelEntity.setCanalComercial( commercialChannelSIAMEntityToCommercialChannelEntity( channelSIAMEntity.getCanalComercial() ) );
        channelEntity.setCanalGenerico( genericChannelSIAMEntityToGenericChannelEntity( channelSIAMEntity.getCanalGenerico() ) );
        channelEntity.setCanalId( channelSIAMEntity.getCanalId() );

        return channelEntity;
    }

    protected ResponsableEntity responsableSIAMEntityToResponsableEntity(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }

        ResponsableEntity responsableEntity = new ResponsableEntity();

        responsableEntity.setResponsableId( responsableSIAMEntity.getResponsableId() );
        responsableEntity.setCip( responsableSIAMEntity.getCip() );
        responsableEntity.setCargo( responsableSIAMEntity.getCargo() );
        responsableEntity.setDireccion( responsableSIAMEntity.getDireccion() );
        responsableEntity.setGerencia( responsableSIAMEntity.getGerencia() );
        responsableEntity.setCanal( channelSIAMEntityToChannelEntity( responsableSIAMEntity.getCanal() ) );
        responsableEntity.setTicketRemedy( responsableSIAMEntity.getTicketRemedy() );
        responsableEntity.setTipo( responsableSIAMEntity.getTipo() );
        responsableEntity.setSustento( responsableSIAMEntity.getSustento() );

        return responsableEntity;
    }

    private String responsableSIAMEntityPersonaNombres(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }
        PersonSIAMEntity persona = responsableSIAMEntity.getPersona();
        if ( persona == null ) {
            return null;
        }
        String nombres = persona.getNombres();
        if ( nombres == null ) {
            return null;
        }
        return nombres;
    }

    private String responsableSIAMEntityPersonaPaterno(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }
        PersonSIAMEntity persona = responsableSIAMEntity.getPersona();
        if ( persona == null ) {
            return null;
        }
        String paterno = persona.getPaterno();
        if ( paterno == null ) {
            return null;
        }
        return paterno;
    }

    private String responsableSIAMEntityPersonaMaterno(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }
        PersonSIAMEntity persona = responsableSIAMEntity.getPersona();
        if ( persona == null ) {
            return null;
        }
        String materno = persona.getMaterno();
        if ( materno == null ) {
            return null;
        }
        return materno;
    }

    private Integer responsableSIAMEntityPersonaPersonaId(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }
        PersonSIAMEntity persona = responsableSIAMEntity.getPersona();
        if ( persona == null ) {
            return null;
        }
        Integer personaId = persona.getPersonaId();
        if ( personaId == null ) {
            return null;
        }
        return personaId;
    }

    private String responsableSIAMEntityPersonaNumDocumento(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }
        PersonSIAMEntity persona = responsableSIAMEntity.getPersona();
        if ( persona == null ) {
            return null;
        }
        String numDocumento = persona.getNumDocumento();
        if ( numDocumento == null ) {
            return null;
        }
        return numDocumento;
    }

    private DocumentTypeSIAMEntity responsableSIAMEntityPersonaTipoDocumento(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }
        PersonSIAMEntity persona = responsableSIAMEntity.getPersona();
        if ( persona == null ) {
            return null;
        }
        DocumentTypeSIAMEntity tipoDocumento = persona.getTipoDocumento();
        if ( tipoDocumento == null ) {
            return null;
        }
        return tipoDocumento;
    }

    protected DocumentTypeEntity documentTypeSIAMEntityToDocumentTypeEntity(DocumentTypeSIAMEntity documentTypeSIAMEntity) {
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

    private String responsableSIAMEntityPersonaCelular(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }
        PersonSIAMEntity persona = responsableSIAMEntity.getPersona();
        if ( persona == null ) {
            return null;
        }
        String celular = persona.getCelular();
        if ( celular == null ) {
            return null;
        }
        return celular;
    }

    private String responsableSIAMEntityPersonaUsername(ResponsableSIAMEntity responsableSIAMEntity) {
        if ( responsableSIAMEntity == null ) {
            return null;
        }
        PersonSIAMEntity persona = responsableSIAMEntity.getPersona();
        if ( persona == null ) {
            return null;
        }
        String username = persona.getUsername();
        if ( username == null ) {
            return null;
        }
        return username;
    }
}
