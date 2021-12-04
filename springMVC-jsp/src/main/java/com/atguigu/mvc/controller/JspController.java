package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 @author：ZhouYao
 @create：2021-12-04 12:46
 */

@Controller
public class JspController {

    @RequestMapping("/success")
    public String success() {
        return "success";
    }


}
