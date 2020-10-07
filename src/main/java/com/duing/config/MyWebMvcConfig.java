package com.duing.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
//让Spring可以识别我们的拦截器
public class MyWebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private MyInterceptor interceptor;

    // 注册自定义拦截器，声明相关拦截规则
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//
//        registry.addInterceptor(interceptor).addPathPatterns("/**")
//                    //把这些都晒出去 让这些可以被访问
//                .excludePathPatterns("/login", "/*.css", "/*.js");
//
//    }
}
