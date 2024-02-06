package pe.telefonica.siam.infrastructure.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.ModuleEntity;
import pe.telefonica.siam.domain.entity.RoleEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ModuleSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RoleSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:30-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class ModuleSIAMMapperImpl implements ModuleSIAMMapper {

    @Override
    public ModuleEntity asModuleEntity(ModuleSIAMEntity moduleSIAMEntity) {
        if ( moduleSIAMEntity == null ) {
            return null;
        }

        ModuleEntity moduleEntity = new ModuleEntity();

        moduleEntity.setAcciones( roleSIAMEntityListToRoleEntityList( moduleSIAMEntity.getRoles() ) );
        moduleEntity.setNombreModulo( moduleSIAMEntity.getNombre() );
        moduleEntity.setClaveModulo( moduleSIAMEntity.getClaveModulo() );
        moduleEntity.setModuloId( moduleSIAMEntity.getModuloId() );

        return moduleEntity;
    }

    @Override
    public List<ModuleEntity> asModuleEntitys(List<ModuleSIAMEntity> moduleSIAMEntity) {
        if ( moduleSIAMEntity == null ) {
            return null;
        }

        List<ModuleEntity> list = new ArrayList<ModuleEntity>( moduleSIAMEntity.size() );
        for ( ModuleSIAMEntity moduleSIAMEntity1 : moduleSIAMEntity ) {
            list.add( asModuleEntity( moduleSIAMEntity1 ) );
        }

        return list;
    }

    protected RoleEntity roleSIAMEntityToRoleEntity(RoleSIAMEntity roleSIAMEntity) {
        if ( roleSIAMEntity == null ) {
            return null;
        }

        RoleEntity roleEntity = new RoleEntity();

        roleEntity.setCodigo( roleSIAMEntity.getCodigo() );
        roleEntity.setEvento( roleSIAMEntity.getEvento() );
        roleEntity.setRolId( roleSIAMEntity.getRolId() );

        return roleEntity;
    }

    protected List<RoleEntity> roleSIAMEntityListToRoleEntityList(List<RoleSIAMEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<RoleEntity> list1 = new ArrayList<RoleEntity>( list.size() );
        for ( RoleSIAMEntity roleSIAMEntity : list ) {
            list1.add( roleSIAMEntityToRoleEntity( roleSIAMEntity ) );
        }

        return list1;
    }
}
