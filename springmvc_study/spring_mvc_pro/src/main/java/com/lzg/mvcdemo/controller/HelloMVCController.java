package com.lzg.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMVCController {

    @RequestMapping("/home")
    public String homeMvc() {
        return "home";
    }
}
