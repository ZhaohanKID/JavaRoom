package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 15:36
 */
@Component
@Scope("singleton")
public class User {
    @Value("一休")
    public String name;

    @Value("Jimmy")
    public void setName(String name) {
        this.name = name;
    }
}
