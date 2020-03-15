package com.example.demo.controller;

import com.example.demo.param.MyParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class home {

    @PostMapping("/test")
    public String testPage(MyParam param, Model model) {
        model.addAttribute("name",param.getName());
        model.addAttribute("age",param.getAge());
        return "apply";
    }

}
