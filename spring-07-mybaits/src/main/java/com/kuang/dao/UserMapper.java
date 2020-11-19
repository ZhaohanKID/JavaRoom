package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/19 20:30
 */
public interface UserMapper {
    User findUserById(int id);
    List<User> findAllUsers();
}
