package com.kuang.mapper;

import com.kuang.domain.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/20 10:07
 */
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> listUsers() {

        addUser(new User(11, "三水", 789));

        deleteUser(3);

        return sqlSession.getMapper(UserMapper.class).listUsers();
    }

    @Override
    public int addUser(User user) {
        return sqlSession.getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(int id) {
        return sqlSession.getMapper(UserMapper.class).deleteUser(id);
    }
}
