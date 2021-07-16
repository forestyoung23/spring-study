package com.forest.aop.staticproxy;

import com.forest.aop.service.TestService;

/**
 * 静态代理
 *
 * @author Forest
 * @date 2020年10月19日 15:20
 */
public class StaticProxy implements TestService {
    private TestService testService;

    StaticProxy(TestService service) {
        testService = service;
    }

    @Override
    public void execute(String name) {
        System.err.println("before");
        testService.execute("123");
        System.err.println("after");
    }
}
