package com.kuang.dao;

import com.kuang.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/19 21:54
 */
public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public User findUserById(int id) {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.findUserById(id);
    }

    @Override
    public List<User> findAllUsers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.findAllUsers();
    }
}
