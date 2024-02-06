package pe.telefonica.siam.infrastructure.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.dto.ConfigIsis;
import pe.telefonica.siam.infrastructure.siamdb.entity.FunctionalRoleIsisSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:30-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class FunctionalRoleIsisSIAMMapperImpl implements FunctionalRoleIsisSIAMMapper {

    @Override
    public ConfigIsis asConfigIsis(FunctionalRoleIsisSIAMEntity functionalRoleIsisSIAMEntity) {
        if ( functionalRoleIsisSIAMEntity == null ) {
            return null;
        }

        ConfigIsis configIsis = new ConfigIsis();

        configIsis.setCreatedAt( functionalRoleIsisSIAMEntity.getCreatedAt() );
        configIsis.setDeleteAt( functionalRoleIsisSIAMEntity.getDeleteAt() );
        configIsis.setState( functionalRoleIsisSIAMEntity.isState() );
        configIsis.setUpdateAt( functionalRoleIsisSIAMEntity.getUpdateAt() );
        configIsis.setUserCreate( functionalRoleIsisSIAMEntity.getUserCreate() );
        configIsis.setUserDelete( functionalRoleIsisSIAMEntity.getUserDelete() );
        configIsis.setUserUpdate( functionalRoleIsisSIAMEntity.getUserUpdate() );
        configIsis.setAutorizaPor( functionalRoleIsisSIAMEntity.getAutorizaPor() );
        configIsis.setCanal( functionalRoleIsisSIAMEntity.getCanal() );
        configIsis.setCargo( functionalRoleIsisSIAMEntity.getCargo() );
        configIsis.setDependencia( functionalRoleIsisSIAMEntity.getDependencia() );
        configIsis.setEmpresaAutoriza( functionalRoleIsisSIAMEntity.getEmpresaAutoriza() );
        configIsis.setNegocio( functionalRoleIsisSIAMEntity.getNegocio() );
        configIsis.setTipo( functionalRoleIsisSIAMEntity.getTipo() );

        return configIsis;
    }

    @Override
    public FunctionalRoleIsisSIAMEntity asFunctionalRoleIsisSIAMEntity(ConfigIsis configIsis) {
        if ( configIsis == null ) {
            return null;
        }

        FunctionalRoleIsisSIAMEntity functionalRoleIsisSIAMEntity = new FunctionalRoleIsisSIAMEntity();

        functionalRoleIsisSIAMEntity.setCreatedAt( configIsis.getCreatedAt() );
        functionalRoleIsisSIAMEntity.setDeleteAt( configIsis.getDeleteAt() );
        functionalRoleIsisSIAMEntity.setState( configIsis.isState() );
        functionalRoleIsisSIAMEntity.setUpdateAt( configIsis.getUpdateAt() );
        functionalRoleIsisSIAMEntity.setUserCreate( configIsis.getUserCreate() );
        functionalRoleIsisSIAMEntity.setUserDelete( configIsis.getUserDelete() );
        functionalRoleIsisSIAMEntity.setUserUpdate( configIsis.getUserUpdate() );
        functionalRoleIsisSIAMEntity.setAutorizaPor( configIsis.getAutorizaPor() );
        functionalRoleIsisSIAMEntity.setCanal( configIsis.getCanal() );
        functionalRoleIsisSIAMEntity.setCargo( configIsis.getCargo() );
        functionalRoleIsisSIAMEntity.setDependencia( configIsis.getDependencia() );
        functionalRoleIsisSIAMEntity.setEmpresaAutoriza( configIsis.getEmpresaAutoriza() );
        functionalRoleIsisSIAMEntity.setNegocio( configIsis.getNegocio() );
        functionalRoleIsisSIAMEntity.setTipo( configIsis.getTipo() );

        return functionalRoleIsisSIAMEntity;
    }
}
