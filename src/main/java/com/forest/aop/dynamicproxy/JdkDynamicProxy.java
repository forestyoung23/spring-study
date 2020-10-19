package com.forest.aop.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk动态代理
 *
 * @author dongyang
 * @date 2020年10月19日 15:34
 */
public class JdkDynamicProxy implements InvocationHandler {
    private Object target;

    JdkDynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("before");
        Object invoke = method.invoke(target, args);
        System.err.println("after");
        return invoke;
    }

    public <T> T getProxy() {
        return (T)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }
}
