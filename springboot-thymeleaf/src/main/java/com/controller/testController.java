package com.controller;

import com.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping(value = "/test")
public class testController {
    /**
     * Thymeleaf基本案例
     * */
    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message","hello thymeleaf!");

        //创建一个List<User>,并将List<User>存入Model中，到页面使用Thymeleaf标签显示
        List<User> list = new ArrayList<>();
        list.add(new User(1,"克雷","重庆"));
        list.add(new User(2,"德斯","上海"));
        list.add(new User(3,"川木","北京"));
        model.addAttribute("list",list);

        //Map定义
        Map<String,Object> dataMap = new HashMap<>();
        dataMap.put("No","123");
        dataMap.put("address","重庆");
        model.addAttribute("dataMap",dataMap);

        //日期输出
        model.addAttribute("now",new Date());
        //if条件
        model.addAttribute("age",24);
        return "demo1";
    }
}
