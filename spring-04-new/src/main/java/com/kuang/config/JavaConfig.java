package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 16:23
 */
@Configuration
// 既然Configuration也是一个组件，那么其各自注解都可以使用了
@ComponentScan("com.kuang.pojo") // 没写也能用，可以扫描到User
@Import(JavaConfig2.class) // 如果有多个bean
public class JavaConfig {
    @Bean
    public User getUser() {
        return new User();
    }
}
