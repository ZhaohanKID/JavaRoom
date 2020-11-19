package com.kuang.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/19 13:32
 */
public class BeforeLog implements MethodBeforeAdvice {
    // 前置通知
    // method 要执行的目标对象的方法
    // args 参数
    // target 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");
    }
}
