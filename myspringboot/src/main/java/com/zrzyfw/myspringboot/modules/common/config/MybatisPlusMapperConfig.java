package com.zrzyfw.myspringboot.modules.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.zrzyfw.myspringboot.modules.**.dao")
public class MybatisPlusMapperConfig {
    /**
     * 分页插件
     *
     * @return PaginationInterceptor
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //分页单页最大条数
        paginationInterceptor.setLimit(5000);
        return paginationInterceptor;
    }
}
