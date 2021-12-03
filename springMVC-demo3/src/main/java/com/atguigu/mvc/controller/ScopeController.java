package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 @author：ZhouYao
 @create：2021-12-02 19:53
 */

@Controller
public class ScopeController {

    // 使用ServletAPI向request域对象共享数据
    @RequestMapping("/testRequestByServletApI")
    public String testRequestByServletApI(HttpServletRequest request) {
        request.setAttribute("testRequestScope", "hello,servletAPI");

        return "success";
    }


    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView mav = new ModelAndView();

        // 处理模型数据，即向请求域request共享数据
        mav.addObject("testRequestScope", "hello,ModelAndView");
        // 设置视图名称
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/testModel")
    public String testModel(Model model) {
        model.addAttribute("testRequestScope", "hello,testModel");
        return "success";
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String, Object> map) {
        map.put("testRequestScope", "hello,map");
        return "success";
    }

    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap) {
        modelMap.addAttribute("testRequestScope", "hello,ModelMap");
        return "success";
    }


    @RequestMapping("/testSession")
    public String testSession(HttpSession session) {
        session.setAttribute("testSessionScope", "hello,session");
        return "success";
    }

    @RequestMapping("/testApplication")
    public String testApplication(HttpSession session) {
        ServletContext application = session.getServletContext();
        application.setAttribute("testApplicationScope", "hello,application");
        return "success";
    }


}









