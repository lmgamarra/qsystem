package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.AmdocsChannelEntity;
import pe.telefonica.siam.domain.entity.ChannelEntity;
import pe.telefonica.siam.domain.entity.CommercialChannelEntity;
import pe.telefonica.siam.domain.entity.DocumentTypeEntity;
import pe.telefonica.siam.domain.entity.FunctionalRoleEntity;
import pe.telefonica.siam.domain.entity.GenericChannelEntity;
import pe.telefonica.siam.domain.entity.PersonEntity;
import pe.telefonica.siam.domain.entity.ResponsableEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.AmdocsChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.DocumentTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.FunctionalRoleSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.GenericChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PersonSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ResponsableSIAMEntity;
import pe.telefonica.siam.infrastructure.vo.FunctionalRoleVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:29-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class FunctionalRoleSIAMMapperImpl implements FunctionalRoleSIAMMapper {

    @Override
    public FunctionalRoleEntity asFunctionalRoleEntity(FunctionalRoleSIAMEntity functionalRoleSIAMEntity) {
        if ( functionalRoleSIAMEntity == null ) {
            return null;
        }

        FunctionalRoleEntity functionalRoleEntity = new FunctionalRoleEntity();

        functionalRoleEntity.setProfilesFunctional( FunctionalRoleSIAMMapper.asProfileFunctionalEntities( functionalRoleSIAMEntity.getPerfilesRolesFunctionales() ) );
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

    @Override
    public List<FunctionalRoleEntity> asFunctionalRoleEntitys(List<FunctionalRoleSIAMEntity> functionalRoleSIAMEntitys) {
        if ( functionalRoleSIAMEntitys == null ) {
            return null;
        }

        List<FunctionalRoleEntity> list = new ArrayList<FunctionalRoleEntity>( functionalRoleSIAMEntitys.size() );
        for ( FunctionalRoleSIAMEntity functionalRoleSIAMEntity : functionalRoleSIAMEntitys ) {
            list.add( asFunctionalRoleEntity( functionalRoleSIAMEntity ) );
        }

        return list;
    }

    @Override
    public List<FunctionalRoleEntity> asFunctionalRoleVOEntitys(List<FunctionalRoleVO> functionalRoleVO) {
        if ( functionalRoleVO == null ) {
            return null;
        }

        List<FunctionalRoleEntity> list = new ArrayList<FunctionalRoleEntity>( functionalRoleVO.size() );
        for ( FunctionalRoleVO functionalRoleVO1 : functionalRoleVO ) {
            list.add( functionalRoleVOToFunctionalRoleEntity( functionalRoleVO1 ) );
        }

        return list;
    }

    @Override
    public FunctionalRoleSIAMEntity asFunctionalRoleSIAMEntity(FunctionalRoleEntity functionalRoleEntity) {
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

    protected FunctionalRoleEntity functionalRoleVOToFunctionalRoleEntity(FunctionalRoleVO functionalRoleVO) {
        if ( functionalRoleVO == null ) {
            return null;
        }

        FunctionalRoleEntity functionalRoleEntity = new FunctionalRoleEntity();

        functionalRoleEntity.setNombre( functionalRoleVO.getNombre() );
        functionalRoleEntity.setRolFuncionalId( functionalRoleVO.getRolFuncionalId() );

        return functionalRoleEntity;
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
}
