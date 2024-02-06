package pe.qsystem.prueba.api.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pe.qsystem.prueba.api.RequestApi;
import pe.qsystem.prueba.api.dto.RequestResponseDto;
import pe.qsystem.prueba.api.mapper.RequestMapper;
import pe.qsystem.prueba.domain.entity.RequestComportamientoEntity;
import pe.qsystem.prueba.domain.entity.RequestPersonaEntity;
import pe.qsystem.prueba.domain.service.ComportamientoService;
import pe.qsystem.prueba.domain.service.PersonaService;


@lombok.extern.slf4j.Slf4j
@RestController
public class RequestController implements RequestApi {

    @Autowired
    private PersonaService personaService;
    @Autowired
    private ComportamientoService comportamientoService;    
    @Autowired
    private RequestMapper requestMapper;    

    @Override
    public ResponseEntity<RequestResponseDto> _orderByDniRequest() {
    	RequestPersonaEntity requestEntity = personaService.orderByDni();        
        return ResponseEntity.ok(requestMapper.asRequestDto(requestEntity));
    }

    @Override
    public ResponseEntity<RequestResponseDto> _orderByLastNameRequest() {
    	RequestPersonaEntity requestEntity = personaService.orderByLastName();        
        return ResponseEntity.ok(requestMapper.asRequestDto(requestEntity));
    }
    
    @Override
    public ResponseEntity<RequestResponseDto> _listRequest() {
    	RequestPersonaEntity requestEntity = personaService.list();        
        return ResponseEntity.ok(requestMapper.asRequestDto(requestEntity));
    }
    
    @Override
    public ResponseEntity<RequestResponseDto> _findRequestByCenterId(@PathVariable("centroId") Integer centroId) {
    	RequestComportamientoEntity requestEntity = comportamientoService.getBehaviorPerCenter(centroId);        
        return ResponseEntity.ok(requestMapper.asRequestDto(requestEntity));
    }
    
    @Override
    public ResponseEntity<RequestResponseDto> _findRequestBySignaturerId(@PathVariable("firmaId") Integer firmaId) {
    	RequestComportamientoEntity requestEntity = comportamientoService.getBehaviorPerSignature(firmaId);        
        return ResponseEntity.ok(requestMapper.asRequestDto(requestEntity));
    }    

}
