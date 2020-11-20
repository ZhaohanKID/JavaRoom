package com.kuang.mapper;

import com.kuang.domain.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/20 10:21
 */
public class MyTest {
    @Test
    public void e1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper mapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = mapper.listUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
