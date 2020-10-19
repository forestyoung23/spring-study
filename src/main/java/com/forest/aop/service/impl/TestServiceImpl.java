package com.forest.aop.service.impl;

import com.forest.aop.service.TestService;

/**
 * @author Forest
 * @date 2020年10月19日 15:16
 */
public class TestServiceImpl implements TestService {
    @Override
    public void execute(String name) {
        System.err.println(name);
    }
}
