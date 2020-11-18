package com.kuang.entity;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/17 20:06
 */
public class User {
    private String name;
    private  int age;

/*    public User() {
        System.out.println("User的无参构造...");
    }*/

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println("name = " + this.name);
    }
}
