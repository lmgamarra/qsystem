package pe.qsystem.prueba.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import lombok.extern.slf4j.Slf4j;
import pe.qsystem.prueba.domain.repository.ComportamientoDomRepository;
import pe.qsystem.prueba.domain.entity.*;
import pe.qsystem.prueba.domain.service.*;


@Slf4j
@Service
public class ComportamientoServiceImpl implements ComportamientoService {
    
    @Autowired
    private ComportamientoDomRepository comportamientoDomRepository;

	@Override
	public RequestComportamientoEntity getBehaviorPerCenter(Integer centroId) {
		RequestComportamientoEntity request = null;

        ComportamientoDomEntity behaivor = comportamientoDomRepository
                .getBehaviorPerCenter(centroId);

        if (!ObjectUtils.isEmpty(behaivor)) {
        	request = new RequestComportamientoEntity();
            request.setComportamiento(behaivor);
        }

        return request;
	}

	@Override
	public RequestComportamientoEntity getBehaviorPerSignature(Integer firmaId) {
		RequestComportamientoEntity request = null;

        ComportamientoDomEntity behaivor = comportamientoDomRepository
                .getBehaviorPerSignature(firmaId);

        if (!ObjectUtils.isEmpty(behaivor)) {
        	request = new RequestComportamientoEntity();
            request.setComportamiento(behaivor);
        }

        return request;
	}    

}
