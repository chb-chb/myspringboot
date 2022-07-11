package com.zrzyfw.myspringboot.modules.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zrzyfw.myspringboot.modules.common.constants.CacheConstants;
import com.zrzyfw.myspringboot.modules.common.exception.GraceException;
import com.zrzyfw.myspringboot.modules.system.dao.SysUserDao;
import com.zrzyfw.myspringboot.modules.system.entity.SysUser;
import com.zrzyfw.myspringboot.modules.system.service.SysUserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements SysUserService {

    /**
     * 查询
     */
    @Override
    @Cacheable(value = CacheConstants.SYS_USER_CACHE, key = "#id", unless = "#result == null")
    public SysUser getUser(String id) {
        SysUser user = this.getById(id);
        if(user == null) {
            GraceException.display("未查询到相关信息");
        }
        return user;
    }

    /**
     * 新增
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    @CacheEvict(value = CacheConstants.SYS_USER_CACHE, allEntries = true)
    public Boolean addUser(SysUser sysUser) {
        sysUser.setGmtCreate(LocalDateTime.now());
        sysUser.setGmtModified(sysUser.getGmtCreate());
        return this.save(sysUser);
    }

    /**
     * 修改
     */
    @Override
    @CacheEvict(value = CacheConstants.SYS_USER_CACHE, allEntries = true)
    @Transactional(rollbackFor = Exception.class)
    public Boolean updateUser(SysUser sysUser) {
        return this.updateById(sysUser);
    }

    /**
     * 删除
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    @CacheEvict(value = CacheConstants.SYS_USER_CACHE, allEntries = true)
    public Boolean deleteUser(String id) {
        return this.removeById(id);
    }

}
