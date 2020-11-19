package com.kuang.pojo.demo3;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 17:51
 */
public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东要出租房子了");
    }
}
