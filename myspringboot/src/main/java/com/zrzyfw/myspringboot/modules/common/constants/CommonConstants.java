package com.zrzyfw.myspringboot.modules.common.constants;

/**
 * @author Create by yachtcay
 * @date 2019/7/10 15:49
 */
public interface CommonConstants {

    /**
     * 超级管理员id
     */
    String ADMIN_ID = "1";

    /**
     * admin 角色
     */
    String ROLE_ADMIN = "admin";

    /**
     * 顶级节点id
     */
    String TOP_NODE = "0";

    /**
     * 菜单
     */
    String MENU = "0";

    /**
     * 成功状态
     */
    Integer SUCCESS = 0;
    /**
     * 失败状态
     */
    Integer FAIL = 1;
    /**
     * 成功提示
     */
    String SUCCESS_MESSAGE = "success";
    /**
     * 失败提示
     */
    String FAIL_MESSAGE = "fail";
    /**
     * list 大小为0
     */
    Integer LIST_SIZE_ZERO = 0;

    /**
     * list 第一条数据
     */
    Integer LIST_INDEX_ZERO = 0;
    /**
     * 空字符
     */
    String EMPTY = "";

    /**
     * 删除
     */
    Integer STATUS_DEL = 1;
    /**
     * 正常
     */
    Integer STATUS_NORMAL = 0;

    /**
     * 锁定
     */
    Integer STATUS_LOCK = 9;

    /**
     * 编码
     */
    String UTF8 = "UTF-8";

    /**
     * JSON 资源
     */
    String CONTENT_TYPE = "application/json;charset=utf-8";

    /**
     * 逗号
     */
    String COMMA = ",";

    /**
     * 登录状态--在线
     */
    Integer ONLINE = 0;
    /**
     * 登录状态--离线
     */
    Integer LOGOUT = 1;

    /**
     * 在线用户前缀
     */
    String ONLINE_TOKEN_PREFIX = "online-token-";
}
