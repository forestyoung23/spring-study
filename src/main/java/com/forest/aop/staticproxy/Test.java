package com.forest.aop.staticproxy;

import com.forest.aop.service.impl.TestServiceImpl;

/**
 * @author Forest
 * @date 2020年10月19日 15:27
 */
public class Test {
    public static void main(String[] args) {
        TestServiceImpl service = new TestServiceImpl();
        StaticProxy proxy = new StaticProxy(service);
        proxy.execute("123");
    }
}
