package com.leetest.ExceptionAdvice;

import com.leetest.pojo.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class projectExceptionadvice {
    @ExceptionHandler(Exception.class)
    public R doexception(Exception ex){
          ex.printStackTrace();
        return new R("系统繁忙");
    }
}
