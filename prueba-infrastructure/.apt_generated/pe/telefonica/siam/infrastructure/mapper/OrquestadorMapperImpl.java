package pe.telefonica.siam.infrastructure.mapper;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;
import pe.telefonica.siam.domain.dto.ValidPerson;
import pe.telefonica.siam.infrastructure.orquestador.dto.ValidPersonOrquestador;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-18T10:20:29-0500",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 3.22.0.v20200530-2032, environment: Java 11.0.12 (Eclipse Foundation)"
)
@Component
public class OrquestadorMapperImpl implements OrquestadorMapper {

    @Override
    public ValidPerson asValidPerson(ValidPersonOrquestador personaOrquestador) {
        if ( personaOrquestador == null ) {
            return null;
        }

        ValidPerson validPerson = new ValidPerson();

        validPerson.setErrorValidation( personaOrquestador.getErrorValidation() );
        validPerson.setInhabilitadoListaObservados( personaOrquestador.getInhabilitadoListaObservados() );
        validPerson.setInhabilitadoListaVena( personaOrquestador.getInhabilitadoListaVena() );
        validPerson.setInhabilitadoReniec( personaOrquestador.getInhabilitadoReniec() );
        validPerson.setMaterno( personaOrquestador.getMaterno() );
        validPerson.setNombres( personaOrquestador.getNombres() );
        validPerson.setNumeroDoc( personaOrquestador.getNumeroDoc() );
        validPerson.setPaterno( personaOrquestador.getPaterno() );
        validPerson.setPersonaId( personaOrquestador.getPersonaId() );
        validPerson.setPersonaReniecId( personaOrquestador.getPersonaReniecId() );
        validPerson.setStatusValidation( personaOrquestador.getStatusValidation() );
        if ( personaOrquestador.getTipoDocumentoId() != null ) {
            validPerson.setTipoDocumentoId( Integer.parseInt( personaOrquestador.getTipoDocumentoId() ) );
        }

        return validPerson;
    }
}
