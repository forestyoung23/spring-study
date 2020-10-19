package com.forest.aop.dynamicproxy;

import com.forest.aop.service.TestService;
import com.forest.aop.service.impl.TestServiceImpl;

/**
 * @author dongyang
 * @date 2020年10月19日 15:37
 */
public class Test {
    public static void main(String[] args) {
        TestService service = new JdkDynamicProxy(new TestServiceImpl()).getProxy();
        service.execute("123");
    }

}
