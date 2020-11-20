package com.kuang.mapper;

import com.kuang.domain.User;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/20 10:07
 */
public interface UserMapper {
    List<User> listUsers();

    int addUser(User user);
    int deleteUser(int id);
}
