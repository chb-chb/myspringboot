package com.zrzyfw.myspringboot.modules.common.exception;

import com.zrzyfw.myspringboot.modules.common.utils.R;
import org.springframework.transaction.CannotCreateTransactionException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(MyCustomException.class)
    @ResponseBody
    public R returnMyCustomException(MyCustomException e) {
        return R.failed(e.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public R returnMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        Map<String, Object> result = new HashMap<>();
        List<FieldError> fieldError = e.getFieldErrors();
        for(FieldError error : fieldError) {
            result.put(error.getField(), error.getDefaultMessage());
        }
        return R.failed(result);
    }

    @ExceptionHandler(CannotCreateTransactionException.class)
    @ResponseBody
    public R returnCannotCreateTransactionException(CannotCreateTransactionException e) {
        return R.failed(e.getMessage());
    }

}
