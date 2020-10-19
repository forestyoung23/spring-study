package com.forest.interceptor.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Forest
 * @date 2020年09月18日 15:28
 */
@RestController("/test")
public class ErrorCpntroller implements ErrorController {
    @RequestMapping()
    public void error(HttpServletRequest request) {
        System.err.println("你报错了");
    }
    /**
     * The return value from this method is not used; the property `server.error.path`
     * must be set to override the default error page path.
     *
     * @return the error path
     * @deprecated since 2.3.0 in favor of setting the property `server.error.path`
     */
    @Override
    public String getErrorPath() {
        return null;
    }
}
