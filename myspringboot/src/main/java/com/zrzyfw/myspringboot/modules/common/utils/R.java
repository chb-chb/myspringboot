package com.zrzyfw.myspringboot.modules.common.utils;

import com.zrzyfw.myspringboot.modules.common.constants.CommonConstants;
import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 返回实体
 *
 * @author Create by yachtcay
 * @date 2019/5/29 14:37
 */
@Builder
@ToString
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class R<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    @Getter
    @Setter
    private Integer code;

    @Getter
    @Setter
    private String msg;

    @Getter
    @Setter
    private T data;

    public static <T> com.zrzyfw.myspringboot.modules.common.utils.R<T> ok() {
        return restResult(CommonConstants.SUCCESS, CommonConstants.SUCCESS_MESSAGE, null);
    }

    public static <T> com.zrzyfw.myspringboot.modules.common.utils.R<T> ok(T data) {
        return restResult(CommonConstants.SUCCESS, CommonConstants.SUCCESS_MESSAGE, data);
    }

    public static <T> com.zrzyfw.myspringboot.modules.common.utils.R<T> ok(String msg, T data) {
        return restResult(CommonConstants.SUCCESS, msg, data);
    }

    public static <T> com.zrzyfw.myspringboot.modules.common.utils.R<T> failed() {
        return restResult(CommonConstants.FAIL, CommonConstants.FAIL_MESSAGE, null);
    }

    public static <T> com.zrzyfw.myspringboot.modules.common.utils.R<T> failed(String msg) {
        return restResult(CommonConstants.FAIL, msg, null);
    }

    public static <T> com.zrzyfw.myspringboot.modules.common.utils.R<T> failed(T data) {
        return restResult(CommonConstants.FAIL, CommonConstants.FAIL_MESSAGE, data);
    }

    public static <T> com.zrzyfw.myspringboot.modules.common.utils.R<T> failed(Integer code, String msg) {
        return restResult(code, msg, null);
    }

    public static <T> com.zrzyfw.myspringboot.modules.common.utils.R<T> failed(String msg, T data) {
        return restResult(CommonConstants.FAIL, msg, data);
    }

    /**
     * rest 返回结果
     *
     * @param code 返回码
     * @param msg  返回信息
     * @param data 返回数据
     * @param <T>  返回数据类型
     * @return
     */
    private static <T> com.zrzyfw.myspringboot.modules.common.utils.R<T> restResult(Integer code, String msg, T data) {
        com.zrzyfw.myspringboot.modules.common.utils.R<T> apiResult = new com.zrzyfw.myspringboot.modules.common.utils.R<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }

}
