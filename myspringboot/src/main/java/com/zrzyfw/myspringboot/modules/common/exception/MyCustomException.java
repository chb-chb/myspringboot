package com.zrzyfw.myspringboot.modules.common.exception;



public class MyCustomException extends RuntimeException {

    public MyCustomException(String errorMsg) {
        super(errorMsg);
    }

}
