package pe.telefonica.siam.infrastructure.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.google.gson.Gson;

import pe.telefonica.siam.domain.entity.ApplicationEntity;
import pe.telefonica.siam.domain.entity.PersonEntity;
import pe.telefonica.siam.domain.entity.RequestEntity;
import pe.telefonica.siam.domain.enums.RequestTypeEnum;
import pe.telefonica.siam.domain.errors.ResponsableMapErrors;
import pe.telefonica.siam.domain.exceptions.BussinesSIAMException;
import pe.telefonica.siam.domain.exceptions.NotFoundException;
import pe.telefonica.siam.domain.repository.RequestRepository;
import pe.telefonica.siam.infrastructure.mapper.ApplicationSIAMMapper;
import pe.telefonica.siam.infrastructure.mapper.DirectionSIAMMapper;
import pe.telefonica.siam.infrastructure.mapper.ProfileFunctionalSIAMMapper;
import pe.telefonica.siam.infrastructure.mapper.RequestSIAMMapper;
import pe.telefonica.siam.infrastructure.siamdb.entity.ApplicationSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.PersonSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestApplicationSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestStatusSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.entity.RequestTypeSIAMEntity;
import pe.telefonica.siam.infrastructure.siamdb.repository.ApplicationSIAMRepository;
import pe.telefonica.siam.infrastructure.siamdb.repository.FunctionalRoleSIAMRepository;
import pe.telefonica.siam.infrastructure.siamdb.repository.PersonSecuritySIAMRepository;
import pe.telefonica.siam.infrastructure.siamdb.repository.ProfileFunctionalRoleSIAMRepository;
import pe.telefonica.siam.infrastructure.siamdb.repository.ProfileFunctionalSIAMRepository;
import pe.telefonica.siam.infrastructure.siamdb.repository.ProfilesPerChannelSIAMRepository;
import pe.telefonica.siam.infrastructure.siamdb.repository.RequestApplicationSIAMRepository;
import pe.telefonica.siam.infrastructure.siamdb.repository.RequestSIAMRepository;
import pe.telefonica.siam.infrastructure.siamdb.repository.RequestStatusSIAMRepository;
import pe.telefonica.siam.infrastructure.siamdb.repository.RequestTypeSIAMRepository;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RequestTestConfig.class)
class RequestRepositoryImplTest {

	@MockBean
	private RequestSIAMRepository requestSIAMRepository;
	@MockBean
	private RequestApplicationSIAMRepository requestApplicationSIAMRepository;
	@MockBean
	private DirectionSIAMMapper directionSIAMMapper;
	@MockBean
	private ProfileFunctionalSIAMMapper profileFunctionalSIAMMapper;
	@MockBean
	private FunctionalRoleSIAMRepository functionalRoleSIAMRepository;
	@MockBean
	private ProfileFunctionalRoleSIAMRepository profileFunctionalRoleSIAMRepository;
	@MockBean
	private RequestStatusSIAMRepository requestStatusSIAMRepository;
	@MockBean
	private PersonSecuritySIAMRepository personSecuritySIAMRepository;
	@MockBean
	private RequestTypeSIAMRepository requestTypeSIAMRepository;
	@MockBean
	private ApplicationSIAMRepository applicationSIAMRepository;
	@MockBean
	private ProfileFunctionalSIAMRepository profileFunctionalSIAMRepository;
	@MockBean
	private ProfilesPerChannelSIAMRepository profilesPerChannelSIAMRepository;
	@MockBean
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	private RequestRepository requestRepository;
	
	@Test
	@DisplayName("validate_responsable1() => validar que el responsable exista")
	void validate_responsable1() throws IOException {
		PersonSIAMEntity data = convert_responsable_siam_entity();
		when( personSecuritySIAMRepository.findById(1)).thenReturn(Optional.of(data));
		boolean validar = requestRepository.validateResponsable(convert_responsable_entity(data));
		assertTrue(validar);
		verify(personSecuritySIAMRepository).findById(1);
	}
	
	@Test
	@DisplayName("validate_responsable2() => validar que el responsable NO exista")
	void validate_responsable2() throws IOException {
		PersonSIAMEntity data = convert_responsable_siam_entity();
		
		when( personSecuritySIAMRepository.findById(1)).thenReturn(Optional.empty());

		NotFoundException exception = assertThrows(NotFoundException.class, () -> {
			requestRepository.validateResponsable(convert_responsable_entity(data));
		});
		
		assertEquals(ResponsableMapErrors.getErrorStringResponse(ResponsableMapErrors.ERROR_RESPONSABLE_NO_EXISTE), exception.getCustomMessage());
		
		verify(personSecuritySIAMRepository).findById(1);
	}
	
	@Test
	@DisplayName("validate_responsable3() => validar que sea un responsable")
	void validate_responsable3() throws IOException {
		Optional<PersonSIAMEntity> data = convert_persona_siam_entity();
		
		when( personSecuritySIAMRepository.findById(1)).thenReturn(data);

		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			requestRepository.validateResponsable(convert_responsable_entity(data.get()));
		});
		
		assertEquals(ResponsableMapErrors.getErrorStringResponse(ResponsableMapErrors.ERROR_RESPONSABLE_NO_EXISTE), exception.getCustomMessage());
		
		verify(personSecuritySIAMRepository).findById(1);
	}

	@Test
	@DisplayName("validate_responsable3() => validar que el responsable tenga un canal configurado")
	void validate_responsable4() throws IOException {
		PersonSIAMEntity data = convert_responsable_siam_entity();
		data.getResponsable().setCanal(null);
		when( personSecuritySIAMRepository.findById(1)).thenReturn(Optional.of(data));

		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			requestRepository.validateResponsable(convert_responsable_entity(data));
		});
		
		assertEquals(ResponsableMapErrors.getErrorStringResponse(
			ResponsableMapErrors.ERROR_RESPONSABLE_NOT_ASSOCIATED_CHANNEL), exception.getCustomMessage());
		
		verify(personSecuritySIAMRepository).findById(1);
	}
	
	@Test
	@DisplayName("update_request_state() => validar que se ejecute estado de rol funcional")
	void update_request_state() {
		doNothing().when(functionalRoleSIAMRepository).updateRequestState(true, 1);
		requestRepository.updateRequestState(true, 1);
		verify(functionalRoleSIAMRepository).updateRequestState(true, 1);
	}
	
	@Test
	@DisplayName("save_request_not_attended() => validar que se cancele las solicitudes roles")
	void save_request_not_attended() throws IOException {
		
		RequestStatusSIAMEntity dataRequestStatusSIAM = convert_request_status_siam_entity();
		RequestSIAMEntity dataRequestSIAM = convert_request_siam_entity("request_modificar_rol_funcional_pendiente.json"); 
		
		when(requestStatusSIAMRepository.findByCodigo(RequestTypeEnum.CANCELLED.getCodigo())).thenReturn(dataRequestStatusSIAM);
		when(requestSIAMRepository.findById(anyInt())).thenReturn(Optional.of(dataRequestSIAM));
		
		requestRepository.saveRequestNotAttended(1);
		
		verify(requestSIAMRepository).save(any(RequestSIAMEntity.class));
		verify(requestStatusSIAMRepository).findByCodigo(RequestTypeEnum.CANCELLED.getCodigo());
		verify(requestSIAMRepository).findById(anyInt());
	}
	
	@Test
	@DisplayName("insert() => registrar una solicitud de creacion de rol")
	void insert() throws IOException {
		
		RequestEntity newRequestEntity = convert_request_entity();
		
		PersonSIAMEntity dataPersonSIAM = convert_responsable_siam_entity();
		RequestStatusSIAMEntity dataRequestStatusSIAM = convert_request_status_siam_entity();
		RequestTypeSIAMEntity dataRequestTypeSIAM = convert_request_type_create_entity();
		
		when(personSecuritySIAMRepository.findById(anyInt())).thenReturn(Optional.of(dataPersonSIAM));
		when(requestStatusSIAMRepository.findByCodigo(anyString())).thenReturn(dataRequestStatusSIAM);
		when(requestTypeSIAMRepository.findById(anyInt())).thenReturn(Optional.of(dataRequestTypeSIAM));
		
		doAnswer( invocation -> {
			ApplicationSIAMEntity app = new ApplicationSIAMEntity();
			app.setAplicacionId(invocation.getArgument(0));
			return Optional.of(app);
		}).when( applicationSIAMRepository ).findById( anyInt() );
		
		RequestEntity requestEntity = requestRepository.insert(newRequestEntity);
		
		assertNotNull(requestEntity);
		assertEquals( 1, requestEntity.getSolicitudId() );
		
		verify(requestSIAMRepository).save(any(RequestSIAMEntity.class));
		verify(requestApplicationSIAMRepository, times(3)).save(any(RequestApplicationSIAMEntity.class));
		verify(applicationSIAMRepository, times(3)).findById(anyInt());
		verify(personSecuritySIAMRepository).findById(anyInt());
		verify(requestStatusSIAMRepository).findByCodigo(RequestTypeEnum.CREATE.getCodigo());
		verify(requestTypeSIAMRepository).findById(1);
	}
	
	
	private RequestTypeSIAMEntity convert_request_type_create_entity() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/solicitudes_roles/request_type_create.json"));
		return gson.fromJson(reader, RequestTypeSIAMEntity.class);
	}
	
	private RequestEntity convert_request_entity() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/solicitudes_roles/request_nuevo_rol_funcional.json"));
		return gson.fromJson(reader, RequestEntity.class);
	}
	
	private RequestSIAMEntity convert_request_siam_entity( String name ) throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/solicitudes_roles/", name));
		return gson.fromJson(reader, RequestSIAMEntity.class);
	}
	
	private RequestStatusSIAMEntity convert_request_status_siam_entity() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/solicitudes_roles/request_status.json"));
		return gson.fromJson(reader, RequestStatusSIAMEntity.class);
	}
	
	private PersonSIAMEntity convert_responsable_siam_entity() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/solicitudes_roles/responsable.json"));
		return gson.fromJson(reader, PersonSIAMEntity.class);
	}
	
	private Optional<PersonSIAMEntity> convert_persona_siam_entity() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/solicitudes_roles/persona.json"));
		PersonSIAMEntity person = gson.fromJson(reader, PersonSIAMEntity.class);
		return Optional.of(person);
	}
	
	private PersonEntity convert_responsable_entity(PersonSIAMEntity personSIAMEntity) throws IOException {
		PersonEntity personEntity= new PersonEntity();
		personEntity.setPersonaId(personSIAMEntity.getPersonaId());
		return personEntity;
	}
}
