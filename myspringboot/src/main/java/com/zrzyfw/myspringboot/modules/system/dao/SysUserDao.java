package com.zrzyfw.myspringboot.modules.system.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zrzyfw.myspringboot.modules.system.entity.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserDao extends BaseMapper<SysUser> {

    List<SysUser> findUserByName(@Param("name") String name);

}
