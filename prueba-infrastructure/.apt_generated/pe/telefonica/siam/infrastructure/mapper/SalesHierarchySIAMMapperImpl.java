package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.CompanyDomainEntity;
import pe.telefonica.siam.domain.entity.CompanyEntity;
import pe.telefonica.siam.domain.entity.CompanyHierarchyEntity;
import pe.telefonica.siam.domain.entity.CorporationEntity;
import pe.telefonica.siam.domain.entity.CorporationHierarchyEntity;
import pe.telefonica.siam.domain.entity.PointSaleEntity;
import pe.telefonica.siam.domain.entity.PointSaleHierarchyEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CommercialChannelSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CompanyDomainSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CompanySIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.EntitySIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PointSaleSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:30-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class SalesHierarchySIAMMapperImpl implements SalesHierarchySIAMMapper {

    @Override
    public PointSaleEntity asPointSaleEntity(PointSaleSIAMEntity pointSaleSIAMEntity) {
        if ( pointSaleSIAMEntity == null ) {
            return null;
        }

        PointSaleEntity pointSaleEntity = new PointSaleEntity();

        pointSaleEntity.setCodigo( pointSaleSIAMEntity.getCodigo() );
        pointSaleEntity.setCodigoAgencia( pointSaleSIAMEntity.getCodigoAgencia() );
        pointSaleEntity.setCodigoAtis( pointSaleSIAMEntity.getCodigoAtis() );
        pointSaleEntity.setDireccion( pointSaleSIAMEntity.getDireccion() );
        pointSaleEntity.setEntidad( asCorporationEntity( pointSaleSIAMEntity.getEntidad() ) );
        pointSaleEntity.setGrupoAd( pointSaleSIAMEntity.getGrupoAd() );
        pointSaleEntity.setNombrePuntoVenta( pointSaleSIAMEntity.getNombrePuntoVenta() );
        pointSaleEntity.setPuntoVentaId( pointSaleSIAMEntity.getPuntoVentaId() );
        pointSaleEntity.setUbigeo( pointSaleSIAMEntity.getUbigeo() );

        return pointSaleEntity;
    }

    @Override
    public List<PointSaleEntity> asPointSaleEntitys(List<PointSaleSIAMEntity> pointSaleSIAMEntitys) {
        if ( pointSaleSIAMEntitys == null ) {
            return null;
        }

        List<PointSaleEntity> list = new ArrayList<PointSaleEntity>( pointSaleSIAMEntitys.size() );
        for ( PointSaleSIAMEntity pointSaleSIAMEntity : pointSaleSIAMEntitys ) {
            list.add( asPointSaleEntity( pointSaleSIAMEntity ) );
        }

        return list;
    }

    @Override
    public PointSaleHierarchyEntity asPointSaleHierarchyEntity(PointSaleSIAMEntity pointSaleSIAMEntity) {
        if ( pointSaleSIAMEntity == null ) {
            return null;
        }

        PointSaleHierarchyEntity pointSaleHierarchyEntity = new PointSaleHierarchyEntity();

        pointSaleHierarchyEntity.setCodigo( pointSaleSIAMEntity.getCodigo() );
        pointSaleHierarchyEntity.setNombrePuntoVenta( pointSaleSIAMEntity.getNombrePuntoVenta() );
        pointSaleHierarchyEntity.setPuntoVentaId( pointSaleSIAMEntity.getPuntoVentaId() );

        return pointSaleHierarchyEntity;
    }

    @Override
    public List<PointSaleHierarchyEntity> asPointSaleHierarchyEntitys(List<PointSaleSIAMEntity> pointSaleSIAMEntitys) {
        if ( pointSaleSIAMEntitys == null ) {
            return null;
        }

        List<PointSaleHierarchyEntity> list = new ArrayList<PointSaleHierarchyEntity>( pointSaleSIAMEntitys.size() );
        for ( PointSaleSIAMEntity pointSaleSIAMEntity : pointSaleSIAMEntitys ) {
            list.add( asPointSaleHierarchyEntity( pointSaleSIAMEntity ) );
        }

        return list;
    }

    @Override
    public CorporationEntity asCorporationEntity(EntitySIAMEntity entitySIAMEntity) {
        if ( entitySIAMEntity == null ) {
            return null;
        }

        CorporationEntity corporationEntity = new CorporationEntity();

        corporationEntity.setCodigo( entitySIAMEntity.getCodigo() );
        corporationEntity.setEmpresa( asCompanyEntity( entitySIAMEntity.getEmpresa() ) );
        corporationEntity.setEntidadId( entitySIAMEntity.getEntidadId() );
        corporationEntity.setNombreEntidad( entitySIAMEntity.getNombreEntidad() );

        return corporationEntity;
    }

    @Override
    public List<CorporationEntity> asCorporationEntitys(List<EntitySIAMEntity> entitySIAMEntitys) {
        if ( entitySIAMEntitys == null ) {
            return null;
        }

        List<CorporationEntity> list = new ArrayList<CorporationEntity>( entitySIAMEntitys.size() );
        for ( EntitySIAMEntity entitySIAMEntity : entitySIAMEntitys ) {
            list.add( asCorporationEntity( entitySIAMEntity ) );
        }

        return list;
    }

    @Override
    public CorporationHierarchyEntity asCorporationHierarchyEntity(EntitySIAMEntity entitySIAMEntity) {
        if ( entitySIAMEntity == null ) {
            return null;
        }

        CorporationHierarchyEntity corporationHierarchyEntity = new CorporationHierarchyEntity();

        corporationHierarchyEntity.setCanalComercialId( entitySIAMEntityCanalComercialCanalComercialId( entitySIAMEntity ) );
        corporationHierarchyEntity.setNombreCanalComercial( entitySIAMEntityCanalComercialNombre( entitySIAMEntity ) );
        corporationHierarchyEntity.setCodigo( entitySIAMEntity.getCodigo() );
        corporationHierarchyEntity.setEntidadId( entitySIAMEntity.getEntidadId() );
        corporationHierarchyEntity.setNombreEntidad( entitySIAMEntity.getNombreEntidad() );
        corporationHierarchyEntity.setPuntosDeVenta( asPointSaleHierarchyEntitys( entitySIAMEntity.getPuntosDeVenta() ) );

        return corporationHierarchyEntity;
    }

    @Override
    public List<CorporationHierarchyEntity> asCorporationHierarchyEntitys(List<EntitySIAMEntity> entitySIAMEntitys) {
        if ( entitySIAMEntitys == null ) {
            return null;
        }

        List<CorporationHierarchyEntity> list = new ArrayList<CorporationHierarchyEntity>( entitySIAMEntitys.size() );
        for ( EntitySIAMEntity entitySIAMEntity : entitySIAMEntitys ) {
            list.add( asCorporationHierarchyEntity( entitySIAMEntity ) );
        }

        return list;
    }

    @Override
    public CompanyEntity asCompanyEntity(CompanySIAMEntity companySIAMEntity) {
        if ( companySIAMEntity == null ) {
            return null;
        }

        CompanyEntity companyEntity = new CompanyEntity();

        companyEntity.setDominios( companyDomainSIAMEntityListToCompanyDomainEntityList( companySIAMEntity.getDominios() ) );
        companyEntity.setEmpresaId( companySIAMEntity.getEmpresaId() );
        companyEntity.setNombreEmpresa( companySIAMEntity.getNombreEmpresa() );

        return companyEntity;
    }

    @Override
    public List<CompanyEntity> asCompanyEntitys(List<CompanySIAMEntity> companySIAMEntitys) {
        if ( companySIAMEntitys == null ) {
            return null;
        }

        List<CompanyEntity> list = new ArrayList<CompanyEntity>( companySIAMEntitys.size() );
        for ( CompanySIAMEntity companySIAMEntity : companySIAMEntitys ) {
            list.add( asCompanyEntity( companySIAMEntity ) );
        }

        return list;
    }

    @Override
    public CompanyHierarchyEntity asCompanyHierarchyEntity(CompanySIAMEntity companySIAMEntity) {
        if ( companySIAMEntity == null ) {
            return null;
        }

        CompanyHierarchyEntity companyHierarchyEntity = new CompanyHierarchyEntity();

        companyHierarchyEntity.setDominios( companyDomainSIAMEntityListToCompanyDomainEntityList( companySIAMEntity.getDominios() ) );
        companyHierarchyEntity.setEmpresaId( companySIAMEntity.getEmpresaId() );
        companyHierarchyEntity.setEntidades( asCorporationHierarchyEntitys( companySIAMEntity.getEntidades() ) );
        companyHierarchyEntity.setNombreEmpresa( companySIAMEntity.getNombreEmpresa() );

        return companyHierarchyEntity;
    }

    @Override
    public List<CompanyHierarchyEntity> asCompanyHierarchyEntitys(List<CompanySIAMEntity> companySIAMEntitys) {
        if ( companySIAMEntitys == null ) {
            return null;
        }

        List<CompanyHierarchyEntity> list = new ArrayList<CompanyHierarchyEntity>( companySIAMEntitys.size() );
        for ( CompanySIAMEntity companySIAMEntity : companySIAMEntitys ) {
            list.add( asCompanyHierarchyEntity( companySIAMEntity ) );
        }

        return list;
    }

    private Integer entitySIAMEntityCanalComercialCanalComercialId(EntitySIAMEntity entitySIAMEntity) {
        if ( entitySIAMEntity == null ) {
            return null;
        }
        CommercialChannelSIAMEntity canalComercial = entitySIAMEntity.getCanalComercial();
        if ( canalComercial == null ) {
            return null;
        }
        Integer canalComercialId = canalComercial.getCanalComercialId();
        if ( canalComercialId == null ) {
            return null;
        }
        return canalComercialId;
    }

    private String entitySIAMEntityCanalComercialNombre(EntitySIAMEntity entitySIAMEntity) {
        if ( entitySIAMEntity == null ) {
            return null;
        }
        CommercialChannelSIAMEntity canalComercial = entitySIAMEntity.getCanalComercial();
        if ( canalComercial == null ) {
            return null;
        }
        String nombre = canalComercial.getNombre();
        if ( nombre == null ) {
            return null;
        }
        return nombre;
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
}
