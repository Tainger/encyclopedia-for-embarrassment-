package com.alieducation.exception;


import com.alieducation.util.ChoushiUtil;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

import java.util.List;

@ControllerAdvice
@ResponseBody
public class GlobeExceptionHandler {

    /**
     * 这个方法和我们写的controller一样
     * @param request
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(HttpServletRequest request,Exception e){
        //拦截参数绑定异常
        if(e instanceof BindException){
            BindException ex = (BindException)e;
            List<ObjectError> errors = ex.getAllErrors();
            ObjectError error = errors.get(0);
            String msg = error.getDefaultMessage();
            ex.printStackTrace();
            return ChoushiUtil.getJsonString(500,msg);
        }else{
            String msg = e.getMessage();
            e.printStackTrace();
            return ChoushiUtil.getJsonString(500,msg);
        }

    }

}
