package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.AmdocsChannelEntity;
import pe.telefonica.siam.domain.entity.ApplicationEntity;
import pe.telefonica.siam.domain.entity.ApplicationProfileEntity;
import pe.telefonica.siam.domain.entity.ChannelEntity;
import pe.telefonica.siam.domain.entity.CommercialChannelEntity;
import pe.telefonica.siam.domain.entity.DocumentTypeEntity;
import pe.telefonica.siam.domain.entity.GenericChannelEntity;
import pe.telefonica.siam.domain.entity.PersonEntity;
import pe.telefonica.siam.domain.entity.PoliciesPasswordEntity;
import pe.telefonica.siam.domain.entity.ProvisionedApplicationEntity;
import pe.telefonica.siam.domain.entity.ResponsableEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.AmdocsChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ApplicationProfileSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ApplicationSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.DocumentTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.GenericChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PersonSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PoliciesPasswordSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ProvisionedApplicationSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ResponsableSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:30-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class ProvisionedApplicationMapperImpl implements ProvisionedApplicationMapper {

    @Override
    public ProvisionedApplicationEntity asProvisionedApplicationEntity(ProvisionedApplicationSIAMEntity provisionedApplicationSIAMEntity) {
        if ( provisionedApplicationSIAMEntity == null ) {
            return null;
        }

        ProvisionedApplicationEntity provisionedApplicationEntity = new ProvisionedApplicationEntity();

        provisionedApplicationEntity.setAplicacion( applicationSIAMEntityToApplicationEntity( provisionedApplicationSIAMEntity.getAplicacion() ) );
        provisionedApplicationEntity.setRolPersonaBlock( ProvisionedApplicationMapper.asCustomBlockProvisionedUserProv( provisionedApplicationSIAMEntity.getEmpleadoRol() ) );
        provisionedApplicationEntity.setPerson( personSIAMEntityToPersonEntity( provisionedApplicationSIAMEntity.getPersona() ) );
        provisionedApplicationEntity.setCreatedAt( provisionedApplicationSIAMEntity.getCreatedAt() );
        provisionedApplicationEntity.setDeleteAt( provisionedApplicationSIAMEntity.getDeleteAt() );
        provisionedApplicationEntity.setState( provisionedApplicationSIAMEntity.isState() );
        provisionedApplicationEntity.setUpdateAt( provisionedApplicationSIAMEntity.getUpdateAt() );
        provisionedApplicationEntity.setUserCreate( provisionedApplicationSIAMEntity.getUserCreate() );
        provisionedApplicationEntity.setUserDelete( provisionedApplicationSIAMEntity.getUserDelete() );
        provisionedApplicationEntity.setUserUpdate( provisionedApplicationSIAMEntity.getUserUpdate() );
        provisionedApplicationEntity.setBloqueado( provisionedApplicationSIAMEntity.getBloqueado() );
        provisionedApplicationEntity.setNombreUsuarioProv( provisionedApplicationSIAMEntity.getNombreUsuarioProv() );
        provisionedApplicationEntity.setPerfil( applicationProfileSIAMEntityToApplicationProfileEntity( provisionedApplicationSIAMEntity.getPerfil() ) );
        provisionedApplicationEntity.setUsuarioProvId( provisionedApplicationSIAMEntity.getUsuarioProvId() );

        return provisionedApplicationEntity;
    }

    @Override
    public List<ProvisionedApplicationEntity> asProvisionedApplicationEntities(List<ProvisionedApplicationSIAMEntity> provisionedApplicationSIAMEntities) {
        if ( provisionedApplicationSIAMEntities == null ) {
            return null;
        }

        List<ProvisionedApplicationEntity> list = new ArrayList<ProvisionedApplicationEntity>( provisionedApplicationSIAMEntities.size() );
        for ( ProvisionedApplicationSIAMEntity provisionedApplicationSIAMEntity : provisionedApplicationSIAMEntities ) {
            list.add( asProvisionedApplicationEntity( provisionedApplicationSIAMEntity ) );
        }

        return list;
    }

    protected PoliciesPasswordEntity policiesPasswordSIAMEntityToPoliciesPasswordEntity(PoliciesPasswordSIAMEntity policiesPasswordSIAMEntity) {
        if ( policiesPasswordSIAMEntity == null ) {
            return null;
        }

        PoliciesPasswordEntity policiesPasswordEntity = new PoliciesPasswordEntity();

        policiesPasswordEntity.setCreatedAt( policiesPasswordSIAMEntity.getCreatedAt() );
        policiesPasswordEntity.setDeleteAt( policiesPasswordSIAMEntity.getDeleteAt() );
        policiesPasswordEntity.setState( policiesPasswordSIAMEntity.isState() );
        policiesPasswordEntity.setUpdateAt( policiesPasswordSIAMEntity.getUpdateAt() );
        policiesPasswordEntity.setUserCreate( policiesPasswordSIAMEntity.getUserCreate() );
        policiesPasswordEntity.setUserDelete( policiesPasswordSIAMEntity.getUserDelete() );
        policiesPasswordEntity.setUserUpdate( policiesPasswordSIAMEntity.getUserUpdate() );

        return policiesPasswordEntity;
    }

    protected ApplicationEntity applicationSIAMEntityToApplicationEntity(ApplicationSIAMEntity applicationSIAMEntity) {
        if ( applicationSIAMEntity == null ) {
            return null;
        }

        ApplicationEntity applicationEntity = new ApplicationEntity();

        applicationEntity.setNombreAplicacion( applicationSIAMEntity.getName() );
        applicationEntity.setCreatedAt( applicationSIAMEntity.getCreatedAt() );
        applicationEntity.setDeleteAt( applicationSIAMEntity.getDeleteAt() );
        applicationEntity.setState( applicationSIAMEntity.isState() );
        applicationEntity.setUpdateAt( applicationSIAMEntity.getUpdateAt() );
        applicationEntity.setUserCreate( applicationSIAMEntity.getUserCreate() );
        applicationEntity.setUserDelete( applicationSIAMEntity.getUserDelete() );
        applicationEntity.setUserUpdate( applicationSIAMEntity.getUserUpdate() );
        applicationEntity.setAplicacionId( applicationSIAMEntity.getAplicacionId() );
        applicationEntity.setCodigo( applicationSIAMEntity.getCodigo() );
        applicationEntity.setPoliticaContrasena( policiesPasswordSIAMEntityToPoliciesPasswordEntity( applicationSIAMEntity.getPoliticaContrasena() ) );

        return applicationEntity;
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

    protected ApplicationProfileEntity applicationProfileSIAMEntityToApplicationProfileEntity(ApplicationProfileSIAMEntity applicationProfileSIAMEntity) {
        if ( applicationProfileSIAMEntity == null ) {
            return null;
        }

        ApplicationProfileEntity applicationProfileEntity = new ApplicationProfileEntity();

        applicationProfileEntity.setCreatedAt( applicationProfileSIAMEntity.getCreatedAt() );
        applicationProfileEntity.setDeleteAt( applicationProfileSIAMEntity.getDeleteAt() );
        applicationProfileEntity.setState( applicationProfileSIAMEntity.isState() );
        applicationProfileEntity.setUpdateAt( applicationProfileSIAMEntity.getUpdateAt() );
        applicationProfileEntity.setUserCreate( applicationProfileSIAMEntity.getUserCreate() );
        applicationProfileEntity.setUserDelete( applicationProfileSIAMEntity.getUserDelete() );
        applicationProfileEntity.setUserUpdate( applicationProfileSIAMEntity.getUserUpdate() );
        applicationProfileEntity.setCodigo( applicationProfileSIAMEntity.getCodigo() );
        applicationProfileEntity.setNombre( applicationProfileSIAMEntity.getNombre() );
        applicationProfileEntity.setPerfilId( applicationProfileSIAMEntity.getPerfilId() );

        return applicationProfileEntity;
    }
}
