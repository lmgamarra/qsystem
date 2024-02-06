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
import pe.telefonica.siam.domain.entity.CredentialEntity;
import pe.telefonica.siam.domain.entity.DocumentTypeEntity;
import pe.telefonica.siam.domain.entity.GenericChannelEntity;
import pe.telefonica.siam.domain.entity.LocksEntity;
import pe.telefonica.siam.domain.entity.PersonEntity;
import pe.telefonica.siam.domain.entity.PointSaleEntity;
import pe.telefonica.siam.domain.entity.ResponsableEntity;
import pe.telefonica.siam.domain.entity.UserSecurityEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.AmdocsChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CompanyDomainSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CompanySIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CredentialSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.DocumentTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.EntitySIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.GenericChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.LocksSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PersonSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PointSaleSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ResponsableSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.UserCommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.UserSecuritySIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:20-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class CredentialSIAMMapperImpl implements CredentialSIAMMapper {

    @Override
    public CredentialSIAMEntity asCredentialSIAMEntity(CredentialEntity credentialEntity) {
        if ( credentialEntity == null ) {
            return null;
        }

        CredentialSIAMEntity credentialSIAMEntity = new CredentialSIAMEntity();

        credentialSIAMEntity.setCreatedAt( credentialEntity.getCreatedAt() );
        credentialSIAMEntity.setDeleteAt( credentialEntity.getDeleteAt() );
        credentialSIAMEntity.setState( credentialEntity.isState() );
        credentialSIAMEntity.setUpdateAt( credentialEntity.getUpdateAt() );
        credentialSIAMEntity.setUserCreate( credentialEntity.getUserCreate() );
        credentialSIAMEntity.setUserDelete( credentialEntity.getUserDelete() );
        credentialSIAMEntity.setUserUpdate( credentialEntity.getUserUpdate() );
        credentialSIAMEntity.setCredencialId( credentialEntity.getCredencialId() );
        credentialSIAMEntity.setPassword( credentialEntity.getPassword() );
        credentialSIAMEntity.setTipoCredencial( credentialEntity.getTipoCredencial() );
        credentialSIAMEntity.setUsuario( userSecurityEntityToUserSecuritySIAMEntity( credentialEntity.getUsuario() ) );

        return credentialSIAMEntity;
    }

    @Override
    public CredentialEntity asCredentialEntity(CredentialSIAMEntity credentialSIAMEntity) {
        if ( credentialSIAMEntity == null ) {
            return null;
        }

        CredentialEntity credentialEntity = new CredentialEntity();

        credentialEntity.setCreatedAt( credentialSIAMEntity.getCreatedAt() );
        credentialEntity.setDeleteAt( credentialSIAMEntity.getDeleteAt() );
        credentialEntity.setState( credentialSIAMEntity.isState() );
        credentialEntity.setUpdateAt( credentialSIAMEntity.getUpdateAt() );
        credentialEntity.setUserCreate( credentialSIAMEntity.getUserCreate() );
        credentialEntity.setUserDelete( credentialSIAMEntity.getUserDelete() );
        credentialEntity.setUserUpdate( credentialSIAMEntity.getUserUpdate() );
        credentialEntity.setCredencialId( credentialSIAMEntity.getCredencialId() );
        credentialEntity.setPassword( credentialSIAMEntity.getPassword() );
        credentialEntity.setTipoCredencial( credentialSIAMEntity.getTipoCredencial() );
        credentialEntity.setUsuario( userSecuritySIAMEntityToUserSecurityEntity( credentialSIAMEntity.getUsuario() ) );

        return credentialEntity;
    }

    @Override
    public List<CredentialSIAMEntity> asCredentialSIAMEntitys(List<CredentialEntity> credentialEntity) {
        if ( credentialEntity == null ) {
            return null;
        }

        List<CredentialSIAMEntity> list = new ArrayList<CredentialSIAMEntity>( credentialEntity.size() );
        for ( CredentialEntity credentialEntity1 : credentialEntity ) {
            list.add( asCredentialSIAMEntity( credentialEntity1 ) );
        }

        return list;
    }

    @Override
    public List<CredentialEntity> asCredentialEntitys(List<CredentialSIAMEntity> credentialSIAMEntitys) {
        if ( credentialSIAMEntitys == null ) {
            return null;
        }

        List<CredentialEntity> list = new ArrayList<CredentialEntity>( credentialSIAMEntitys.size() );
        for ( CredentialSIAMEntity credentialSIAMEntity : credentialSIAMEntitys ) {
            list.add( asCredentialEntity( credentialSIAMEntity ) );
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
}
