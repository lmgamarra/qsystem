package pe.telefonica.siam.infrastructure.repository;

import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;

import pe.telefonica.siam.domain.repository.RequestRepository;
import pe.telefonica.siam.infrastructure.mapper.ApplicationSIAMMapper;
import pe.telefonica.siam.infrastructure.mapper.RequestSIAMMapper;

@TestConfiguration
public class RequestTestConfig {
	
	@Bean
	public RequestRepository requestRepository() {
		return new RequestRepositoryImpl();
	}
	@Bean
	public RequestSIAMMapper requestSIAMMapper() {
		return Mappers.getMapper(RequestSIAMMapper.class);
	}
	@Bean
	public ApplicationSIAMMapper applicationSIAMMapper() {
		return Mappers.getMapper(ApplicationSIAMMapper.class);
	}
}
