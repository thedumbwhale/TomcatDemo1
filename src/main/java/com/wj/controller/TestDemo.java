package com.wj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//在页面输出该字符串
public class TestDemo {
    @RequestMapping("/hello")
    public String getString() {
        return "Nice to meet to!";
    }
}
