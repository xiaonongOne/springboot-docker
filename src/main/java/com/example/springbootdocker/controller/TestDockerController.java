package com.example.springbootdocker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xz
 * @CreateDate: 2019/5/26 11:05
 * @Version: 1.0
 */
@RestController
public class TestDockerController {

    @RequestMapping("/")
    public String index() {
        return "Hello,this is my first Docker!";
    }

}
