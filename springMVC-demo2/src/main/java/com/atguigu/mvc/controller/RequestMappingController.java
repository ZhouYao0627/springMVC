package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    //  @RequestMapping("/a?a/testAnt")
    //  @RequestMapping("/a*a/testAnt")
    @RequestMapping("/**/testAnt")
    public String testAnt() {
        return "success";
    }

    // 弹幕：占位符告诉程序url对应位置的东西是一个参数，注释形参告诉程序这个参数对应哪个形参
    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id") Integer id, @PathVariable("username") String username) {
        System.out.println("id:" + id + " username:" + username);
        return "success";
    }


}
