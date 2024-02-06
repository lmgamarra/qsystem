package pe.telefonica.siam.application.service;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import pe.telefonica.siam.domain.entity.FrequencyTypeEntity;
import pe.telefonica.siam.domain.entity.PolicyEntity;
import pe.telefonica.siam.domain.repository.PolicyRepository;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Nestor Hernandez Loli
 */
public class PolicyServiceImplTest {

    SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    PolicyServiceImpl policyService;

    @BeforeEach
    public void setUp() throws Exception {
        policyService = new PolicyServiceImpl();
        policyService.policyRepository = mock(PolicyRepository.class);
        policyService.schedulerFactoryBean = mock(SchedulerFactoryBean.class);
//        policyService.horaEjecucion = 8;
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        scheduler.start();
        when(policyService.schedulerFactoryBean.getScheduler()).thenReturn(scheduler);
    }

    @AfterEach
    public void after() throws Exception {
        policyService.schedulerFactoryBean.getScheduler().shutdown();
    }

    @Test
    public void test_nueva_politica() throws Exception {
        PolicyEntity policy = PolicyEntity.builder()
                .fechaInicial(new GregorianCalendar(2021, 2, 29, 8, 0,0).getTime())
                .politicaId(1L)
                .tipoPoliticaId(1L)
                .tipoFrecuenciaId((long) FrequencyTypeEntity.FREQUENCY_BIANNUAL)
                .build();
        when(policyService.policyRepository.buscarPoliticaPorTipo(policy.getTipoPoliticaId())).thenReturn(Optional.empty());
        policyService.guardarPolitica(policy);
        assertEquals(policy.getFechaInicial(), policy.getFechaSiguiente());
        //Por alguna razón Quartz en modo memoria me programa el trabajo parala fecha actual.
        //En ese sentido, tener activado Quartz aquí no es muy útil
    }
 
}
