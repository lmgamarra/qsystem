package pe.telefonica.siam.api.controller;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import com.google.gson.Gson;

import pe.telefonica.siam.api.dto.ProfileDto;
import pe.telefonica.siam.api.mapper.PageableActiveMapper;
import pe.telefonica.siam.api.mapper.ProfileMapper;
import pe.telefonica.siam.api.mapper.UserSecurityMapper;
import pe.telefonica.siam.domain.entity.ProfileEntity;
import pe.telefonica.siam.domain.service.ProfileService;

@WebMvcTest(controllers = ProfileController.class)
@AutoConfigureMockMvc(addFilters = false)
@Disabled(value = "Se comento este clase test despues de agregar codigo al controlador para el registro de logs, verificar los test si es necesario")
public class ProfileControllerApiTest {

	private static final String pathTest = "src/test/resources";

	@MockBean
	private ProfileService profileService;

	@MockBean
	private ProfileMapper profileMapper;

	@MockBean
	private UserSecurityMapper userSecurityMapper;

	@MockBean
	private PageableActiveMapper pageableActiveMapper;

	@Autowired
	private MockMvc mockMvc;

	ProfileEntity entity;

	@Before
	public void setUp() {
		entity = new ProfileEntity();
	}

	@Test
	@WithMockUser(username = "admin")
	public void test_bad_request_01() throws Exception {
		byte[] bArray = Files.readAllBytes(Paths.get(pathTest, "profile/user_format_invalid.json"));

		this.mockMvc.perform(post("/profile").content(bArray).contentType(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombrePerfil[0]", containsString("must not be null")));

	}

	@Test
	@WithMockUser(username = "admin")
	public void test_bad_request_02() throws Exception {
		byte[] bArray = Files.readAllBytes(Paths.get(pathTest, "profile/profile_vacio.json"));

		this.mockMvc.perform(post("/profile").content(bArray).contentType(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isBadRequest())
				.andExpect(jsonPath("$.nombrePerfil[0]", containsString("must not be null")));

	}

	/*
	@Ignore
	@Test
	@WithMockUser(username = "admin")
	public void test_ok() throws Exception {
		byte[] bArray = Files.readAllBytes(Paths.get(pathTest, "profile/profile_ok.json"));

		ProfileDto entityDto = convert_profile_dto("profile/profile_ok.json");

		when(profileMapper.asProfileEntity(entityDto)).thenReturn(entity);
		when(profileService.insert(entity)).thenReturn(entity);
		when(profileMapper.asProfileDTO(entity)).thenReturn(entityDto);

		this.mockMvc.perform(post("/profile").content(bArray).contentType(MediaType.APPLICATION_JSON)).andDo(print())
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.nombrePerfil", containsString(entityDto.getNombrePerfil())))
				.andExpect(jsonPath("$.modulos[0].moduloId").value(entityDto.getModulos().get(0).getModuloId()));

	}
*/
	private ProfileDto convert_profile_dto(String path) throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get(pathTest, path));
		return gson.fromJson(reader, ProfileDto.class);
	}

}
