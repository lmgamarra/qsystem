package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.AmdocsChannelEntity;
import pe.telefonica.siam.domain.entity.ChannelEntity;
import pe.telefonica.siam.domain.entity.CommercialChannelEntity;
import pe.telefonica.siam.domain.entity.CompanyDomainEntity;
import pe.telefonica.siam.domain.entity.CompanyEntity;
import pe.telefonica.siam.domain.entity.CorporationEntity;
import pe.telefonica.siam.domain.entity.DocumentTypeEntity;
import pe.telefonica.siam.domain.entity.FunctionalRoleEntity;
import pe.telefonica.siam.domain.entity.GenericChannelEntity;
import pe.telefonica.siam.domain.entity.HarossLockEntity;
import pe.telefonica.siam.domain.entity.LocksEntity;
import pe.telefonica.siam.domain.entity.PersonEntity;
import pe.telefonica.siam.domain.entity.PersonRequestEntity;
import pe.telefonica.siam.domain.entity.PointSaleEntity;
import pe.telefonica.siam.domain.entity.ResponsableEntity;
import pe.telefonica.siam.domain.entity.TicketEntity;
import pe.telefonica.siam.domain.entity.TicketExecutionStatusEntity;
import pe.telefonica.siam.domain.entity.TicketRequestEntity;
import pe.telefonica.siam.domain.entity.TicketRequestExecutionStatusEntity;
import pe.telefonica.siam.domain.entity.TicketRequestStatusEntity;
import pe.telefonica.siam.domain.entity.TicketRequestTypeEntity;
import pe.telefonica.siam.domain.entity.TicketStatusEntity;
import pe.telefonica.siam.domain.entity.TicketTypeEntity;
import pe.telefonica.siam.domain.entity.UserSecurityEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.AmdocsChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CompanyDomainSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CompanySIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.DocumentTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.EntitySIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.FunctionalRoleSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.GenericChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.HarossLockSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.LocksSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PersonRequestSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PersonSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PointSaleSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ResponsableSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.TicketExecutionStatusSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.TicketRequestExecutionStatusSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.TicketRequestSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.TicketRequestStatusSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.TicketRequestTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.TicketSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.TicketStatusSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.TicketTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.UserCommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.UserSecuritySIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:28-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class HarossLockSIAMMapperImpl implements HarossLockSIAMMapper {

    @Override
    public HarossLockSIAMEntity asHarossLockSIAMEntity(HarossLockEntity harossLockEntity) {
        if ( harossLockEntity == null ) {
            return null;
        }

        HarossLockSIAMEntity harossLockSIAMEntity = new HarossLockSIAMEntity();

        harossLockSIAMEntity.setAreaSolicitante( harossLockEntity.getAreaSolicitante() );
        harossLockSIAMEntity.setBloqueoId( harossLockEntity.getBloqueoId() );
        harossLockSIAMEntity.setCodigoAccion( harossLockEntity.getCodigoAccion() );
        harossLockSIAMEntity.setEtiqueta( harossLockEntity.getEtiqueta() );
        harossLockSIAMEntity.setMotivo( harossLockEntity.getMotivo() );
        harossLockSIAMEntity.setRespuesta( harossLockEntity.getRespuesta() );
        harossLockSIAMEntity.setRespuestaDetalle( harossLockEntity.getRespuestaDetalle() );
        harossLockSIAMEntity.setTicket( ticketEntityToTicketSIAMEntity( harossLockEntity.getTicket() ) );
        harossLockSIAMEntity.setTicketHaross( harossLockEntity.getTicketHaross() );
        harossLockSIAMEntity.setUsuarioHaross( harossLockEntity.getUsuarioHaross() );

        return harossLockSIAMEntity;
    }

    @Override
    public HarossLockEntity asHarossLockEntity(HarossLockSIAMEntity harossLockSIAMEntity) {
        if ( harossLockSIAMEntity == null ) {
            return null;
        }

        HarossLockEntity harossLockEntity = new HarossLockEntity();

        harossLockEntity.setAreaSolicitante( harossLockSIAMEntity.getAreaSolicitante() );
        harossLockEntity.setBloqueoId( harossLockSIAMEntity.getBloqueoId() );
        harossLockEntity.setCodigoAccion( harossLockSIAMEntity.getCodigoAccion() );
        harossLockEntity.setEtiqueta( harossLockSIAMEntity.getEtiqueta() );
        harossLockEntity.setMotivo( harossLockSIAMEntity.getMotivo() );
        harossLockEntity.setRespuesta( harossLockSIAMEntity.getRespuesta() );
        harossLockEntity.setRespuestaDetalle( harossLockSIAMEntity.getRespuestaDetalle() );
        harossLockEntity.setTicket( ticketSIAMEntityToTicketEntity( harossLockSIAMEntity.getTicket() ) );
        harossLockEntity.setTicketHaross( harossLockSIAMEntity.getTicketHaross() );
        harossLockEntity.setUsuarioHaross( harossLockSIAMEntity.getUsuarioHaross() );

        return harossLockEntity;
    }

    @Override
    public List<HarossLockSIAMEntity> asHarossLockSIAMEntities(List<HarossLockEntity> harossLockEntities) {
        if ( harossLockEntities == null ) {
            return null;
        }

        List<HarossLockSIAMEntity> list = new ArrayList<HarossLockSIAMEntity>( harossLockEntities.size() );
        for ( HarossLockEntity harossLockEntity : harossLockEntities ) {
            list.add( asHarossLockSIAMEntity( harossLockEntity ) );
        }

        return list;
    }

    @Override
    public List<HarossLockEntity> asHarossLockEntities(List<HarossLockSIAMEntity> harossLockSIAMEntities) {
        if ( harossLockSIAMEntities == null ) {
            return null;
        }

        List<HarossLockEntity> list = new ArrayList<HarossLockEntity>( harossLockSIAMEntities.size() );
        for ( HarossLockSIAMEntity harossLockSIAMEntity : harossLockSIAMEntities ) {
            list.add( asHarossLockEntity( harossLockSIAMEntity ) );
        }

        return list;
    }

    protected LocksSIAMEntity locksEntityToLocksSIAMEntity(LocksEntity locksEntity) {
        if ( locksEntity == null ) {
            return null;
        }

        LocksSIAMEntity locksSIAMEntity = new LocksSIAMEntity();

        locksSIAMEntity.setCreatedAt( locksEntity.getCreatedAt() );
        locksSIAMEntity.setDeleteAt( locksEntity.getDeleteAt() );
        locksSIAMEntity.setState( locksEntity.isState() );
        locksSIAMEntity.setUpdateAt( locksEntity.getUpdateAt() );
        locksSIAMEntity.setUserCreate( locksEntity.getUserCreate() );
        locksSIAMEntity.setUserDelete( locksEntity.getUserDelete() );
        locksSIAMEntity.setUserUpdate( locksEntity.getUserUpdate() );
        locksSIAMEntity.setBloqueo( locksEntity.getBloqueo() );
        locksSIAMEntity.setBloqueoId( locksEntity.getBloqueoId() );
        locksSIAMEntity.setComentario( locksEntity.getComentario() );
        locksSIAMEntity.setUsuarioId( locksEntity.getUsuarioId() );

        return locksSIAMEntity;
    }

    protected UserCommercialChannelSIAMEntity commercialChannelEntityToUserCommercialChannelSIAMEntity(CommercialChannelEntity commercialChannelEntity) {
        if ( commercialChannelEntity == null ) {
            return null;
        }

        UserCommercialChannelSIAMEntity userCommercialChannelSIAMEntity = new UserCommercialChannelSIAMEntity();

        userCommercialChannelSIAMEntity.setCreatedAt( commercialChannelEntity.getCreatedAt() );
        userCommercialChannelSIAMEntity.setDeleteAt( commercialChannelEntity.getDeleteAt() );
        userCommercialChannelSIAMEntity.setState( commercialChannelEntity.isState() );
        userCommercialChannelSIAMEntity.setUpdateAt( commercialChannelEntity.getUpdateAt() );
        userCommercialChannelSIAMEntity.setUserCreate( commercialChannelEntity.getUserCreate() );
        userCommercialChannelSIAMEntity.setUserDelete( commercialChannelEntity.getUserDelete() );
        userCommercialChannelSIAMEntity.setUserUpdate( commercialChannelEntity.getUserUpdate() );

        return userCommercialChannelSIAMEntity;
    }

    protected List<UserCommercialChannelSIAMEntity> commercialChannelEntityListToUserCommercialChannelSIAMEntityList(List<CommercialChannelEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<UserCommercialChannelSIAMEntity> list1 = new ArrayList<UserCommercialChannelSIAMEntity>( list.size() );
        for ( CommercialChannelEntity commercialChannelEntity : list ) {
            list1.add( commercialChannelEntityToUserCommercialChannelSIAMEntity( commercialChannelEntity ) );
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

    protected CompanyDomainSIAMEntity companyDomainEntityToCompanyDomainSIAMEntity(CompanyDomainEntity companyDomainEntity) {
        if ( companyDomainEntity == null ) {
            return null;
        }

        CompanyDomainSIAMEntity companyDomainSIAMEntity = new CompanyDomainSIAMEntity();

        companyDomainSIAMEntity.setDominio( companyDomainEntity.getDominio() );
        companyDomainSIAMEntity.setDominioId( companyDomainEntity.getDominioId() );

        return companyDomainSIAMEntity;
    }

    protected List<CompanyDomainSIAMEntity> companyDomainEntityListToCompanyDomainSIAMEntityList(List<CompanyDomainEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CompanyDomainSIAMEntity> list1 = new ArrayList<CompanyDomainSIAMEntity>( list.size() );
        for ( CompanyDomainEntity companyDomainEntity : list ) {
            list1.add( companyDomainEntityToCompanyDomainSIAMEntity( companyDomainEntity ) );
        }

        return list1;
    }

    protected CompanySIAMEntity companyEntityToCompanySIAMEntity(CompanyEntity companyEntity) {
        if ( companyEntity == null ) {
            return null;
        }

        CompanySIAMEntity companySIAMEntity = new CompanySIAMEntity();

        companySIAMEntity.setDominios( companyDomainEntityListToCompanyDomainSIAMEntityList( companyEntity.getDominios() ) );
        companySIAMEntity.setEmpresaId( companyEntity.getEmpresaId() );
        companySIAMEntity.setNombreEmpresa( companyEntity.getNombreEmpresa() );

        return companySIAMEntity;
    }

    protected EntitySIAMEntity corporationEntityToEntitySIAMEntity(CorporationEntity corporationEntity) {
        if ( corporationEntity == null ) {
            return null;
        }

        EntitySIAMEntity entitySIAMEntity = new EntitySIAMEntity();

        entitySIAMEntity.setCodigo( corporationEntity.getCodigo() );
        entitySIAMEntity.setEmpresa( companyEntityToCompanySIAMEntity( corporationEntity.getEmpresa() ) );
        entitySIAMEntity.setEntidadId( corporationEntity.getEntidadId() );
        entitySIAMEntity.setNombreEntidad( corporationEntity.getNombreEntidad() );

        return entitySIAMEntity;
    }

    protected PointSaleSIAMEntity pointSaleEntityToPointSaleSIAMEntity(PointSaleEntity pointSaleEntity) {
        if ( pointSaleEntity == null ) {
            return null;
        }

        PointSaleSIAMEntity pointSaleSIAMEntity = new PointSaleSIAMEntity();

        pointSaleSIAMEntity.setCodigo( pointSaleEntity.getCodigo() );
        pointSaleSIAMEntity.setCodigoAgencia( pointSaleEntity.getCodigoAgencia() );
        pointSaleSIAMEntity.setCodigoAtis( pointSaleEntity.getCodigoAtis() );
        pointSaleSIAMEntity.setDireccion( pointSaleEntity.getDireccion() );
        pointSaleSIAMEntity.setEntidad( corporationEntityToEntitySIAMEntity( pointSaleEntity.getEntidad() ) );
        pointSaleSIAMEntity.setGrupoAd( pointSaleEntity.getGrupoAd() );
        pointSaleSIAMEntity.setNombrePuntoVenta( pointSaleEntity.getNombrePuntoVenta() );
        pointSaleSIAMEntity.setPuntoVentaId( pointSaleEntity.getPuntoVentaId() );
        pointSaleSIAMEntity.setUbigeo( pointSaleEntity.getUbigeo() );

        return pointSaleSIAMEntity;
    }

    protected UserSecuritySIAMEntity userSecurityEntityToUserSecuritySIAMEntity(UserSecurityEntity userSecurityEntity) {
        if ( userSecurityEntity == null ) {
            return null;
        }

        UserSecuritySIAMEntity userSecuritySIAMEntity = new UserSecuritySIAMEntity();

        userSecuritySIAMEntity.setCreatedAt( userSecurityEntity.getCreatedAt() );
        userSecuritySIAMEntity.setDeleteAt( userSecurityEntity.getDeleteAt() );
        userSecuritySIAMEntity.setState( userSecurityEntity.isState() );
        userSecuritySIAMEntity.setUpdateAt( userSecurityEntity.getUpdateAt() );
        userSecuritySIAMEntity.setUserCreate( userSecurityEntity.getUserCreate() );
        userSecuritySIAMEntity.setUserDelete( userSecurityEntity.getUserDelete() );
        userSecuritySIAMEntity.setUserUpdate( userSecurityEntity.getUserUpdate() );
        userSecuritySIAMEntity.setBloqueado( userSecurityEntity.isBloqueado() );
        userSecuritySIAMEntity.setBloqueo( locksEntityToLocksSIAMEntity( userSecurityEntity.getBloqueo() ) );
        userSecuritySIAMEntity.setBloqueoAllApp( userSecurityEntity.getBloqueoAllApp() );
        userSecuritySIAMEntity.setCanalesComerciales( commercialChannelEntityListToUserCommercialChannelSIAMEntityList( userSecurityEntity.getCanalesComerciales() ) );
        userSecuritySIAMEntity.setIpUsuarioActualiza( userSecurityEntity.getIpUsuarioActualiza() );
        userSecuritySIAMEntity.setIpUsuarioCreacion( userSecurityEntity.getIpUsuarioCreacion() );
        userSecuritySIAMEntity.setIpUsuarioElimina( userSecurityEntity.getIpUsuarioElimina() );
        userSecuritySIAMEntity.setPersona( personEntityToPersonSIAMEntity( userSecurityEntity.getPersona() ) );
        userSecuritySIAMEntity.setPuntoVenta( pointSaleEntityToPointSaleSIAMEntity( userSecurityEntity.getPuntoVenta() ) );
        userSecuritySIAMEntity.setUsuarioId( userSecurityEntity.getUsuarioId() );

        return userSecuritySIAMEntity;
    }

    protected TicketStatusSIAMEntity ticketStatusEntityToTicketStatusSIAMEntity(TicketStatusEntity ticketStatusEntity) {
        if ( ticketStatusEntity == null ) {
            return null;
        }

        TicketStatusSIAMEntity ticketStatusSIAMEntity = new TicketStatusSIAMEntity();

        ticketStatusSIAMEntity.setColorSemaforoHex( ticketStatusEntity.getColorSemaforoHex() );
        ticketStatusSIAMEntity.setColorSemaforoRgb( ticketStatusEntity.getColorSemaforoRgb() );
        ticketStatusSIAMEntity.setEstadoTicketId( ticketStatusEntity.getEstadoTicketId() );
        ticketStatusSIAMEntity.setNombreEstadoTicket( ticketStatusEntity.getNombreEstadoTicket() );

        return ticketStatusSIAMEntity;
    }

    protected TicketExecutionStatusSIAMEntity ticketExecutionStatusEntityToTicketExecutionStatusSIAMEntity(TicketExecutionStatusEntity ticketExecutionStatusEntity) {
        if ( ticketExecutionStatusEntity == null ) {
            return null;
        }

        TicketExecutionStatusSIAMEntity ticketExecutionStatusSIAMEntity = new TicketExecutionStatusSIAMEntity();

        ticketExecutionStatusSIAMEntity.setEstadoEjecucionTicId( ticketExecutionStatusEntity.getEstadoEjecucionTicId() );
        ticketExecutionStatusSIAMEntity.setEstadoTicket( ticketStatusEntityToTicketStatusSIAMEntity( ticketExecutionStatusEntity.getEstadoTicket() ) );
        ticketExecutionStatusSIAMEntity.setNombreEstadoEjecucionTic( ticketExecutionStatusEntity.getNombreEstadoEjecucionTic() );

        return ticketExecutionStatusSIAMEntity;
    }

    protected TicketRequestStatusSIAMEntity ticketRequestStatusEntityToTicketRequestStatusSIAMEntity(TicketRequestStatusEntity ticketRequestStatusEntity) {
        if ( ticketRequestStatusEntity == null ) {
            return null;
        }

        TicketRequestStatusSIAMEntity ticketRequestStatusSIAMEntity = new TicketRequestStatusSIAMEntity();

        ticketRequestStatusSIAMEntity.setColorSemaforoHex( ticketRequestStatusEntity.getColorSemaforoHex() );
        ticketRequestStatusSIAMEntity.setColorSemaforoRgb( ticketRequestStatusEntity.getColorSemaforoRgb() );
        ticketRequestStatusSIAMEntity.setEstadoSolicitudId( ticketRequestStatusEntity.getEstadoSolicitudId() );
        ticketRequestStatusSIAMEntity.setNombreEstadoSolicitud( ticketRequestStatusEntity.getNombreEstadoSolicitud() );

        return ticketRequestStatusSIAMEntity;
    }

    protected TicketRequestExecutionStatusSIAMEntity ticketRequestExecutionStatusEntityToTicketRequestExecutionStatusSIAMEntity(TicketRequestExecutionStatusEntity ticketRequestExecutionStatusEntity) {
        if ( ticketRequestExecutionStatusEntity == null ) {
            return null;
        }

        TicketRequestExecutionStatusSIAMEntity ticketRequestExecutionStatusSIAMEntity = new TicketRequestExecutionStatusSIAMEntity();

        ticketRequestExecutionStatusSIAMEntity.setEstadoEjecucionSolId( ticketRequestExecutionStatusEntity.getEstadoEjecucionSolId() );
        ticketRequestExecutionStatusSIAMEntity.setEstadoSolicitud( ticketRequestStatusEntityToTicketRequestStatusSIAMEntity( ticketRequestExecutionStatusEntity.getEstadoSolicitud() ) );
        ticketRequestExecutionStatusSIAMEntity.setNombreEstadoEjecucionSol( ticketRequestExecutionStatusEntity.getNombreEstadoEjecucionSol() );

        return ticketRequestExecutionStatusSIAMEntity;
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

    protected PersonRequestSIAMEntity personRequestEntityToPersonRequestSIAMEntity(PersonRequestEntity personRequestEntity) {
        if ( personRequestEntity == null ) {
            return null;
        }

        PersonRequestSIAMEntity personRequestSIAMEntity = new PersonRequestSIAMEntity();

        personRequestSIAMEntity.setCreatedAt( personRequestEntity.getCreatedAt() );
        personRequestSIAMEntity.setDeleteAt( personRequestEntity.getDeleteAt() );
        personRequestSIAMEntity.setState( personRequestEntity.isState() );
        personRequestSIAMEntity.setUpdateAt( personRequestEntity.getUpdateAt() );
        personRequestSIAMEntity.setUserCreate( personRequestEntity.getUserCreate() );
        personRequestSIAMEntity.setUserDelete( personRequestEntity.getUserDelete() );
        personRequestSIAMEntity.setUserUpdate( personRequestEntity.getUserUpdate() );
        personRequestSIAMEntity.setAutenticacionBiometrica( personRequestEntity.isAutenticacionBiometrica() );
        personRequestSIAMEntity.setCelular( personRequestEntity.getCelular() );
        personRequestSIAMEntity.setEmail( personRequestEntity.getEmail() );
        personRequestSIAMEntity.setEsVendedor( personRequestEntity.isEsVendedor() );
        personRequestSIAMEntity.setMaterno( personRequestEntity.getMaterno() );
        personRequestSIAMEntity.setNombres( personRequestEntity.getNombres() );
        personRequestSIAMEntity.setNumDocumento( personRequestEntity.getNumDocumento() );
        personRequestSIAMEntity.setPaterno( personRequestEntity.getPaterno() );
        personRequestSIAMEntity.setTelefonoFijo( personRequestEntity.getTelefonoFijo() );
        personRequestSIAMEntity.setTipoDocumento( documentTypeEntityToDocumentTypeSIAMEntity( personRequestEntity.getTipoDocumento() ) );

        return personRequestSIAMEntity;
    }

    protected TicketRequestSIAMEntity ticketRequestEntityToTicketRequestSIAMEntity(TicketRequestEntity ticketRequestEntity) {
        if ( ticketRequestEntity == null ) {
            return null;
        }

        TicketRequestSIAMEntity ticketRequestSIAMEntity = new TicketRequestSIAMEntity();

        ticketRequestSIAMEntity.setCreatedAt( ticketRequestEntity.getCreatedAt() );
        ticketRequestSIAMEntity.setDeleteAt( ticketRequestEntity.getDeleteAt() );
        ticketRequestSIAMEntity.setState( ticketRequestEntity.isState() );
        ticketRequestSIAMEntity.setUpdateAt( ticketRequestEntity.getUpdateAt() );
        ticketRequestSIAMEntity.setUserCreate( ticketRequestEntity.getUserCreate() );
        ticketRequestSIAMEntity.setUserDelete( ticketRequestEntity.getUserDelete() );
        ticketRequestSIAMEntity.setUserUpdate( ticketRequestEntity.getUserUpdate() );
        if ( ticketRequestEntity.getAplicacionId() != null ) {
            ticketRequestSIAMEntity.setAplicacionId( String.valueOf( ticketRequestEntity.getAplicacionId() ) );
        }
        ticketRequestSIAMEntity.setComentario( ticketRequestEntity.getComentario() );
        ticketRequestSIAMEntity.setContrasena( ticketRequestEntity.getContrasena() );
        ticketRequestSIAMEntity.setEstadoEjecucionSol( ticketRequestExecutionStatusEntityToTicketRequestExecutionStatusSIAMEntity( ticketRequestEntity.getEstadoEjecucionSol() ) );
        ticketRequestSIAMEntity.setFechaAprobacion( ticketRequestEntity.getFechaAprobacion() );
        ticketRequestSIAMEntity.setFechaCese( ticketRequestEntity.getFechaCese() );
        ticketRequestSIAMEntity.setPersona( personEntityToPersonSIAMEntity( ticketRequestEntity.getPersona() ) );
        ticketRequestSIAMEntity.setPuntoVenta( pointSaleEntityToPointSaleSIAMEntity( ticketRequestEntity.getPuntoVenta() ) );
        ticketRequestSIAMEntity.setRolFuncional( functionalRoleEntityToFunctionalRoleSIAMEntity( ticketRequestEntity.getRolFuncional() ) );
        ticketRequestSIAMEntity.setSolicitudId( ticketRequestEntity.getSolicitudId() );
        ticketRequestSIAMEntity.setSolicitudPersona( personRequestEntityToPersonRequestSIAMEntity( ticketRequestEntity.getSolicitudPersona() ) );
        ticketRequestSIAMEntity.setSubticketNumero( ticketRequestEntity.getSubticketNumero() );

        return ticketRequestSIAMEntity;
    }

    protected List<TicketRequestSIAMEntity> ticketRequestEntityListToTicketRequestSIAMEntityList(List<TicketRequestEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<TicketRequestSIAMEntity> list1 = new ArrayList<TicketRequestSIAMEntity>( list.size() );
        for ( TicketRequestEntity ticketRequestEntity : list ) {
            list1.add( ticketRequestEntityToTicketRequestSIAMEntity( ticketRequestEntity ) );
        }

        return list1;
    }

    protected TicketRequestTypeSIAMEntity ticketRequestTypeEntityToTicketRequestTypeSIAMEntity(TicketRequestTypeEntity ticketRequestTypeEntity) {
        if ( ticketRequestTypeEntity == null ) {
            return null;
        }

        TicketRequestTypeSIAMEntity ticketRequestTypeSIAMEntity = new TicketRequestTypeSIAMEntity();

        ticketRequestTypeSIAMEntity.setNombreTipoSolicitud( ticketRequestTypeEntity.getNombreTipoSolicitud() );
        ticketRequestTypeSIAMEntity.setTipoSolicitudId( ticketRequestTypeEntity.getTipoSolicitudId() );

        return ticketRequestTypeSIAMEntity;
    }

    protected TicketTypeSIAMEntity ticketTypeEntityToTicketTypeSIAMEntity(TicketTypeEntity ticketTypeEntity) {
        if ( ticketTypeEntity == null ) {
            return null;
        }

        TicketTypeSIAMEntity ticketTypeSIAMEntity = new TicketTypeSIAMEntity();

        ticketTypeSIAMEntity.setNombreTipoTicket( ticketTypeEntity.getNombreTipoTicket() );
        ticketTypeSIAMEntity.setTipoTicketId( ticketTypeEntity.getTipoTicketId() );

        return ticketTypeSIAMEntity;
    }

    protected TicketSIAMEntity ticketEntityToTicketSIAMEntity(TicketEntity ticketEntity) {
        if ( ticketEntity == null ) {
            return null;
        }

        TicketSIAMEntity ticketSIAMEntity = new TicketSIAMEntity();

        ticketSIAMEntity.setCreatedAt( ticketEntity.getCreatedAt() );
        ticketSIAMEntity.setDeleteAt( ticketEntity.getDeleteAt() );
        ticketSIAMEntity.setState( ticketEntity.isState() );
        ticketSIAMEntity.setUpdateAt( ticketEntity.getUpdateAt() );
        ticketSIAMEntity.setUserCreate( ticketEntity.getUserCreate() );
        ticketSIAMEntity.setUserDelete( ticketEntity.getUserDelete() );
        ticketSIAMEntity.setUserUpdate( ticketEntity.getUserUpdate() );
        ticketSIAMEntity.setAprobador( userSecurityEntityToUserSecuritySIAMEntity( ticketEntity.getAprobador() ) );
        ticketSIAMEntity.setCanalComercialId( ticketEntity.getCanalComercialId() );
        ticketSIAMEntity.setCantidadSolicitudes( ticketEntity.getCantidadSolicitudes() );
        ticketSIAMEntity.setEmpresaId( ticketEntity.getEmpresaId() );
        ticketSIAMEntity.setEstadoEjecucionTic( ticketExecutionStatusEntityToTicketExecutionStatusSIAMEntity( ticketEntity.getEstadoEjecucionTic() ) );
        ticketSIAMEntity.setFechaCierre( ticketEntity.getFechaCierre() );
        ticketSIAMEntity.setSolicitante( userSecurityEntityToUserSecuritySIAMEntity( ticketEntity.getSolicitante() ) );
        ticketSIAMEntity.setSolicitudes( ticketRequestEntityListToTicketRequestSIAMEntityList( ticketEntity.getSolicitudes() ) );
        ticketSIAMEntity.setTicketId( ticketEntity.getTicketId() );
        ticketSIAMEntity.setTicketNumero( ticketEntity.getTicketNumero() );
        ticketSIAMEntity.setTipoSolicitud( ticketRequestTypeEntityToTicketRequestTypeSIAMEntity( ticketEntity.getTipoSolicitud() ) );
        ticketSIAMEntity.setTipoTicket( ticketTypeEntityToTicketTypeSIAMEntity( ticketEntity.getTipoTicket() ) );

        return ticketSIAMEntity;
    }

    protected LocksEntity locksSIAMEntityToLocksEntity(LocksSIAMEntity locksSIAMEntity) {
        if ( locksSIAMEntity == null ) {
            return null;
        }

        LocksEntity locksEntity = new LocksEntity();

        locksEntity.setCreatedAt( locksSIAMEntity.getCreatedAt() );
        locksEntity.setDeleteAt( locksSIAMEntity.getDeleteAt() );
        locksEntity.setState( locksSIAMEntity.isState() );
        locksEntity.setUpdateAt( locksSIAMEntity.getUpdateAt() );
        locksEntity.setUserCreate( locksSIAMEntity.getUserCreate() );
        locksEntity.setUserDelete( locksSIAMEntity.getUserDelete() );
        locksEntity.setUserUpdate( locksSIAMEntity.getUserUpdate() );
        locksEntity.setBloqueo( locksSIAMEntity.getBloqueo() );
        locksEntity.setBloqueoId( locksSIAMEntity.getBloqueoId() );
        locksEntity.setComentario( locksSIAMEntity.getComentario() );
        locksEntity.setUsuarioId( locksSIAMEntity.getUsuarioId() );

        return locksEntity;
    }

    protected CommercialChannelEntity userCommercialChannelSIAMEntityToCommercialChannelEntity(UserCommercialChannelSIAMEntity userCommercialChannelSIAMEntity) {
        if ( userCommercialChannelSIAMEntity == null ) {
            return null;
        }

        CommercialChannelEntity commercialChannelEntity = new CommercialChannelEntity();

        commercialChannelEntity.setCreatedAt( userCommercialChannelSIAMEntity.getCreatedAt() );
        commercialChannelEntity.setDeleteAt( userCommercialChannelSIAMEntity.getDeleteAt() );
        commercialChannelEntity.setState( userCommercialChannelSIAMEntity.isState() );
        commercialChannelEntity.setUpdateAt( userCommercialChannelSIAMEntity.getUpdateAt() );
        commercialChannelEntity.setUserCreate( userCommercialChannelSIAMEntity.getUserCreate() );
        commercialChannelEntity.setUserDelete( userCommercialChannelSIAMEntity.getUserDelete() );
        commercialChannelEntity.setUserUpdate( userCommercialChannelSIAMEntity.getUserUpdate() );

        return commercialChannelEntity;
    }

    protected List<CommercialChannelEntity> userCommercialChannelSIAMEntityListToCommercialChannelEntityList(List<UserCommercialChannelSIAMEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CommercialChannelEntity> list1 = new ArrayList<CommercialChannelEntity>( list.size() );
        for ( UserCommercialChannelSIAMEntity userCommercialChannelSIAMEntity : list ) {
            list1.add( userCommercialChannelSIAMEntityToCommercialChannelEntity( userCommercialChannelSIAMEntity ) );
        }

        return list1;
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

    protected CompanyDomainEntity companyDomainSIAMEntityToCompanyDomainEntity(CompanyDomainSIAMEntity companyDomainSIAMEntity) {
        if ( companyDomainSIAMEntity == null ) {
            return null;
        }

        CompanyDomainEntity companyDomainEntity = new CompanyDomainEntity();

        companyDomainEntity.setDominio( companyDomainSIAMEntity.getDominio() );
        companyDomainEntity.setDominioId( companyDomainSIAMEntity.getDominioId() );

        return companyDomainEntity;
    }

    protected List<CompanyDomainEntity> companyDomainSIAMEntityListToCompanyDomainEntityList(List<CompanyDomainSIAMEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<CompanyDomainEntity> list1 = new ArrayList<CompanyDomainEntity>( list.size() );
        for ( CompanyDomainSIAMEntity companyDomainSIAMEntity : list ) {
            list1.add( companyDomainSIAMEntityToCompanyDomainEntity( companyDomainSIAMEntity ) );
        }

        return list1;
    }

    protected CompanyEntity companySIAMEntityToCompanyEntity(CompanySIAMEntity companySIAMEntity) {
        if ( companySIAMEntity == null ) {
            return null;
        }

        CompanyEntity companyEntity = new CompanyEntity();

        companyEntity.setDominios( companyDomainSIAMEntityListToCompanyDomainEntityList( companySIAMEntity.getDominios() ) );
        companyEntity.setEmpresaId( companySIAMEntity.getEmpresaId() );
        companyEntity.setNombreEmpresa( companySIAMEntity.getNombreEmpresa() );

        return companyEntity;
    }

    protected CorporationEntity entitySIAMEntityToCorporationEntity(EntitySIAMEntity entitySIAMEntity) {
        if ( entitySIAMEntity == null ) {
            return null;
        }

        CorporationEntity corporationEntity = new CorporationEntity();

        corporationEntity.setCodigo( entitySIAMEntity.getCodigo() );
        corporationEntity.setEmpresa( companySIAMEntityToCompanyEntity( entitySIAMEntity.getEmpresa() ) );
        corporationEntity.setEntidadId( entitySIAMEntity.getEntidadId() );
        corporationEntity.setNombreEntidad( entitySIAMEntity.getNombreEntidad() );

        return corporationEntity;
    }

    protected PointSaleEntity pointSaleSIAMEntityToPointSaleEntity(PointSaleSIAMEntity pointSaleSIAMEntity) {
        if ( pointSaleSIAMEntity == null ) {
            return null;
        }

        PointSaleEntity pointSaleEntity = new PointSaleEntity();

        pointSaleEntity.setCodigo( pointSaleSIAMEntity.getCodigo() );
        pointSaleEntity.setCodigoAgencia( pointSaleSIAMEntity.getCodigoAgencia() );
        pointSaleEntity.setCodigoAtis( pointSaleSIAMEntity.getCodigoAtis() );
        pointSaleEntity.setDireccion( pointSaleSIAMEntity.getDireccion() );
        pointSaleEntity.setEntidad( entitySIAMEntityToCorporationEntity( pointSaleSIAMEntity.getEntidad() ) );
        pointSaleEntity.setGrupoAd( pointSaleSIAMEntity.getGrupoAd() );
        pointSaleEntity.setNombrePuntoVenta( pointSaleSIAMEntity.getNombrePuntoVenta() );
        pointSaleEntity.setPuntoVentaId( pointSaleSIAMEntity.getPuntoVentaId() );
        pointSaleEntity.setUbigeo( pointSaleSIAMEntity.getUbigeo() );

        return pointSaleEntity;
    }

    protected UserSecurityEntity userSecuritySIAMEntityToUserSecurityEntity(UserSecuritySIAMEntity userSecuritySIAMEntity) {
        if ( userSecuritySIAMEntity == null ) {
            return null;
        }

        UserSecurityEntity userSecurityEntity = new UserSecurityEntity();

        userSecurityEntity.setCreatedAt( userSecuritySIAMEntity.getCreatedAt() );
        userSecurityEntity.setDeleteAt( userSecuritySIAMEntity.getDeleteAt() );
        userSecurityEntity.setState( userSecuritySIAMEntity.isState() );
        userSecurityEntity.setUpdateAt( userSecuritySIAMEntity.getUpdateAt() );
        userSecurityEntity.setUserCreate( userSecuritySIAMEntity.getUserCreate() );
        userSecurityEntity.setUserDelete( userSecuritySIAMEntity.getUserDelete() );
        userSecurityEntity.setUserUpdate( userSecuritySIAMEntity.getUserUpdate() );
        userSecurityEntity.setBloqueado( userSecuritySIAMEntity.isBloqueado() );
        userSecurityEntity.setBloqueo( locksSIAMEntityToLocksEntity( userSecuritySIAMEntity.getBloqueo() ) );
        userSecurityEntity.setBloqueoAllApp( userSecuritySIAMEntity.getBloqueoAllApp() );
        userSecurityEntity.setCanalesComerciales( userCommercialChannelSIAMEntityListToCommercialChannelEntityList( userSecuritySIAMEntity.getCanalesComerciales() ) );
        userSecurityEntity.setIpUsuarioActualiza( userSecuritySIAMEntity.getIpUsuarioActualiza() );
        userSecurityEntity.setIpUsuarioCreacion( userSecuritySIAMEntity.getIpUsuarioCreacion() );
        userSecurityEntity.setIpUsuarioElimina( userSecuritySIAMEntity.getIpUsuarioElimina() );
        userSecurityEntity.setPersona( personSIAMEntityToPersonEntity( userSecuritySIAMEntity.getPersona() ) );
        userSecurityEntity.setPuntoVenta( pointSaleSIAMEntityToPointSaleEntity( userSecuritySIAMEntity.getPuntoVenta() ) );
        userSecurityEntity.setUsuarioId( userSecuritySIAMEntity.getUsuarioId() );

        return userSecurityEntity;
    }

    protected TicketStatusEntity ticketStatusSIAMEntityToTicketStatusEntity(TicketStatusSIAMEntity ticketStatusSIAMEntity) {
        if ( ticketStatusSIAMEntity == null ) {
            return null;
        }

        TicketStatusEntity ticketStatusEntity = new TicketStatusEntity();

        ticketStatusEntity.setColorSemaforoHex( ticketStatusSIAMEntity.getColorSemaforoHex() );
        ticketStatusEntity.setColorSemaforoRgb( ticketStatusSIAMEntity.getColorSemaforoRgb() );
        ticketStatusEntity.setEstadoTicketId( ticketStatusSIAMEntity.getEstadoTicketId() );
        ticketStatusEntity.setNombreEstadoTicket( ticketStatusSIAMEntity.getNombreEstadoTicket() );

        return ticketStatusEntity;
    }

    protected TicketExecutionStatusEntity ticketExecutionStatusSIAMEntityToTicketExecutionStatusEntity(TicketExecutionStatusSIAMEntity ticketExecutionStatusSIAMEntity) {
        if ( ticketExecutionStatusSIAMEntity == null ) {
            return null;
        }

        TicketExecutionStatusEntity ticketExecutionStatusEntity = new TicketExecutionStatusEntity();

        ticketExecutionStatusEntity.setEstadoEjecucionTicId( ticketExecutionStatusSIAMEntity.getEstadoEjecucionTicId() );
        ticketExecutionStatusEntity.setEstadoTicket( ticketStatusSIAMEntityToTicketStatusEntity( ticketExecutionStatusSIAMEntity.getEstadoTicket() ) );
        ticketExecutionStatusEntity.setNombreEstadoEjecucionTic( ticketExecutionStatusSIAMEntity.getNombreEstadoEjecucionTic() );

        return ticketExecutionStatusEntity;
    }

    protected TicketRequestStatusEntity ticketRequestStatusSIAMEntityToTicketRequestStatusEntity(TicketRequestStatusSIAMEntity ticketRequestStatusSIAMEntity) {
        if ( ticketRequestStatusSIAMEntity == null ) {
            return null;
        }

        TicketRequestStatusEntity ticketRequestStatusEntity = new TicketRequestStatusEntity();

        ticketRequestStatusEntity.setColorSemaforoHex( ticketRequestStatusSIAMEntity.getColorSemaforoHex() );
        ticketRequestStatusEntity.setColorSemaforoRgb( ticketRequestStatusSIAMEntity.getColorSemaforoRgb() );
        ticketRequestStatusEntity.setEstadoSolicitudId( ticketRequestStatusSIAMEntity.getEstadoSolicitudId() );
        ticketRequestStatusEntity.setNombreEstadoSolicitud( ticketRequestStatusSIAMEntity.getNombreEstadoSolicitud() );

        return ticketRequestStatusEntity;
    }

    protected TicketRequestExecutionStatusEntity ticketRequestExecutionStatusSIAMEntityToTicketRequestExecutionStatusEntity(TicketRequestExecutionStatusSIAMEntity ticketRequestExecutionStatusSIAMEntity) {
        if ( ticketRequestExecutionStatusSIAMEntity == null ) {
            return null;
        }

        TicketRequestExecutionStatusEntity ticketRequestExecutionStatusEntity = new TicketRequestExecutionStatusEntity();

        ticketRequestExecutionStatusEntity.setEstadoEjecucionSolId( ticketRequestExecutionStatusSIAMEntity.getEstadoEjecucionSolId() );
        ticketRequestExecutionStatusEntity.setEstadoSolicitud( ticketRequestStatusSIAMEntityToTicketRequestStatusEntity( ticketRequestExecutionStatusSIAMEntity.getEstadoSolicitud() ) );
        ticketRequestExecutionStatusEntity.setNombreEstadoEjecucionSol( ticketRequestExecutionStatusSIAMEntity.getNombreEstadoEjecucionSol() );

        return ticketRequestExecutionStatusEntity;
    }

    protected FunctionalRoleEntity functionalRoleSIAMEntityToFunctionalRoleEntity(FunctionalRoleSIAMEntity functionalRoleSIAMEntity) {
        if ( functionalRoleSIAMEntity == null ) {
            return null;
        }

        FunctionalRoleEntity functionalRoleEntity = new FunctionalRoleEntity();

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

    protected PersonRequestEntity personRequestSIAMEntityToPersonRequestEntity(PersonRequestSIAMEntity personRequestSIAMEntity) {
        if ( personRequestSIAMEntity == null ) {
            return null;
        }

        PersonRequestEntity personRequestEntity = new PersonRequestEntity();

        personRequestEntity.setCreatedAt( personRequestSIAMEntity.getCreatedAt() );
        personRequestEntity.setDeleteAt( personRequestSIAMEntity.getDeleteAt() );
        personRequestEntity.setState( personRequestSIAMEntity.isState() );
        personRequestEntity.setUpdateAt( personRequestSIAMEntity.getUpdateAt() );
        personRequestEntity.setUserCreate( personRequestSIAMEntity.getUserCreate() );
        personRequestEntity.setUserDelete( personRequestSIAMEntity.getUserDelete() );
        personRequestEntity.setUserUpdate( personRequestSIAMEntity.getUserUpdate() );
        if ( personRequestSIAMEntity.getAutenticacionBiometrica() != null ) {
            personRequestEntity.setAutenticacionBiometrica( personRequestSIAMEntity.getAutenticacionBiometrica() );
        }
        personRequestEntity.setCelular( personRequestSIAMEntity.getCelular() );
        personRequestEntity.setEmail( personRequestSIAMEntity.getEmail() );
        if ( personRequestSIAMEntity.getEsVendedor() != null ) {
            personRequestEntity.setEsVendedor( personRequestSIAMEntity.getEsVendedor() );
        }
        personRequestEntity.setMaterno( personRequestSIAMEntity.getMaterno() );
        personRequestEntity.setNombres( personRequestSIAMEntity.getNombres() );
        personRequestEntity.setNumDocumento( personRequestSIAMEntity.getNumDocumento() );
        personRequestEntity.setPaterno( personRequestSIAMEntity.getPaterno() );
        personRequestEntity.setTelefonoFijo( personRequestSIAMEntity.getTelefonoFijo() );
        personRequestEntity.setTipoDocumento( documentTypeSIAMEntityToDocumentTypeEntity( personRequestSIAMEntity.getTipoDocumento() ) );

        return personRequestEntity;
    }

    protected TicketRequestEntity ticketRequestSIAMEntityToTicketRequestEntity(TicketRequestSIAMEntity ticketRequestSIAMEntity) {
        if ( ticketRequestSIAMEntity == null ) {
            return null;
        }

        TicketRequestEntity ticketRequestEntity = new TicketRequestEntity();

        ticketRequestEntity.setCreatedAt( ticketRequestSIAMEntity.getCreatedAt() );
        ticketRequestEntity.setDeleteAt( ticketRequestSIAMEntity.getDeleteAt() );
        ticketRequestEntity.setState( ticketRequestSIAMEntity.isState() );
        ticketRequestEntity.setUpdateAt( ticketRequestSIAMEntity.getUpdateAt() );
        ticketRequestEntity.setUserCreate( ticketRequestSIAMEntity.getUserCreate() );
        ticketRequestEntity.setUserDelete( ticketRequestSIAMEntity.getUserDelete() );
        ticketRequestEntity.setUserUpdate( ticketRequestSIAMEntity.getUserUpdate() );
        if ( ticketRequestSIAMEntity.getAplicacionId() != null ) {
            ticketRequestEntity.setAplicacionId( Integer.parseInt( ticketRequestSIAMEntity.getAplicacionId() ) );
        }
        ticketRequestEntity.setComentario( ticketRequestSIAMEntity.getComentario() );
        ticketRequestEntity.setContrasena( ticketRequestSIAMEntity.getContrasena() );
        ticketRequestEntity.setEstadoEjecucionSol( ticketRequestExecutionStatusSIAMEntityToTicketRequestExecutionStatusEntity( ticketRequestSIAMEntity.getEstadoEjecucionSol() ) );
        ticketRequestEntity.setFechaAprobacion( ticketRequestSIAMEntity.getFechaAprobacion() );
        ticketRequestEntity.setFechaCese( ticketRequestSIAMEntity.getFechaCese() );
        ticketRequestEntity.setPersona( personSIAMEntityToPersonEntity( ticketRequestSIAMEntity.getPersona() ) );
        ticketRequestEntity.setPuntoVenta( pointSaleSIAMEntityToPointSaleEntity( ticketRequestSIAMEntity.getPuntoVenta() ) );
        ticketRequestEntity.setRolFuncional( functionalRoleSIAMEntityToFunctionalRoleEntity( ticketRequestSIAMEntity.getRolFuncional() ) );
        ticketRequestEntity.setSolicitudId( ticketRequestSIAMEntity.getSolicitudId() );
        ticketRequestEntity.setSolicitudPersona( personRequestSIAMEntityToPersonRequestEntity( ticketRequestSIAMEntity.getSolicitudPersona() ) );
        ticketRequestEntity.setSubticketNumero( ticketRequestSIAMEntity.getSubticketNumero() );

        return ticketRequestEntity;
    }

    protected List<TicketRequestEntity> ticketRequestSIAMEntityListToTicketRequestEntityList(List<TicketRequestSIAMEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<TicketRequestEntity> list1 = new ArrayList<TicketRequestEntity>( list.size() );
        for ( TicketRequestSIAMEntity ticketRequestSIAMEntity : list ) {
            list1.add( ticketRequestSIAMEntityToTicketRequestEntity( ticketRequestSIAMEntity ) );
        }

        return list1;
    }

    protected TicketRequestTypeEntity ticketRequestTypeSIAMEntityToTicketRequestTypeEntity(TicketRequestTypeSIAMEntity ticketRequestTypeSIAMEntity) {
        if ( ticketRequestTypeSIAMEntity == null ) {
            return null;
        }

        TicketRequestTypeEntity ticketRequestTypeEntity = new TicketRequestTypeEntity();

        ticketRequestTypeEntity.setNombreTipoSolicitud( ticketRequestTypeSIAMEntity.getNombreTipoSolicitud() );
        ticketRequestTypeEntity.setTipoSolicitudId( ticketRequestTypeSIAMEntity.getTipoSolicitudId() );

        return ticketRequestTypeEntity;
    }

    protected TicketTypeEntity ticketTypeSIAMEntityToTicketTypeEntity(TicketTypeSIAMEntity ticketTypeSIAMEntity) {
        if ( ticketTypeSIAMEntity == null ) {
            return null;
        }

        TicketTypeEntity ticketTypeEntity = new TicketTypeEntity();

        ticketTypeEntity.setNombreTipoTicket( ticketTypeSIAMEntity.getNombreTipoTicket() );
        ticketTypeEntity.setTipoTicketId( ticketTypeSIAMEntity.getTipoTicketId() );

        return ticketTypeEntity;
    }

    protected TicketEntity ticketSIAMEntityToTicketEntity(TicketSIAMEntity ticketSIAMEntity) {
        if ( ticketSIAMEntity == null ) {
            return null;
        }

        TicketEntity ticketEntity = new TicketEntity();

        ticketEntity.setCreatedAt( ticketSIAMEntity.getCreatedAt() );
        ticketEntity.setDeleteAt( ticketSIAMEntity.getDeleteAt() );
        ticketEntity.setState( ticketSIAMEntity.isState() );
        ticketEntity.setUpdateAt( ticketSIAMEntity.getUpdateAt() );
        ticketEntity.setUserCreate( ticketSIAMEntity.getUserCreate() );
        ticketEntity.setUserDelete( ticketSIAMEntity.getUserDelete() );
        ticketEntity.setUserUpdate( ticketSIAMEntity.getUserUpdate() );
        ticketEntity.setAprobador( userSecuritySIAMEntityToUserSecurityEntity( ticketSIAMEntity.getAprobador() ) );
        ticketEntity.setCanalComercialId( ticketSIAMEntity.getCanalComercialId() );
        ticketEntity.setCantidadSolicitudes( ticketSIAMEntity.getCantidadSolicitudes() );
        ticketEntity.setEmpresaId( ticketSIAMEntity.getEmpresaId() );
        ticketEntity.setEstadoEjecucionTic( ticketExecutionStatusSIAMEntityToTicketExecutionStatusEntity( ticketSIAMEntity.getEstadoEjecucionTic() ) );
        ticketEntity.setFechaCierre( ticketSIAMEntity.getFechaCierre() );
        ticketEntity.setSolicitante( userSecuritySIAMEntityToUserSecurityEntity( ticketSIAMEntity.getSolicitante() ) );
        ticketEntity.setSolicitudes( ticketRequestSIAMEntityListToTicketRequestEntityList( ticketSIAMEntity.getSolicitudes() ) );
        ticketEntity.setTicketId( ticketSIAMEntity.getTicketId() );
        ticketEntity.setTicketNumero( ticketSIAMEntity.getTicketNumero() );
        ticketEntity.setTipoSolicitud( ticketRequestTypeSIAMEntityToTicketRequestTypeEntity( ticketSIAMEntity.getTipoSolicitud() ) );
        ticketEntity.setTipoTicket( ticketTypeSIAMEntityToTicketTypeEntity( ticketSIAMEntity.getTipoTicket() ) );

        return ticketEntity;
    }
}
