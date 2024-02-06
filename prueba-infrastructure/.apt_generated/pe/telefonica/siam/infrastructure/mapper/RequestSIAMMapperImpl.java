package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.AmdocsChannelEntity;
import pe.telefonica.siam.domain.entity.ApplicationEntity;
import pe.telefonica.siam.domain.entity.AttachmentsEntity;
import pe.telefonica.siam.domain.entity.ChannelEntity;
import pe.telefonica.siam.domain.entity.CommercialChannelEntity;
import pe.telefonica.siam.domain.entity.DocumentTypeEntity;
import pe.telefonica.siam.domain.entity.FunctionalRoleEntity;
import pe.telefonica.siam.domain.entity.GenericChannelEntity;
import pe.telefonica.siam.domain.entity.PersonEntity;
import pe.telefonica.siam.domain.entity.RequestEntity;
import pe.telefonica.siam.domain.entity.RequestStatusEntity;
import pe.telefonica.siam.domain.entity.RequestTypeEntity;
import pe.telefonica.siam.domain.entity.ResponsableEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.AmdocsChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.AttachmentsSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.DocumentTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.FunctionalRoleSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.GenericChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PersonSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestApplicationSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestStatusSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ResponsableSIAMEntity;
import pe.telefonica.siam.storage.Attachment;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:33-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class RequestSIAMMapperImpl implements RequestSIAMMapper {

    @Override
    public RequestEntity asRequestEntity(RequestSIAMEntity requestSIAMEntity) {
        if ( requestSIAMEntity == null ) {
            return null;
        }

        RequestEntity requestEntity = new RequestEntity();

        requestEntity.setFunctionalRole( functionalRoleSIAMEntityToFunctionalRoleEntity( requestSIAMEntity.getFunctionalRole() ) );
        requestEntity.setResponsable( personSIAMEntityToPersonEntity1( requestSIAMEntity.getResponsable() ) );
        requestEntity.setAprobador( personSIAMEntityToPersonEntity1( requestSIAMEntity.getAprobador() ) );
        requestEntity.setPerfilador( personSIAMEntityToPersonEntity1( requestSIAMEntity.getPerfilador() ) );
        if ( requestSIAMEntity.getAdjunto() != null ) {
            if ( requestEntity.getArchivoAdjunto() == null ) {
                requestEntity.setArchivoAdjunto( new Attachment() );
            }
            attachmentsSIAMEntityToAttachment( requestSIAMEntity.getAdjunto(), requestEntity.getArchivoAdjunto() );
        }
        if ( requestEntity.getArchivoAdjunto() == null ) {
            requestEntity.setArchivoAdjunto( new Attachment() );
        }
        requestSIAMEntityToAttachment( requestSIAMEntity, requestEntity.getArchivoAdjunto() );
        requestEntity.setAplicaciones( RequestSIAMMapper.asApplicationEntities( requestSIAMEntity.getAplicaciones() ) );
        requestEntity.setCreatedAt( requestSIAMEntity.getCreatedAt() );
        requestEntity.setDeleteAt( requestSIAMEntity.getDeleteAt() );
        requestEntity.setState( requestSIAMEntity.isState() );
        requestEntity.setUpdateAt( requestSIAMEntity.getUpdateAt() );
        requestEntity.setUserCreate( requestSIAMEntity.getUserCreate() );
        requestEntity.setUserDelete( requestSIAMEntity.getUserDelete() );
        requestEntity.setUserUpdate( requestSIAMEntity.getUserUpdate() );
        requestEntity.setAdjunto( attachmentsSIAMEntityToAttachmentsEntity( requestSIAMEntity.getAdjunto() ) );
        requestEntity.setCanal( channelSIAMEntityToChannelEntity( requestSIAMEntity.getCanal() ) );
        requestEntity.setComentarioAprobador( requestSIAMEntity.getComentarioAprobador() );
        requestEntity.setComentarioPerfilamiento( requestSIAMEntity.getComentarioPerfilamiento() );
        requestEntity.setEstadoSolicitud( requestStatusSIAMEntityToRequestStatusEntity( requestSIAMEntity.getEstadoSolicitud() ) );
        requestEntity.setFechaAprobacion( requestSIAMEntity.getFechaAprobacion() );
        requestEntity.setFechaCierre( requestSIAMEntity.getFechaCierre() );
        requestEntity.setFechaEjecucion( requestSIAMEntity.getFechaEjecucion() );
        requestEntity.setFechaSolicitud( requestSIAMEntity.getFechaSolicitud() );
        requestEntity.setIdRolFuncionalOld( requestSIAMEntity.getIdRolFuncionalOld() );
        requestEntity.setNombreRol( requestSIAMEntity.getNombreRol() );
        requestEntity.setSolicitudId( requestSIAMEntity.getSolicitudId() );
        requestEntity.setSustento( requestSIAMEntity.getSustento() );
        requestEntity.setTicketNumero( requestSIAMEntity.getTicketNumero() );
        requestEntity.setTipoSolicitud( requestTypeSIAMEntityToRequestTypeEntity( requestSIAMEntity.getTipoSolicitud() ) );

        return requestEntity;
    }

    @Override
    public List<RequestEntity> asRequestEntities(List<RequestSIAMEntity> requestSIAMEntities) {
        if ( requestSIAMEntities == null ) {
            return null;
        }

        List<RequestEntity> list = new ArrayList<RequestEntity>( requestSIAMEntities.size() );
        for ( RequestSIAMEntity requestSIAMEntity : requestSIAMEntities ) {
            list.add( asRequestEntity( requestSIAMEntity ) );
        }

        return list;
    }

    @Override
    public RequestSIAMEntity asRequestSIAMEntity(RequestEntity requestEntity) {
        if ( requestEntity == null ) {
            return null;
        }

        RequestSIAMEntity requestSIAMEntity = new RequestSIAMEntity();

        requestSIAMEntity.setCreatedAt( requestEntity.getCreatedAt() );
        requestSIAMEntity.setDeleteAt( requestEntity.getDeleteAt() );
        requestSIAMEntity.setState( requestEntity.isState() );
        requestSIAMEntity.setUpdateAt( requestEntity.getUpdateAt() );
        requestSIAMEntity.setUserCreate( requestEntity.getUserCreate() );
        requestSIAMEntity.setUserDelete( requestEntity.getUserDelete() );
        requestSIAMEntity.setUserUpdate( requestEntity.getUserUpdate() );
        requestSIAMEntity.setAdjunto( attachmentsEntityToAttachmentsSIAMEntity( requestEntity.getAdjunto() ) );
        requestSIAMEntity.setAplicaciones( applicationEntityListToRequestApplicationSIAMEntityList( requestEntity.getAplicaciones() ) );
        requestSIAMEntity.setAprobador( personEntityToPersonSIAMEntity( requestEntity.getAprobador() ) );
        requestSIAMEntity.setCanal( channelEntityToChannelSIAMEntity( requestEntity.getCanal() ) );
        requestSIAMEntity.setComentarioAprobador( requestEntity.getComentarioAprobador() );
        requestSIAMEntity.setComentarioPerfilamiento( requestEntity.getComentarioPerfilamiento() );
        requestSIAMEntity.setEstadoSolicitud( requestStatusEntityToRequestStatusSIAMEntity( requestEntity.getEstadoSolicitud() ) );
        requestSIAMEntity.setFechaAprobacion( requestEntity.getFechaAprobacion() );
        requestSIAMEntity.setFechaCierre( requestEntity.getFechaCierre() );
        requestSIAMEntity.setFechaEjecucion( requestEntity.getFechaEjecucion() );
        requestSIAMEntity.setFechaSolicitud( requestEntity.getFechaSolicitud() );
        requestSIAMEntity.setFunctionalRole( functionalRoleEntityToFunctionalRoleSIAMEntity( requestEntity.getFunctionalRole() ) );
        requestSIAMEntity.setIdRolFuncionalOld( requestEntity.getIdRolFuncionalOld() );
        requestSIAMEntity.setNombreRol( requestEntity.getNombreRol() );
        requestSIAMEntity.setPerfilador( personEntityToPersonSIAMEntity( requestEntity.getPerfilador() ) );
        requestSIAMEntity.setResponsable( personEntityToPersonSIAMEntity( requestEntity.getResponsable() ) );
        requestSIAMEntity.setSolicitudId( requestEntity.getSolicitudId() );
        requestSIAMEntity.setSustento( requestEntity.getSustento() );
        requestSIAMEntity.setTicketNumero( requestEntity.getTicketNumero() );
        requestSIAMEntity.setTipoSolicitud( requestTypeEntityToRequestTypeSIAMEntity( requestEntity.getTipoSolicitud() ) );

        return requestSIAMEntity;
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

    protected PersonEntity personSIAMEntityToPersonEntity(PersonSIAMEntity personSIAMEntity) {
        if ( personSIAMEntity == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setCreatedAt( personSIAMEntity.getCreatedAt() );
        personEntity.setDeleteAt( personSIAMEntity.getDeleteAt() );
        personEntity.setState( personSIAMEntity.isState() );
        personEntity.setUpdateAt( personSIAMEntity.getUpdateAt() );
        personEntity.setUserCreate( personSIAMEntity.getUserCreate() );
        personEntity.setUserDelete( personSIAMEntity.getUserDelete() );
        personEntity.setUserUpdate( personSIAMEntity.getUserUpdate() );
        if ( personSIAMEntity.getAutenticacionBiometrica() != null ) {
            personEntity.setAutenticacionBiometrica( personSIAMEntity.getAutenticacionBiometrica() );
        }
        personEntity.setCelular( personSIAMEntity.getCelular() );
        if ( personSIAMEntity.getEsVendedor() != null ) {
            personEntity.setEsVendedor( personSIAMEntity.getEsVendedor() );
        }
        personEntity.setHasUser( personSIAMEntity.isHasUser() );
        personEntity.setMaterno( personSIAMEntity.getMaterno() );
        personEntity.setNombres( personSIAMEntity.getNombres() );
        personEntity.setNumDocumento( personSIAMEntity.getNumDocumento() );
        personEntity.setPaterno( personSIAMEntity.getPaterno() );
        personEntity.setPersonaId( personSIAMEntity.getPersonaId() );
        personEntity.setResponsable( responsableSIAMEntityToResponsableEntity( personSIAMEntity.getResponsable() ) );
        personEntity.setTelefonoFijo( personSIAMEntity.getTelefonoFijo() );
        personEntity.setTipoDocumento( documentTypeSIAMEntityToDocumentTypeEntity( personSIAMEntity.getTipoDocumento() ) );

        return personEntity;
    }

    protected FunctionalRoleEntity functionalRoleSIAMEntityToFunctionalRoleEntity(FunctionalRoleSIAMEntity functionalRoleSIAMEntity) {
        if ( functionalRoleSIAMEntity == null ) {
            return null;
        }

        FunctionalRoleEntity functionalRoleEntity = new FunctionalRoleEntity();

        functionalRoleEntity.setProfilesFunctional( RequestSIAMMapper.asProfileFunctionalEntities( functionalRoleSIAMEntity.getPerfilesRolesFunctionales() ) );
        functionalRoleEntity.setCreatedAt( functionalRoleSIAMEntity.getCreatedAt() );
        functionalRoleEntity.setDeleteAt( functionalRoleSIAMEntity.getDeleteAt() );
        functionalRoleEntity.setState( functionalRoleSIAMEntity.isState() );
        functionalRoleEntity.setUpdateAt( functionalRoleSIAMEntity.getUpdateAt() );
        functionalRoleEntity.setUserCreate( functionalRoleSIAMEntity.getUserCreate() );
        functionalRoleEntity.setUserDelete( functionalRoleSIAMEntity.getUserDelete() );
        functionalRoleEntity.setUserUpdate( functionalRoleSIAMEntity.getUserUpdate() );
        functionalRoleEntity.setAprobadoPor( personSIAMEntityToPersonEntity( functionalRoleSIAMEntity.getAprobadoPor() ) );
        functionalRoleEntity.setCanal( channelSIAMEntityToChannelEntity( functionalRoleSIAMEntity.getCanal() ) );
        functionalRoleEntity.setCodigo( functionalRoleSIAMEntity.getCodigo() );
        functionalRoleEntity.setNombre( functionalRoleSIAMEntity.getNombre() );
        functionalRoleEntity.setPerfilesId( functionalRoleSIAMEntity.getPerfilesId() );
        functionalRoleEntity.setResponsable( personSIAMEntityToPersonEntity( functionalRoleSIAMEntity.getResponsable() ) );
        functionalRoleEntity.setRolFuncionalId( functionalRoleSIAMEntity.getRolFuncionalId() );
        functionalRoleEntity.setTipo( functionalRoleSIAMEntity.getTipo() );
        functionalRoleEntity.setVersion( functionalRoleSIAMEntity.getVersion() );

        return functionalRoleEntity;
    }

    protected PersonEntity personSIAMEntityToPersonEntity1(PersonSIAMEntity personSIAMEntity) {
        if ( personSIAMEntity == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setEmail( personSIAMEntity.getUsername() );
        personEntity.setCreatedAt( personSIAMEntity.getCreatedAt() );
        personEntity.setDeleteAt( personSIAMEntity.getDeleteAt() );
        personEntity.setState( personSIAMEntity.isState() );
        personEntity.setUpdateAt( personSIAMEntity.getUpdateAt() );
        personEntity.setUserCreate( personSIAMEntity.getUserCreate() );
        personEntity.setUserDelete( personSIAMEntity.getUserDelete() );
        personEntity.setUserUpdate( personSIAMEntity.getUserUpdate() );
        if ( personSIAMEntity.getAutenticacionBiometrica() != null ) {
            personEntity.setAutenticacionBiometrica( personSIAMEntity.getAutenticacionBiometrica() );
        }
        personEntity.setCelular( personSIAMEntity.getCelular() );
        if ( personSIAMEntity.getEsVendedor() != null ) {
            personEntity.setEsVendedor( personSIAMEntity.getEsVendedor() );
        }
        personEntity.setHasUser( personSIAMEntity.isHasUser() );
        personEntity.setMaterno( personSIAMEntity.getMaterno() );
        personEntity.setNombres( personSIAMEntity.getNombres() );
        personEntity.setNumDocumento( personSIAMEntity.getNumDocumento() );
        personEntity.setPaterno( personSIAMEntity.getPaterno() );
        personEntity.setPersonaId( personSIAMEntity.getPersonaId() );
        personEntity.setResponsable( responsableSIAMEntityToResponsableEntity( personSIAMEntity.getResponsable() ) );
        personEntity.setTelefonoFijo( personSIAMEntity.getTelefonoFijo() );
        personEntity.setTipoDocumento( documentTypeSIAMEntityToDocumentTypeEntity( personSIAMEntity.getTipoDocumento() ) );

        return personEntity;
    }

    protected void attachmentsSIAMEntityToAttachment(AttachmentsSIAMEntity attachmentsSIAMEntity, Attachment mappingTarget) {
        if ( attachmentsSIAMEntity == null ) {
            return;
        }

        if ( attachmentsSIAMEntity.getAdjuntoId() != null ) {
            mappingTarget.setAdjuntoId( attachmentsSIAMEntity.getAdjuntoId().longValue() );
        }
        else {
            mappingTarget.setAdjuntoId( null );
        }
        mappingTarget.setCreatedAt( attachmentsSIAMEntity.getCreatedAt() );
        mappingTarget.setNombreArchivo( attachmentsSIAMEntity.getNombreArchivo() );
        mappingTarget.setReferencia( attachmentsSIAMEntity.getReferencia() );
        if ( attachmentsSIAMEntity.getUserCreate() != null ) {
            mappingTarget.setUserCreate( attachmentsSIAMEntity.getUserCreate().longValue() );
        }
        else {
            mappingTarget.setUserCreate( null );
        }
        if ( attachmentsSIAMEntity.getUserDelete() != null ) {
            mappingTarget.setUserDelete( attachmentsSIAMEntity.getUserDelete().longValue() );
        }
        else {
            mappingTarget.setUserDelete( null );
        }
    }

    protected void requestSIAMEntityToAttachment(RequestSIAMEntity requestSIAMEntity, Attachment mappingTarget) {
        if ( requestSIAMEntity == null ) {
            return;
        }

        if ( requestSIAMEntity.getSolicitudId() != null ) {
            mappingTarget.setSolicitudRfId( requestSIAMEntity.getSolicitudId().longValue() );
        }
        else {
            mappingTarget.setSolicitudRfId( null );
        }
    }

    protected AttachmentsEntity attachmentsSIAMEntityToAttachmentsEntity(AttachmentsSIAMEntity attachmentsSIAMEntity) {
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

    protected RequestStatusEntity requestStatusSIAMEntityToRequestStatusEntity(RequestStatusSIAMEntity requestStatusSIAMEntity) {
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

    protected RequestTypeEntity requestTypeSIAMEntityToRequestTypeEntity(RequestTypeSIAMEntity requestTypeSIAMEntity) {
        if ( requestTypeSIAMEntity == null ) {
            return null;
        }

        RequestTypeEntity requestTypeEntity = new RequestTypeEntity();

        requestTypeEntity.setNombre( requestTypeSIAMEntity.getNombre() );
        requestTypeEntity.setTipoSolicitudId( requestTypeSIAMEntity.getTipoSolicitudId() );

        return requestTypeEntity;
    }

    protected AttachmentsSIAMEntity attachmentsEntityToAttachmentsSIAMEntity(AttachmentsEntity attachmentsEntity) {
        if ( attachmentsEntity == null ) {
            return null;
        }

        AttachmentsSIAMEntity attachmentsSIAMEntity = new AttachmentsSIAMEntity();

        attachmentsSIAMEntity.setAdjuntoId( attachmentsEntity.getAdjuntoId() );
        attachmentsSIAMEntity.setArchivo( attachmentsEntity.getArchivo() );
        attachmentsSIAMEntity.setNombreArchivo( attachmentsEntity.getNombreArchivo() );
        attachmentsSIAMEntity.setReferencia( attachmentsEntity.getReferencia() );

        return attachmentsSIAMEntity;
    }

    protected RequestApplicationSIAMEntity applicationEntityToRequestApplicationSIAMEntity(ApplicationEntity applicationEntity) {
        if ( applicationEntity == null ) {
            return null;
        }

        RequestApplicationSIAMEntity requestApplicationSIAMEntity = new RequestApplicationSIAMEntity();

        return requestApplicationSIAMEntity;
    }

    protected List<RequestApplicationSIAMEntity> applicationEntityListToRequestApplicationSIAMEntityList(List<ApplicationEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RequestApplicationSIAMEntity> list1 = new ArrayList<RequestApplicationSIAMEntity>( list.size() );
        for ( ApplicationEntity applicationEntity : list ) {
            list1.add( applicationEntityToRequestApplicationSIAMEntity( applicationEntity ) );
        }

        return list1;
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

    protected ResponsableSIAMEntity responsableEntityToResponsableSIAMEntity(ResponsableEntity responsableEntity) {
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

    protected DocumentTypeSIAMEntity documentTypeEntityToDocumentTypeSIAMEntity(DocumentTypeEntity documentTypeEntity) {
        if ( documentTypeEntity == null ) {
            return null;
        }

        DocumentTypeSIAMEntity documentTypeSIAMEntity = new DocumentTypeSIAMEntity();

        documentTypeSIAMEntity.setCaracteresMax( documentTypeEntity.getCaracteresMax() );
        documentTypeSIAMEntity.setCodigo( documentTypeEntity.getCodigo() );
        documentTypeSIAMEntity.setLongitudExacta( documentTypeEntity.isLongitudExacta() );
        documentTypeSIAMEntity.setMascara( documentTypeEntity.getMascara() );
        documentTypeSIAMEntity.setNombre( documentTypeEntity.getNombre() );
        documentTypeSIAMEntity.setRegExp( documentTypeEntity.getRegExp() );
        documentTypeSIAMEntity.setState( documentTypeEntity.isState() );
        documentTypeSIAMEntity.setTipo( documentTypeEntity.getTipo() );
        documentTypeSIAMEntity.setTipoCodificacion( documentTypeEntity.getTipoCodificacion() );
        documentTypeSIAMEntity.setTipoDocumentoId( documentTypeEntity.getTipoDocumentoId() );

        return documentTypeSIAMEntity;
    }

    protected PersonSIAMEntity personEntityToPersonSIAMEntity(PersonEntity personEntity) {
        if ( personEntity == null ) {
            return null;
        }

        PersonSIAMEntity personSIAMEntity = new PersonSIAMEntity();

        personSIAMEntity.setCreatedAt( personEntity.getCreatedAt() );
        personSIAMEntity.setDeleteAt( personEntity.getDeleteAt() );
        personSIAMEntity.setState( personEntity.isState() );
        personSIAMEntity.setUpdateAt( personEntity.getUpdateAt() );
        personSIAMEntity.setUserCreate( personEntity.getUserCreate() );
        personSIAMEntity.setUserDelete( personEntity.getUserDelete() );
        personSIAMEntity.setUserUpdate( personEntity.getUserUpdate() );
        personSIAMEntity.setAutenticacionBiometrica( personEntity.isAutenticacionBiometrica() );
        personSIAMEntity.setCelular( personEntity.getCelular() );
        personSIAMEntity.setEsVendedor( personEntity.isEsVendedor() );
        personSIAMEntity.setHasUser( personEntity.isHasUser() );
        personSIAMEntity.setMaterno( personEntity.getMaterno() );
        personSIAMEntity.setNombres( personEntity.getNombres() );
        personSIAMEntity.setNumDocumento( personEntity.getNumDocumento() );
        personSIAMEntity.setPaterno( personEntity.getPaterno() );
        personSIAMEntity.setPersonaId( personEntity.getPersonaId() );
        personSIAMEntity.setResponsable( responsableEntityToResponsableSIAMEntity( personEntity.getResponsable() ) );
        personSIAMEntity.setTelefonoFijo( personEntity.getTelefonoFijo() );
        personSIAMEntity.setTipoDocumento( documentTypeEntityToDocumentTypeSIAMEntity( personEntity.getTipoDocumento() ) );

        return personSIAMEntity;
    }

    protected RequestStatusSIAMEntity requestStatusEntityToRequestStatusSIAMEntity(RequestStatusEntity requestStatusEntity) {
        if ( requestStatusEntity == null ) {
            return null;
        }

        RequestStatusSIAMEntity requestStatusSIAMEntity = new RequestStatusSIAMEntity();

        requestStatusSIAMEntity.setCodigo( requestStatusEntity.getCodigo() );
        requestStatusSIAMEntity.setColorHex( requestStatusEntity.getColorHex() );
        requestStatusSIAMEntity.setEstadoSolicitudId( requestStatusEntity.getEstadoSolicitudId() );
        requestStatusSIAMEntity.setNombre( requestStatusEntity.getNombre() );

        return requestStatusSIAMEntity;
    }

    protected FunctionalRoleSIAMEntity functionalRoleEntityToFunctionalRoleSIAMEntity(FunctionalRoleEntity functionalRoleEntity) {
        if ( functionalRoleEntity == null ) {
            return null;
        }

        FunctionalRoleSIAMEntity functionalRoleSIAMEntity = new FunctionalRoleSIAMEntity();

        functionalRoleSIAMEntity.setCreatedAt( functionalRoleEntity.getCreatedAt() );
        functionalRoleSIAMEntity.setDeleteAt( functionalRoleEntity.getDeleteAt() );
        functionalRoleSIAMEntity.setState( functionalRoleEntity.isState() );
        functionalRoleSIAMEntity.setUpdateAt( functionalRoleEntity.getUpdateAt() );
        functionalRoleSIAMEntity.setUserCreate( functionalRoleEntity.getUserCreate() );
        functionalRoleSIAMEntity.setUserDelete( functionalRoleEntity.getUserDelete() );
        functionalRoleSIAMEntity.setUserUpdate( functionalRoleEntity.getUserUpdate() );
        functionalRoleSIAMEntity.setAprobadoPor( personEntityToPersonSIAMEntity( functionalRoleEntity.getAprobadoPor() ) );
        functionalRoleSIAMEntity.setCanal( channelEntityToChannelSIAMEntity( functionalRoleEntity.getCanal() ) );
        functionalRoleSIAMEntity.setCodigo( functionalRoleEntity.getCodigo() );
        functionalRoleSIAMEntity.setNombre( functionalRoleEntity.getNombre() );
        functionalRoleSIAMEntity.setPerfilesId( functionalRoleEntity.getPerfilesId() );
        functionalRoleSIAMEntity.setResponsable( personEntityToPersonSIAMEntity( functionalRoleEntity.getResponsable() ) );
        functionalRoleSIAMEntity.setRolFuncionalId( functionalRoleEntity.getRolFuncionalId() );
        functionalRoleSIAMEntity.setTipo( functionalRoleEntity.getTipo() );
        functionalRoleSIAMEntity.setVersion( functionalRoleEntity.getVersion() );

        return functionalRoleSIAMEntity;
    }

    protected RequestTypeSIAMEntity requestTypeEntityToRequestTypeSIAMEntity(RequestTypeEntity requestTypeEntity) {
        if ( requestTypeEntity == null ) {
            return null;
        }

        RequestTypeSIAMEntity requestTypeSIAMEntity = new RequestTypeSIAMEntity();

        requestTypeSIAMEntity.setNombre( requestTypeEntity.getNombre() );
        requestTypeSIAMEntity.setTipoSolicitudId( requestTypeEntity.getTipoSolicitudId() );

        return requestTypeSIAMEntity;
    }
}
