package com.kuang.pojo.demo1;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 17:51
 */
public class Proxy implements Rent {

    private Host host;
    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        host.rent();
        seeHouse();
    }

    // 附属操作
    public void seeHouse() {
        System.out.println("中介带你去看房子");
    }
}
