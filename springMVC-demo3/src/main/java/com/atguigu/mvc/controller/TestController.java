package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 @author：ZhouYao
 @create：2021-12-02 19:00
 */

@Controller
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "index";

    }


}
