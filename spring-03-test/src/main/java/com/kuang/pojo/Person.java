package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;


/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 12:31
 */
public class Person {
    private String name;
//    @Autowired
//    @Qualifier(value = "dog1")

    @Resource(name = "dog1")
    private Dog dog;
//    @Autowired
//    @Qualifier(value = "cat1")
    @Resource(name = "cat1")
    private Cat cat;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dog=" + dog +
                ", cat=" + cat +
                '}';
    }
}
