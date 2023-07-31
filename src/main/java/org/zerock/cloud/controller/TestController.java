package org.zerock.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


    @GetMapping("/index")
    public String index(Model model){
        model.addAttribute("data","hello");
        return "index";
    }
}
