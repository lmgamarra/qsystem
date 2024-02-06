package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.dto.UPerson;
import pe.telefonica.siam.domain.entity.AmdocsChannelEntity;
import pe.telefonica.siam.domain.entity.ApplicationProfileEntity;
import pe.telefonica.siam.domain.entity.ChannelEntity;
import pe.telefonica.siam.domain.entity.CommercialChannelEntity;
import pe.telefonica.siam.domain.entity.CompanyDomainEntity;
import pe.telefonica.siam.domain.entity.CompanyEntity;
import pe.telefonica.siam.domain.entity.CorporationEntity;
import pe.telefonica.siam.domain.entity.DocumentTypeEntity;
import pe.telefonica.siam.domain.entity.EmployeeEntity;
import pe.telefonica.siam.domain.entity.FunctionalRoleEntity;
import pe.telefonica.siam.domain.entity.GenericChannelEntity;
import pe.telefonica.siam.domain.entity.PersonEntity;
import pe.telefonica.siam.domain.entity.PointSaleEntity;
import pe.telefonica.siam.domain.entity.ProvisionedApplicationEntity;
import pe.telefonica.siam.domain.entity.ResponsableEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.AmdocsChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ApplicationProfileSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CompanyDomainSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CompanySIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.DocumentTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.EmployeeRoleSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.EntitySIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.FunctionalRoleSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.GenericChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PersonSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PointSaleSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ProvisionedApplicationSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ResponsableSIAMEntity;
import pe.telefonica.siam.infrastructure.vo.UserPersonVO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:22-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class EmployeeRoleSIAMMapperImpl implements EmployeeRoleSIAMMapper {

    @Autowired
    private ApplicationSIAMMapper applicationSIAMMapper;

    @Override
    public EmployeeEntity asEmployeeEntity(EmployeeRoleSIAMEntity employeeRoleSIAMEntity) {
        if ( employeeRoleSIAMEntity == null ) {
            return null;
        }

        EmployeeEntity employeeEntity = new EmployeeEntity();

        employeeEntity.setPersona( personSIAMEntityToPersonEntity( employeeRoleSIAMEntity.getPersona() ) );
        employeeEntity.setCreatedAt( employeeRoleSIAMEntity.getCreatedAt() );
        employeeEntity.setDeleteAt( employeeRoleSIAMEntity.getDeleteAt() );
        employeeEntity.setState( employeeRoleSIAMEntity.isState() );
        employeeEntity.setUpdateAt( employeeRoleSIAMEntity.getUpdateAt() );
        employeeEntity.setUserCreate( employeeRoleSIAMEntity.getUserCreate() );
        employeeEntity.setUserDelete( employeeRoleSIAMEntity.getUserDelete() );
        employeeEntity.setUserUpdate( employeeRoleSIAMEntity.getUserUpdate() );
        employeeEntity.setProvisiones( provisionedApplicationSIAMEntityListToProvisionedApplicationEntityList( employeeRoleSIAMEntity.getProvisiones() ) );
        employeeEntity.setPuntoVenta( pointSaleSIAMEntityToPointSaleEntity( employeeRoleSIAMEntity.getPuntoVenta() ) );
        employeeEntity.setRolFuncional( functionalRoleSIAMEntityToFunctionalRoleEntity( employeeRoleSIAMEntity.getRolFuncional() ) );
        employeeEntity.setRolPersonaId( employeeRoleSIAMEntity.getRolPersonaId() );

        return employeeEntity;
    }

    @Override
    public List<EmployeeEntity> asEmployeeEntitys(List<EmployeeRoleSIAMEntity> employeeRoleSIAMEntitys) {
        if ( employeeRoleSIAMEntitys == null ) {
            return null;
        }

        List<EmployeeEntity> list = new ArrayList<EmployeeEntity>( employeeRoleSIAMEntitys.size() );
        for ( EmployeeRoleSIAMEntity employeeRoleSIAMEntity : employeeRoleSIAMEntitys ) {
            list.add( asEmployeeEntity( employeeRoleSIAMEntity ) );
        }

        return list;
    }

    @Override
    public UPerson asUPerson(UserPersonVO userPersonVO) {
        if ( userPersonVO == null ) {
            return null;
        }

        UPerson uPerson = new UPerson();

        uPerson.setBloqueoAllApp( userPersonVO.getBloqueoAllApp() );
        uPerson.setEmail( userPersonVO.getEmail() );
        uPerson.setMaterno( userPersonVO.getMaterno() );
        uPerson.setNombre( userPersonVO.getNombre() );
        uPerson.setPaterno( userPersonVO.getPaterno() );
        uPerson.setPersonaId( userPersonVO.getPersonaId() );
        uPerson.setUsername( userPersonVO.getUsername() );
        uPerson.setUsuarioId( userPersonVO.getUsuarioId() );

        return uPerson;
    }

    @Override
    public List<UPerson> asUPersons(List<UserPersonVO> userPersonVOs) {
        if ( userPersonVOs == null ) {
            return null;
        }

        List<UPerson> list = new ArrayList<UPerson>( userPersonVOs.size() );
        for ( UserPersonVO userPersonVO : userPersonVOs ) {
            list.add( asUPerson( userPersonVO ) );
        }

        return list;
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

    protected ProvisionedApplicationEntity provisionedApplicationSIAMEntityToProvisionedApplicationEntity(ProvisionedApplicationSIAMEntity provisionedApplicationSIAMEntity) {
        if ( provisionedApplicationSIAMEntity == null ) {
            return null;
        }

        ProvisionedApplicationEntity provisionedApplicationEntity = new ProvisionedApplicationEntity();

        provisionedApplicationEntity.setCreatedAt( provisionedApplicationSIAMEntity.getCreatedAt() );
        provisionedApplicationEntity.setDeleteAt( provisionedApplicationSIAMEntity.getDeleteAt() );
        provisionedApplicationEntity.setState( provisionedApplicationSIAMEntity.isState() );
        provisionedApplicationEntity.setUpdateAt( provisionedApplicationSIAMEntity.getUpdateAt() );
        provisionedApplicationEntity.setUserCreate( provisionedApplicationSIAMEntity.getUserCreate() );
        provisionedApplicationEntity.setUserDelete( provisionedApplicationSIAMEntity.getUserDelete() );
        provisionedApplicationEntity.setUserUpdate( provisionedApplicationSIAMEntity.getUserUpdate() );
        provisionedApplicationEntity.setAplicacion( applicationSIAMMapper.asApplicationEntity( provisionedApplicationSIAMEntity.getAplicacion() ) );
        provisionedApplicationEntity.setBloqueado( provisionedApplicationSIAMEntity.getBloqueado() );
        provisionedApplicationEntity.setNombreUsuarioProv( provisionedApplicationSIAMEntity.getNombreUsuarioProv() );
        provisionedApplicationEntity.setPerfil( applicationProfileSIAMEntityToApplicationProfileEntity( provisionedApplicationSIAMEntity.getPerfil() ) );
        provisionedApplicationEntity.setUsuarioProvId( provisionedApplicationSIAMEntity.getUsuarioProvId() );

        return provisionedApplicationEntity;
    }

    protected List<ProvisionedApplicationEntity> provisionedApplicationSIAMEntityListToProvisionedApplicationEntityList(List<ProvisionedApplicationSIAMEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<ProvisionedApplicationEntity> list1 = new ArrayList<ProvisionedApplicationEntity>( list.size() );
        for ( ProvisionedApplicationSIAMEntity provisionedApplicationSIAMEntity : list ) {
            list1.add( provisionedApplicationSIAMEntityToProvisionedApplicationEntity( provisionedApplicationSIAMEntity ) );
        }

        return list1;
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

    protected PersonEntity personSIAMEntityToPersonEntity1(PersonSIAMEntity personSIAMEntity) {
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

        functionalRoleEntity.setCreatedAt( functionalRoleSIAMEntity.getCreatedAt() );
        functionalRoleEntity.setDeleteAt( functionalRoleSIAMEntity.getDeleteAt() );
        functionalRoleEntity.setState( functionalRoleSIAMEntity.isState() );
        functionalRoleEntity.setUpdateAt( functionalRoleSIAMEntity.getUpdateAt() );
        functionalRoleEntity.setUserCreate( functionalRoleSIAMEntity.getUserCreate() );
        functionalRoleEntity.setUserDelete( functionalRoleSIAMEntity.getUserDelete() );
        functionalRoleEntity.setUserUpdate( functionalRoleSIAMEntity.getUserUpdate() );
        functionalRoleEntity.setAprobadoPor( personSIAMEntityToPersonEntity1( functionalRoleSIAMEntity.getAprobadoPor() ) );
        functionalRoleEntity.setCanal( channelSIAMEntityToChannelEntity( functionalRoleSIAMEntity.getCanal() ) );
        functionalRoleEntity.setCodigo( functionalRoleSIAMEntity.getCodigo() );
        functionalRoleEntity.setNombre( functionalRoleSIAMEntity.getNombre() );
        functionalRoleEntity.setPerfilesId( functionalRoleSIAMEntity.getPerfilesId() );
        functionalRoleEntity.setResponsable( personSIAMEntityToPersonEntity1( functionalRoleSIAMEntity.getResponsable() ) );
        functionalRoleEntity.setRolFuncionalId( functionalRoleSIAMEntity.getRolFuncionalId() );
        functionalRoleEntity.setTipo( functionalRoleSIAMEntity.getTipo() );
        functionalRoleEntity.setVersion( functionalRoleSIAMEntity.getVersion() );

        return functionalRoleEntity;
    }
}
