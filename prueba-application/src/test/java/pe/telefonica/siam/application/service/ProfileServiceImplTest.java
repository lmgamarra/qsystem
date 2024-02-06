package pe.telefonica.siam.application.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.google.gson.Gson;
import pe.telefonica.siam.domain.entity.ProfileEntity;
import pe.telefonica.siam.domain.errors.ProfileMapErrors;
import pe.telefonica.siam.domain.exceptions.BussinesSIAMException;
import pe.telefonica.siam.domain.exceptions.DatabaseSIAMException;
import pe.telefonica.siam.domain.repository.ProfileParameterRepository;
import pe.telefonica.siam.domain.repository.ProfileRepository;
import pe.telefonica.siam.domain.repository.UserSecurityRepository;

@ExtendWith(MockitoExtension.class)
class ProfileServiceImplTest {
	private static final String pathTest = "src/test/resources";

	@InjectMocks
	private ProfileServiceImpl profileService = new ProfileServiceImpl();

	@Mock
	private ProfileRepository profileRepository;
	@Mock
	private UserSecurityRepository userSecurityRepository;
	@Mock
	private ProfileParameterRepository profileParameterRepository;

	private ProfileEntity profileEntity;

	@BeforeEach
	public void setUp() {
		profileEntity = new ProfileEntity();
		profileEntity.setPerfilId(1);
		profileEntity.setNombrePerfil("ADMIN ACCESOS");

	}

	@Test
	void insert_perfil_existente() throws IOException {
		ProfileEntity profileTest = convert_profile_entity("/profile/profile_nombre_repetido.json");
		when(profileRepository.findByName(profileTest.getNombrePerfil())).thenReturn(profileEntity);

		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			profileService.insert(profileEntity);
		});
		assertEquals(exception.getCustomMessage(), ProfileMapErrors
				.getErrorStringResponse(ProfileMapErrors.CODE_PERFIL_EXISTENTE, profileEntity.getNombrePerfil()));

	}

	@Test
	void insert_perfil_error_db() throws IOException {
		ProfileEntity profileTest = convert_profile_entity("/profile/profile_nombre_repetido.json");
		when(profileRepository.findByName(profileTest.getNombrePerfil())).thenReturn(null);
		when(profileRepository.insert(profileTest)).thenThrow(new RuntimeException());

		BussinesSIAMException exception = assertThrows(BussinesSIAMException.class, () -> {
			profileService.insert(profileEntity);
		});
		assertEquals(exception.getCustomMessage(),
				ProfileMapErrors.getErrorStringResponse(ProfileMapErrors.CODE_DB_INSERTAR_PERFIL));

	}

	@Test
	void insert_perfil_ok() throws IOException {
		ProfileEntity profileTest = convert_profile_entity("/profile/profile_ok.json");
		when(profileRepository.findByName(profileTest.getNombrePerfil())).thenReturn(null);
		when(profileRepository.insert(profileTest)).thenReturn(profileTest);
		ProfileEntity profileEntityReturn = profileService.insert(profileTest);

		assertNotNull(profileEntityReturn);

	}

	private ProfileEntity convert_profile_entity(String path) throws IOException {
		Gson gson = new Gson();
		Reader reader = Files.newBufferedReader(Paths.get(pathTest, path));
		return gson.fromJson(reader, ProfileEntity.class);
	}

}
