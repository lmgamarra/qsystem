package pe.telefonica.siam.application.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.reflect.TypeToken;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.ArgumentMatchers.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.google.gson.Gson;

import pe.telefonica.siam.domain.dto.CustomPaginable;
import pe.telefonica.siam.domain.entity.*;
import pe.telefonica.siam.domain.errors.RequestMapErrors;
import pe.telefonica.siam.domain.exceptions.BussinesSIAMException;
import pe.telefonica.siam.domain.repository.FunctionalRoleRepository;
import pe.telefonica.siam.domain.repository.RequestRepository;
import pe.telefonica.siam.domain.repository.ResponsableRepository;
import pe.telefonica.siam.domain.service.TicketService;
import pe.telefonica.siam.mail.MailService;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RequestServiceImplTest {

	@InjectMocks
	private RequestServiceImpl requestServiceImpl;
	
	@Mock
	private RequestRepository requestRepository;
	@Mock
	private FunctionalRoleRepository functionalRoleRepository;
	@Mock
	private ResponsableRepository responsableRepository;
	@Mock
	private MailService mailService;
	@Mock
	private TicketService ticketService;

	@Test
	public void validar_existe_rol_funcional() {
		
		FunctionalRoleEntity fr1=new FunctionalRoleEntity();
		fr1.setPerfilesId("1,27,71");
		FunctionalRoleEntity fr2=new FunctionalRoleEntity();
		fr2.setPerfilesId("27,2,71");
		FunctionalRoleEntity fr3=new FunctionalRoleEntity();
		fr3.setPerfilesId("19,27,73");
		
		List<FunctionalRoleEntity> data = Arrays.asList(fr1,fr2,fr3);
		
		when(functionalRoleRepository.findRolesToValidateProfiles(3, 3)).thenReturn(data);
		when(requestRepository.validateResponsable(null)).thenReturn(true);
		
		RequestEntity requestEntity=new RequestEntity();
		
		RequestTypeEntity requestTypeEntity=new RequestTypeEntity();
		requestTypeEntity.setTipoSolicitudId(1);
		
		requestEntity.setTipoSolicitud(requestTypeEntity);
		
		ProfileFunctionalEntity pf1=new ProfileFunctionalEntity();
		pf1.setPerfilId(19);
		
		ProfileFunctionalEntity pf2=new ProfileFunctionalEntity();
		pf2.setPerfilId(27);
		
		ProfileFunctionalEntity pf3=new ProfileFunctionalEntity();
		pf3.setPerfilId(73);
		
		List<ProfileFunctionalEntity> pfs = Arrays.asList(pf1,pf2,pf3);
		
		requestEntity.setProfilesFunctional(pfs);
		
		ChannelEntity channelEntity=new ChannelEntity();
		channelEntity.setCanalId(3);
		
		requestEntity.setCanal(channelEntity);
		
		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			requestServiceImpl.perfilarRequest(requestEntity);
		});
		
		assertEquals(exception.getCustomMessage(), RequestMapErrors.getErrorStringResponse(RequestMapErrors.CODE_ERROR_ROL_FUNCIONAL_EXIST));
	}
	
	@Test
	public void validate_nombre_rol_funcional() {
		
		RequestEntity requestEntity=new RequestEntity();
		RequestTypeEntity requestTypeEntity=new RequestTypeEntity();
		requestTypeEntity.setTipoSolicitudId(1);
		
		requestEntity.setTipoSolicitud(requestTypeEntity);
		requestEntity.setNombreRol("APP_CREATE_TEST");
		
		when(functionalRoleRepository.existsByNombre(requestEntity.getNombreRol() )).thenReturn(true);
		when(requestRepository.validateResponsable(null)).thenReturn(true);
		
		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			requestServiceImpl.insert(requestEntity);
		});
		
		BussinesSIAMException exception2 = assertThrows(BussinesSIAMException.class, () -> {
			requestServiceImpl.update(requestEntity);
		});
		
		assertEquals(exception.getCustomMessage(), RequestMapErrors.getErrorStringResponse(RequestMapErrors.CODE_ERROR_NAME_ROL_FUNCIONAL_EXIST));
		assertEquals(exception2.getCustomMessage(), RequestMapErrors.getErrorStringResponse(RequestMapErrors.CODE_ERROR_NAME_ROL_FUNCIONAL_EXIST));
	}
	
	
	@Test
	public void test_crear_rol_funcional() throws IOException {
		
		RequestEntity newRequestEntity = convert_request_entity("/roles_funcionales/request_nuevo_rol_funcional.json");
		
		when( requestRepository.validateResponsable( any(PersonEntity.class) )).thenReturn(true);
		when( functionalRoleRepository.existsByNombre(newRequestEntity.getNombreRol())).thenReturn(false);
		when( requestRepository.insert(newRequestEntity)).thenReturn(newRequestEntity);
		
		RequestEntity requestEntityCreado = requestServiceImpl.insert(newRequestEntity);
		
		assertNotNull(requestEntityCreado);		
		assertEquals("APP_NUEVO_001", requestEntityCreado.getNombreRol() );
		assertNotNull(requestEntityCreado.getAplicaciones());
		assertEquals(3, requestEntityCreado.getAplicaciones().size());
		assertNotNull(requestEntityCreado.getResponsable());
		assertEquals(100, requestEntityCreado.getResponsable().getPersonaId() );
		assertNotNull(requestEntityCreado.getTipoSolicitud());
		assertEquals(1, requestEntityCreado.getTipoSolicitud().getTipoSolicitudId());

		verify(requestRepository).validateResponsable(any(PersonEntity.class));
		verify(functionalRoleRepository).existsByNombre(newRequestEntity.getNombreRol());
		verify(requestRepository).insert(newRequestEntity);
	}

	@Test
	public void test_crear_rol_funcional_validar_aplicaciones() throws IOException {

		RequestEntity newRequestEntity = convert_request_entity("/roles_funcionales/request_nuevo_rol_funcional.json");

		newRequestEntity.getEstadoSolicitud().setCodigo("PENDIENTE");
		newRequestEntity.setAplicaciones(null);

		when( requestRepository.validateResponsable( any(PersonEntity.class) )).thenReturn(true);
		when( functionalRoleRepository.existsByNombre(newRequestEntity.getNombreRol())).thenReturn(false);

		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			requestServiceImpl.insert(newRequestEntity);
		});

		assertEquals(RequestMapErrors.getErrorStringResponse(RequestMapErrors.CODE_ERROR_EMPTY_APPLICATIONS_LIST), exception.getCustomMessage());

		verify(requestRepository).validateResponsable(any(PersonEntity.class));
		verify(functionalRoleRepository).existsByNombre(newRequestEntity.getNombreRol());
		verify(requestRepository, never()).insert(newRequestEntity);
	}

	@Test
	public void test_crear_rol_funcional_validar_nombre_rol_existe() throws IOException {

		RequestEntity newRequestEntity = convert_request_entity("/roles_funcionales/request_nuevo_rol_funcional.json");

		when( requestRepository.validateResponsable( any(PersonEntity.class) )).thenReturn(true);
		when( functionalRoleRepository.existsByNombre(newRequestEntity.getNombreRol())).thenReturn(true);

		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			requestServiceImpl.insert(newRequestEntity);
		});

		assertEquals(RequestMapErrors.getErrorStringResponse(RequestMapErrors.CODE_ERROR_NAME_ROL_FUNCIONAL_EXIST), exception.getCustomMessage());

		verify(requestRepository).validateResponsable(any(PersonEntity.class));
		verify(functionalRoleRepository).existsByNombre(newRequestEntity.getNombreRol());
		verify(requestRepository, never()).insert(newRequestEntity);
	}

	@Test
	public void test_actualizar_rol_funcional() throws IOException {

		RequestEntity updateRequestEntity = convert_request_entity("/roles_funcionales/request_nuevo_rol_funcional.json");

		when( requestRepository.validateResponsable( any(PersonEntity.class) )).thenReturn(true);
		when( functionalRoleRepository.existsByNombre(updateRequestEntity.getNombreRol())).thenReturn(false);
		when( requestRepository.update(updateRequestEntity)).thenReturn(updateRequestEntity);

		RequestEntity requestEntityActualizado = requestServiceImpl.update(updateRequestEntity);

		assertNotNull(requestEntityActualizado);
		assertEquals("APP_NUEVO_001", requestEntityActualizado.getNombreRol() );
		assertNotNull(requestEntityActualizado.getAplicaciones());
		assertEquals(3, requestEntityActualizado.getAplicaciones().size());
		assertNotNull(requestEntityActualizado.getResponsable());
		assertEquals(100, requestEntityActualizado.getResponsable().getPersonaId() );
		assertNotNull(requestEntityActualizado.getTipoSolicitud());
		assertEquals(1, requestEntityActualizado.getTipoSolicitud().getTipoSolicitudId());

		verify(requestRepository).validateResponsable(any(PersonEntity.class));
		verify(functionalRoleRepository).existsByNombre(requestEntityActualizado.getNombreRol());
		verify(requestRepository).update(requestEntityActualizado);
	}

	@Test
	public void test_actualizar_rol_funcional_validar_aplicaciones() throws IOException {

		RequestEntity newRequestEntity = convert_request_entity("/roles_funcionales/request_nuevo_rol_funcional.json");

		newRequestEntity.getEstadoSolicitud().setCodigo("PENDIENTE");
		newRequestEntity.setAplicaciones(null);

		when( requestRepository.validateResponsable( any(PersonEntity.class) )).thenReturn(true);
		when( functionalRoleRepository.existsByNombre(newRequestEntity.getNombreRol())).thenReturn(false);

		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			requestServiceImpl.update(newRequestEntity);
		});

		assertEquals(RequestMapErrors.getErrorStringResponse(RequestMapErrors.CODE_ERROR_EMPTY_APPLICATIONS_LIST), exception.getCustomMessage());

		verify(requestRepository).validateResponsable(any(PersonEntity.class));
		verify(functionalRoleRepository).existsByNombre(newRequestEntity.getNombreRol());
		verify(requestRepository, never()).update(newRequestEntity);
	}

	@Test
	public void test_actualizar_rol_funcional_validar_nombre_rol_existe() throws IOException {

		RequestEntity newRequestEntity = convert_request_entity("/roles_funcionales/request_nuevo_rol_funcional.json");

		when( requestRepository.validateResponsable( any(PersonEntity.class) )).thenReturn(true);
		when( functionalRoleRepository.existsByNombre(newRequestEntity.getNombreRol())).thenReturn(true);

		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			requestServiceImpl.update(newRequestEntity);
		});

		assertEquals(RequestMapErrors.getErrorStringResponse(RequestMapErrors.CODE_ERROR_NAME_ROL_FUNCIONAL_EXIST), exception.getCustomMessage());

		verify(requestRepository).validateResponsable(any(PersonEntity.class));
		verify(functionalRoleRepository).existsByNombre(newRequestEntity.getNombreRol());
		verify(requestRepository, never()).update(newRequestEntity);
	}

	@Test
	void test_aprobar_abm_solicitud_rol_funcional() throws IOException {

		RequestEntity newRequestEntity = convert_request_entity("/roles_funcionales/request_nuevo_rol_funcional.json");

		when(requestRepository.validateResponsable(any())).thenReturn(true);
		when(requestRepository.aprobarOrRechazarRequest(any())).thenReturn(newRequestEntity);

		requestServiceImpl.aprobarOrRechazarRequest(newRequestEntity);

		verify(requestRepository).validateResponsable(any());
		verify(requestRepository).aprobarOrRechazarRequest(any());
	}

	@Test
	void test_perfilar_abm_solicitud_rol_funcional() throws IOException {

		RequestEntity newRequestEntity = convert_request_entity("/roles_funcionales/request_crear_rol_funcional_etapa_perfilar.json");

		List<FunctionalRoleEntity> roles = convert_list_roles_funcionales();

		when(functionalRoleRepository.findRolesToValidateProfiles(3, 3)).thenReturn(roles);
		when(requestRepository.validateResponsable(any(PersonEntity.class))).thenReturn(true);
		when(requestRepository.perfilarRequest(any(RequestEntity.class))).thenReturn(newRequestEntity);
		doNothing().when(mailService).send(any());

		requestServiceImpl.setUrlSiam("http://localhost:4200");
		requestServiceImpl.perfilarRequest(newRequestEntity);

		verify(requestRepository).validateResponsable(any(PersonEntity.class));
		verify(requestRepository).perfilarRequest(any(RequestEntity.class));
		verify(mailService).send(any());
	}

	@Test
	void test_perfilar_solicitud_rol_funcional_validar_ticket() throws IOException {

		RequestEntity newRequestEntity = convert_request_entity("/roles_funcionales/request_modificar_rol_funcional_etapa_perfilar.json");

		TicketEntity ticketCreado = convert_ticket_modificacion_entity();

		List<FunctionalRoleEntity> roles = convert_list_roles_funcionales();

		when(functionalRoleRepository.findRolesToValidateProfiles(3, 3)).thenReturn(roles);
		when(requestRepository.validateResponsable(any(PersonEntity.class))).thenReturn(true);
		when(requestRepository.perfilarRequest(any(RequestEntity.class))).thenReturn(newRequestEntity);
		doNothing().when(mailService).send(any());
		when(ticketService.createModificationFunctionalRoleTicket(
				newRequestEntity.getIdRolFuncionalOld(), newRequestEntity.getFunctionalRole().getRolFuncionalId(),
				newRequestEntity.getPerfilador().getPersonaId(), newRequestEntity.getAprobador().getPersonaId()
		)).thenReturn(ticketCreado);
		//doNothing().when(requestRepository).updateRequestState(true, newRequestEntity.getFunctionalRole().getRolFuncionalId() );
		//doNothing().when(requestRepository).updateRequestState(false, newRequestEntity.getIdRolFuncionalOld() );

		requestServiceImpl.setUrlSiam("http://localhost:4200");

		RequestEntity requestCreado = requestServiceImpl.perfilarRequest(newRequestEntity);

		assertEquals("TGR2108170000000040", requestCreado.getTicketNumeroModificacion());

		verify(requestRepository).validateResponsable(any(PersonEntity.class));
		verify(requestRepository).perfilarRequest(any(RequestEntity.class));
		verify(mailService).send(any());
		verify(ticketService).createModificationFunctionalRoleTicket(
				newRequestEntity.getIdRolFuncionalOld(), newRequestEntity.getFunctionalRole().getRolFuncionalId(),
				newRequestEntity.getPerfilador().getPersonaId(), newRequestEntity.getAprobador().getPersonaId());
	}

	@Test
	void test_rol_sin_usuarios_asociados_ticket_null() throws IOException {

		RequestEntity newRequestEntity = convert_request_entity("/roles_funcionales/request_modificar_rol_funcional_etapa_perfilar.json");

		List<FunctionalRoleEntity> roles = convert_list_roles_funcionales();

		when(functionalRoleRepository.findRolesToValidateProfiles(3, 3)).thenReturn(roles);
		when(requestRepository.validateResponsable(any(PersonEntity.class))).thenReturn(true);
		when(requestRepository.perfilarRequest(any(RequestEntity.class))).thenReturn(newRequestEntity);
		doNothing().when(mailService).send(any());
		when(ticketService.createModificationFunctionalRoleTicket(
				newRequestEntity.getIdRolFuncionalOld(), newRequestEntity.getFunctionalRole().getRolFuncionalId(),
				newRequestEntity.getPerfilador().getPersonaId(), newRequestEntity.getAprobador().getPersonaId()
		)).thenReturn(null);
		doNothing().when(requestRepository).updateRequestState(true, newRequestEntity.getFunctionalRole().getRolFuncionalId() );
		doNothing().when(requestRepository).updateRequestState(false, newRequestEntity.getIdRolFuncionalOld() );

		requestServiceImpl.setUrlSiam("http://localhost:4200");

		RequestEntity requestCreado = requestServiceImpl.perfilarRequest(newRequestEntity);

		assertNull(requestCreado.getTicketNumeroModificacion());

		verify(requestRepository).validateResponsable(any(PersonEntity.class));
		verify(requestRepository).perfilarRequest(any(RequestEntity.class));
		verify(mailService).send(any());
		verify(ticketService).createModificationFunctionalRoleTicket(
				newRequestEntity.getIdRolFuncionalOld(), newRequestEntity.getFunctionalRole().getRolFuncionalId(),
				newRequestEntity.getPerfilador().getPersonaId(), newRequestEntity.getAprobador().getPersonaId());
		verify(requestRepository).updateRequestState(true, newRequestEntity.getFunctionalRole().getRolFuncionalId() );
		verify(requestRepository).updateRequestState(false, newRequestEntity.getIdRolFuncionalOld() );
	}
	
	@Test
	public void delete() {
		doNothing().when(requestRepository).delete(anyInt());
		requestServiceImpl.delete(1);
		verify(requestRepository).delete(anyInt());
	}
	
	@Test
	public void find_pageable_all() throws IOException {
		
		PageableEntity<RequestEntity> data = convert_list_solicitudes();
		
		when(requestRepository.findPageableAll(any())).thenReturn(data);
		
		PageableEntity<RequestEntity> requests = requestServiceImpl.findPageableAll( new CustomPaginable() );
		
		assertNotNull(requests);
		assertNotNull(requests.getData());
		assertEquals( 4, requests.getData().size());
		assertEquals( 4, requests.getTotalElements());
		
		verify(requestRepository).findPageableAll(any());
	}
	
	@Test
	public void find_by_id() throws IOException {
		
		RequestEntity data = convert_request_entity("roles_funcionales/request_modificar_rol_funcional_etapa_perfilar.json");
		
		when(requestRepository.findById(1)).thenReturn(data);
		
		RequestEntity entity = requestServiceImpl.findById(1);
		
		assertNotNull(entity);
		assertEquals(1, entity.getSolicitudId());
		assertEquals("REQ2021101800001", entity.getTicketNumero());
		assertNotNull(entity.getAplicaciones());
		assertEquals(3, entity.getAplicaciones().size());
		
		verify(requestRepository).findById(1);
	}

	private RequestEntity convert_request_entity(String path) throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources", path));
		return gson.fromJson(reader, RequestEntity.class);
	}

	private List<FunctionalRoleEntity> convert_list_roles_funcionales() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/roles_funcionales/roles_funcionales_perfiles.json"));
		return gson.fromJson(reader, new TypeToken<List<FunctionalRoleEntity>>(){}.getType());
	}
	
	private PageableEntity<RequestEntity> convert_list_solicitudes() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/roles_funcionales/list_requests.json"));
		return gson.fromJson(reader, new TypeToken<PageableEntity<RequestEntity>>(){}.getType());
	}

	private TicketEntity convert_ticket_modificacion_entity() throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get("src/test/resources/roles_funcionales/ticket_modificacion.json"));
		return gson.fromJson(reader, TicketEntity.class);
	}
}
