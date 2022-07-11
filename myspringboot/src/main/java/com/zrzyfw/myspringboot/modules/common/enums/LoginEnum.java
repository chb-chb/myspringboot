package com.zrzyfw.myspringboot.modules.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public enum LoginEnum implements Serializable {
    IS_EMPTY(0, "账号或授权为空！"),
    NOT_POWER(1, "账号或授权有误！");

    private final Integer code;
    private final String msg;

}
