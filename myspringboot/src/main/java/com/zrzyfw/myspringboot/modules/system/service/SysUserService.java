package com.zrzyfw.myspringboot.modules.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zrzyfw.myspringboot.modules.system.entity.SysUser;

public interface SysUserService extends IService<SysUser> {

    SysUser getUser(String id);

    Boolean addUser(SysUser sysUser);

    Boolean updateUser(SysUser sysUser);

    Boolean deleteUser(String id);

}
