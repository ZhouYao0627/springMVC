package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 @author：ZhouYao
 @create：2021-12-01 20:47
 */

@Controller
public class ParamController {

//    @RequestMapping("/testServletAPI")
    // 形参位置的request表示当前请求
//    public String testServletAPI(HttpServletRequest request) {
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
//        System.out.println("username:" + username + ",password:" + password);
//
//        return "success";
//    }

    @RequestMapping("/testServletAPI")
    public String testServletAPI(@PathVariable("username") String username, @PathVariable("password") Integer password) {
        System.out.println("username:" + username + ",password:" + password);

        return "success";
    }


}
