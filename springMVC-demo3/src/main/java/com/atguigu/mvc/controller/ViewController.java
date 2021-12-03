package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 @author：ZhouYao
 @create：2021-12-03 11:56
 */

@Controller
public class ViewController {


    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:testThymeleafView";
    }

    // 弹幕：转发是在一次请求内进行页面跳转，地址栏不变
    //      重定向是发出一次新的请求，地址栏改变



}
