package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author niu
 * @create 2020-05-17-21:11
 */
/**
 * 表示controller 处理请求
 */
@Controller
public class HelloController {

    /**
     * RequestMapping接收来自浏览器的“hello”请求
     * ResponseBody用来给浏览器返回的值得注解
     * @return
     */
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
