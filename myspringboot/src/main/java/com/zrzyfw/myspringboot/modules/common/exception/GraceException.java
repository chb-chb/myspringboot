package com.zrzyfw.myspringboot.modules.common.exception;


public class GraceException {

    public static void display(String errorMsg) {
        throw new MyCustomException(errorMsg);
    }

}
