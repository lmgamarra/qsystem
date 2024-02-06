package pe.telefonica.siam.infrastructure.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.entity.ParametersEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.ParametersSIAMEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:21-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class ParametersSIAMMapperImpl implements ParametersSIAMMapper {

    @Override
    public ParametersSIAMEntity asParametersSIAMEntity(ParametersEntity parametersEntity) {
        if ( parametersEntity == null ) {
            return null;
        }

        ParametersSIAMEntity parametersSIAMEntity = new ParametersSIAMEntity();

        parametersSIAMEntity.setCreatedAt( parametersEntity.getCreatedAt() );
        parametersSIAMEntity.setDeleteAt( parametersEntity.getDeleteAt() );
        parametersSIAMEntity.setState( parametersEntity.isState() );
        parametersSIAMEntity.setUpdateAt( parametersEntity.getUpdateAt() );
        parametersSIAMEntity.setUserCreate( parametersEntity.getUserCreate() );
        parametersSIAMEntity.setUserDelete( parametersEntity.getUserDelete() );
        parametersSIAMEntity.setUserUpdate( parametersEntity.getUserUpdate() );
        parametersSIAMEntity.setDiasAprovFallidos( parametersEntity.getDiasAprovFallidos() );
        parametersSIAMEntity.setDiasAvisoCambioContrasena( parametersEntity.getDiasAvisoCambioContrasena() );
        parametersSIAMEntity.setDiasBloqueoAutomatico( parametersEntity.getDiasBloqueoAutomatico() );
        parametersSIAMEntity.setDiasCambioContrasena( parametersEntity.getDiasCambioContrasena() );
        parametersSIAMEntity.setLimiteIntentosIngreso( parametersEntity.getLimiteIntentosIngreso() );
        parametersSIAMEntity.setMinutosCambioContrasena( parametersEntity.getMinutosCambioContrasena() );
        parametersSIAMEntity.setMinutosDesconexion( parametersEntity.getMinutosDesconexion() );
        parametersSIAMEntity.setMinutosReactivacionIntentos( parametersEntity.getMinutosReactivacionIntentos() );
        parametersSIAMEntity.setParametroId( parametersEntity.getParametroId() );

        return parametersSIAMEntity;
    }

    @Override
    public ParametersEntity asParametersEntity(ParametersSIAMEntity parametersSIAMEntity) {
        if ( parametersSIAMEntity == null ) {
            return null;
        }

        ParametersEntity parametersEntity = new ParametersEntity();

        parametersEntity.setCreatedAt( parametersSIAMEntity.getCreatedAt() );
        parametersEntity.setDeleteAt( parametersSIAMEntity.getDeleteAt() );
        parametersEntity.setState( parametersSIAMEntity.isState() );
        parametersEntity.setUpdateAt( parametersSIAMEntity.getUpdateAt() );
        parametersEntity.setUserCreate( parametersSIAMEntity.getUserCreate() );
        parametersEntity.setUserDelete( parametersSIAMEntity.getUserDelete() );
        parametersEntity.setUserUpdate( parametersSIAMEntity.getUserUpdate() );
        parametersEntity.setDiasAprovFallidos( parametersSIAMEntity.getDiasAprovFallidos() );
        parametersEntity.setDiasAvisoCambioContrasena( parametersSIAMEntity.getDiasAvisoCambioContrasena() );
        parametersEntity.setDiasBloqueoAutomatico( parametersSIAMEntity.getDiasBloqueoAutomatico() );
        parametersEntity.setDiasCambioContrasena( parametersSIAMEntity.getDiasCambioContrasena() );
        parametersEntity.setLimiteIntentosIngreso( parametersSIAMEntity.getLimiteIntentosIngreso() );
        parametersEntity.setMinutosCambioContrasena( parametersSIAMEntity.getMinutosCambioContrasena() );
        parametersEntity.setMinutosDesconexion( parametersSIAMEntity.getMinutosDesconexion() );
        parametersEntity.setMinutosReactivacionIntentos( parametersSIAMEntity.getMinutosReactivacionIntentos() );
        parametersEntity.setParametroId( parametersSIAMEntity.getParametroId() );

        return parametersEntity;
    }
}
