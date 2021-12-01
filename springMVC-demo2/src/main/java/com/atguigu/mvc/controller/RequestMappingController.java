package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 @author：ZhouYao
 @create：2021-11-30 20:03
 */
@Controller
//@RequestMapping("/hello")
public class RequestMappingController {

    @RequestMapping(
            value = {"/testRequestMapping", "/test"},  // 请求地址
            method = {RequestMethod.GET, RequestMethod.POST}  // 请求方式
    )
    public String success() {
        return "success";
    }

    @GetMapping("/testGetMapping")
    public String testGetMapping() {
        return "success";
    }

    @PostMapping("/testPostMapping")
    public String testPostMapping() {
        return "success";
    }

    @RequestMapping(value = "/testPut", method = RequestMethod.PUT)
    public String testPut() {
        return "success";
    }

    @RequestMapping(
            value = "/testParasAndHeaders",
            params = {"username", "password"})
    public String testParasAndHeaders() {
        return "success";
    }


}
