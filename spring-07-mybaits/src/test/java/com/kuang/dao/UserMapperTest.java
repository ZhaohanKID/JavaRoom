package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/19 20:40
 */
public class UserMapperTest {
    @Test
    public void t1() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);

        sqlSession.close();
    }
    @Test
    public void t2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        User user = userMapper.findUserById(1);
        System.out.println(user);
    }

    @Test
    public void t3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        List<User> users = userMapper.findAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
    @Test
    public void t4() {

    }
}
