package com.kuang.service;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/19 13:28
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更新一个用户的信息");
    }

    @Override
    public void query() {
        System.out.println("查询用户信息");
    }
}
