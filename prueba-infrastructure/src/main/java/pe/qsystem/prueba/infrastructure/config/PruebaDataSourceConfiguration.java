package pe.qsystem.prueba.infrastructure.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import com.zaxxer.hikari.HikariDataSource;
import java.util.HashMap;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "pruebaEntityManagerFactory", transactionManagerRef = "pruebaTransactionManager", basePackages = {
		"pe.qsystem.prueba.infrastructure.qsystemdb" })
public class PruebaDataSourceConfiguration {

	@Primary
	@Bean(name = "pruebaDataSourceProperties")
	@ConfigurationProperties("spring.datasource-prueba")
	public DataSourceProperties pruebaDataSourceProperties() {
		return new DataSourceProperties();
	}

	@Primary
	@Bean(name = "pruebaDataSource")
	@ConfigurationProperties("spring.datasource-prueba.configuration")
	public DataSource pruebaDataSource(
			@Qualifier("pruebaDataSourceProperties") DataSourceProperties pruebaDataSourceProperties) {
		return pruebaDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
	}

	@Primary
	@Bean(name = "pruebaEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean pruebaEntityManagerFactory(
			EntityManagerFactoryBuilder primaryEntityManagerFactoryBuilder,
			@Qualifier("pruebaDataSource") DataSource pruebaDataSource) {

		Map<String, String> primaryJpaProperties = new HashMap<>();

		return primaryEntityManagerFactoryBuilder.dataSource(pruebaDataSource)
				.packages("pe.qsystem.prueba.infrastructure.qsystemdb.entity").persistenceUnit("pruebaDataSource")
				.properties(primaryJpaProperties)
				.mappingResources("META-INF/orm_policy.xml", "META-INF/orm_rda.xml", "META-INF/orm_execution.xml")
				.build();
	}

	@Primary
	@Bean(name = "pruebaTransactionManager")
	public PlatformTransactionManager pruebaTransactionManager(
			@Qualifier("pruebaEntityManagerFactory") EntityManagerFactory pruebaEntityManagerFactory) {
		return new JpaTransactionManager(pruebaEntityManagerFactory);
	}

	@Primary
	@Bean("pruebaJdbcTemplate")
	public NamedParameterJdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}

}
