package com.kuang.pojo.demo2;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 18:03
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("真实对象：增加一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除一个用户");
    }

    @Override
    public void update() {
        System.out.println("修改一个用户的信息");
    }

    @Override
    public void query() {
        System.out.println("查询用户");
    }
}
