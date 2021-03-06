package com.zgq.bookman.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.zgq.bookman.mapper")
public class MybaitsConfig {
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        // 设置请求的页面大于最大页后操作， true 调回到首页，false 继续请求默认false
        paginationInterceptor.setOverflow(false);
        // 设置最大单页限制数量，默认500 条，-1 不受限制
        paginationInterceptor.setLimit(500);
        return paginationInterceptor;
    }
}
