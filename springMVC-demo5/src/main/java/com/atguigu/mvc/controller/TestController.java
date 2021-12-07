package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 @author：ZhouYao
 @create：2021-12-07 15:08
 */

@Controller
public class TestController {
    /*
    拦截器和过滤器 ---> 它们都可以拦截请求
    区别与联系：
    过滤器是作用在请求与前端控制器DispatcherServlet中间的，然后DispatcherServlet接收到请求之后会对请求进行处理，
    然后对请求映射RequestMapping进行匹配，然后找到相对应的请求映射，那请求映射相对应的控制器方法就是我们处理请求的方法，
    RequestMapping会去调用Controller，拦截器就是执行在控制器执行的前后
     */

    @RequestMapping("/**/testInterceptor")
    public String testInterceptor() {
        return "success";
    }


}
