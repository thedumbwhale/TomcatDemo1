package com.wj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//页面跳转
@RequestMapping
public class CommonController {
    /*首页*/
    @RequestMapping("/index")
    public String index() {
        return "/index";
    }

    /*跳转测试1*/
    @RequestMapping("/demo1")
    public String demo1() {
        return "/demo1";
    }

    /*跳转测试2*/
    @RequestMapping("/demo2")
    public String demo2() {
        return "/demo2";
    }

}
