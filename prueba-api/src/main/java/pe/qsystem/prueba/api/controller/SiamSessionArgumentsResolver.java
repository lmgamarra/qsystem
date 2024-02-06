package pe.qsystem.prueba.api.controller;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;
//import pe.qsystem.prueba.session.SiamSession;

/**
 *
 * @author Nestor Hernandez Loli
 */
public class SiamSessionArgumentsResolver implements HandlerMethodArgumentResolver {

    @Override
    public boolean supportsParameter(MethodParameter param) {
        return true; //param.getParameterType().equals(SiamSession.class);
    }

    @Override
    public Object resolveArgument(MethodParameter param, ModelAndViewContainer mavContainer,
            NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
        return null; //SiamSession.getInstance();
    }

}
