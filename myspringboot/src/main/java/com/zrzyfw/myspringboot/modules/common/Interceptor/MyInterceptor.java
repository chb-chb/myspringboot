package com.zrzyfw.myspringboot.modules.common.Interceptor;

import com.zrzyfw.myspringboot.modules.common.enums.LoginEnum;
import com.zrzyfw.myspringboot.modules.common.exception.GraceException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 实现拦截器接口
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String username = request.getHeader("username");
        String token = request.getHeader("token");
        if(StringUtils.isBlank(username) || StringUtils.isBlank(token)) {
            log.error("账号或授权为空！");
            GraceException.display(LoginEnum.IS_EMPTY.getMsg());
            return false;
        }
        if(!username.equals("chb") || !token.equals("chb123")) {
            log.error("账号或授权有误！");
            GraceException.display(LoginEnum.NOT_POWER.getMsg());
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
