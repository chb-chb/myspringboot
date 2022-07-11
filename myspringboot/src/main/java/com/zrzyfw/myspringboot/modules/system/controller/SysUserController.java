package com.zrzyfw.myspringboot.modules.system.controller;

import com.zrzyfw.myspringboot.modules.common.utils.R;
import com.zrzyfw.myspringboot.modules.system.dao.SysUserDao;
import com.zrzyfw.myspringboot.modules.system.entity.SysUser;
import com.zrzyfw.myspringboot.modules.system.service.SysUserService;
import lombok.AllArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class SysUserController {

    private final SysUserDao sysUserDao;
    private final SysUserService sysUserService;

    @GetMapping("/hello")
    public String testHello() {
        return "你好,StringBoot!";
    }

    @PostMapping("/interceptor")
    public R testInterceptor() {
        return R.ok("你好,Interceptor!");
    }

    @GetMapping("/findUserByName")
    public R testInterceptor(String name) {
        List<SysUser> sysUsers = sysUserDao.findUserByName(name);
        return sysUsers.size() > 0 ? R.ok(sysUsers) : R.failed("用户不存在");
    }

    /**
     * 查询
     */
    @GetMapping("/getById/{id}")
    public R getById(@PathVariable String id) {
        return R.ok(sysUserService.getUser(id));
    }

    /**
     * 新增
     */
    @PostMapping("/add")
    public R addUser(@Valid @RequestBody SysUser sysUser) {
        return R.ok(sysUserService.addUser(sysUser));
    }

    /**
     * 修改
     */
    @PutMapping("/update")
    public R updateUser(@RequestBody SysUser sysUser) {
        return R.ok(sysUserService.updateUser(sysUser));
    }

    /**
     * 删除
     */
    @DeleteMapping("/delete/{id}")
    public R deleteUser(@PathVariable String id) {
        return R.ok(sysUserService.deleteUser(id));
    }

}
