package pe.telefonica.siam.infrastructure.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.dto.ConfigAtis;
import pe.telefonica.siam.infrastructure.siamdb.entity.FunctionalRoleAtisSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:23-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class FunctionalRoleAtisSIAMMapperImpl implements FunctionalRoleAtisSIAMMapper {

    @Override
    public ConfigAtis asConfigAtis(FunctionalRoleAtisSIAMEntity functionalRoleAtisSIAMEntity) {
        if ( functionalRoleAtisSIAMEntity == null ) {
            return null;
        }

        ConfigAtis configAtis = new ConfigAtis();

        configAtis.setCreatedAt( functionalRoleAtisSIAMEntity.getCreatedAt() );
        configAtis.setDeleteAt( functionalRoleAtisSIAMEntity.getDeleteAt() );
        configAtis.setState( functionalRoleAtisSIAMEntity.isState() );
        configAtis.setUpdateAt( functionalRoleAtisSIAMEntity.getUpdateAt() );
        configAtis.setUserCreate( functionalRoleAtisSIAMEntity.getUserCreate() );
        configAtis.setUserDelete( functionalRoleAtisSIAMEntity.getUserDelete() );
        configAtis.setUserUpdate( functionalRoleAtisSIAMEntity.getUserUpdate() );
        configAtis.setComplemento( functionalRoleAtisSIAMEntity.getComplemento() );
        configAtis.setEsCajeroVirtual( functionalRoleAtisSIAMEntity.isEsCajeroVirtual() );
        configAtis.setEsFuerzaVenta( functionalRoleAtisSIAMEntity.isEsFuerzaVenta() );

        return configAtis;
    }

    @Override
    public FunctionalRoleAtisSIAMEntity asFunctionalRoleAtisSIAMEntity(ConfigAtis configAtis) {
        if ( configAtis == null ) {
            return null;
        }

        FunctionalRoleAtisSIAMEntity functionalRoleAtisSIAMEntity = new FunctionalRoleAtisSIAMEntity();

        functionalRoleAtisSIAMEntity.setCreatedAt( configAtis.getCreatedAt() );
        functionalRoleAtisSIAMEntity.setDeleteAt( configAtis.getDeleteAt() );
        functionalRoleAtisSIAMEntity.setState( configAtis.isState() );
        functionalRoleAtisSIAMEntity.setUpdateAt( configAtis.getUpdateAt() );
        functionalRoleAtisSIAMEntity.setUserCreate( configAtis.getUserCreate() );
        functionalRoleAtisSIAMEntity.setUserDelete( configAtis.getUserDelete() );
        functionalRoleAtisSIAMEntity.setUserUpdate( configAtis.getUserUpdate() );
        functionalRoleAtisSIAMEntity.setComplemento( configAtis.getComplemento() );
        functionalRoleAtisSIAMEntity.setEsCajeroVirtual( configAtis.isEsCajeroVirtual() );
        functionalRoleAtisSIAMEntity.setEsFuerzaVenta( configAtis.isEsFuerzaVenta() );

        return functionalRoleAtisSIAMEntity;
    }
}
