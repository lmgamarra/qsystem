package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.dto.ConfigCatalogo;
import pe.telefonica.siam.infrastructure.siamdb.entity.CatalogoPKSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.CatalogoSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:21-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class CatalogoSIAMMapperImpl implements CatalogoSIAMMapper {

    @Override
    public ConfigCatalogo asConfigCatalogo(CatalogoSIAMEntity catalogoSIAMEntity) {
        if ( catalogoSIAMEntity == null ) {
            return null;
        }

        ConfigCatalogo configCatalogo = new ConfigCatalogo();

        configCatalogo.setClave( catalogoSIAMEntityIdClave( catalogoSIAMEntity ) );
        configCatalogo.setCodigo( catalogoSIAMEntityIdCodigo( catalogoSIAMEntity ) );
        configCatalogo.setValor( catalogoSIAMEntity.getValor() );

        return configCatalogo;
    }

    @Override
    public List<ConfigCatalogo> asConfigCatalogos(List<CatalogoSIAMEntity> catalogoSIAMEntitys) {
        if ( catalogoSIAMEntitys == null ) {
            return null;
        }

        List<ConfigCatalogo> list = new ArrayList<ConfigCatalogo>( catalogoSIAMEntitys.size() );
        for ( CatalogoSIAMEntity catalogoSIAMEntity : catalogoSIAMEntitys ) {
            list.add( asConfigCatalogo( catalogoSIAMEntity ) );
        }

        return list;
    }

    private String catalogoSIAMEntityIdClave(CatalogoSIAMEntity catalogoSIAMEntity) {
        if ( catalogoSIAMEntity == null ) {
            return null;
        }
        CatalogoPKSIAMEntity id = catalogoSIAMEntity.getId();
        if ( id == null ) {
            return null;
        }
        String clave = id.getClave();
        if ( clave == null ) {
            return null;
        }
        return clave;
    }

    private String catalogoSIAMEntityIdCodigo(CatalogoSIAMEntity catalogoSIAMEntity) {
        if ( catalogoSIAMEntity == null ) {
            return null;
        }
        CatalogoPKSIAMEntity id = catalogoSIAMEntity.getId();
        if ( id == null ) {
            return null;
        }
        String codigo = id.getCodigo();
        if ( codigo == null ) {
            return null;
        }
        return codigo;
    }
}
