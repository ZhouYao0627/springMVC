package com.atguigu.mvc.controller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 @author：ZhouYao
 @create：2021-11-29 13:08
 */

@Controller
public class HelloController {

    // "/" --> /WEB-INF/templates/index.xml

    @RequestMapping("/")
    public String index() {
        // 返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }



}
