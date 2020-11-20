package com.kuang.mapper;

import com.kuang.domain.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/20 11:34
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    @Override
    public List<User> listUsers() {
        return getSqlSession().getMapper(UserMapper.class).listUsers();
    }

    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }
}
