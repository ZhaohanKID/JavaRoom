package com.kuang.pojo.demo3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: Z.HAN
 * @Date: 2020/11/18 19:21
 */
// 代理调用处理程序
// 等会我们会用这个类，自动生成代理类
public class ProxyInvocationHandle implements InvocationHandler {

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
