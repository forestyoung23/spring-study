package com.forest.interceptor.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Forest
 * @date 2020年09月17日 15:51
 */
@RestController
public class OmgController {
    @PostMapping("/omg")
    public String omg(@PathVariable("name") String name) {
        return name;
    }
}
