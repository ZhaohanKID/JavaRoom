package com.kuang.entity;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/17 19:05
 */
public class Hello {
    private String str;

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return this.str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
