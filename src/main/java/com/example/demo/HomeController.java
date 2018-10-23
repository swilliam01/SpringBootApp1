package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String homePage (Model model){
        model.addAttribute("var1","Hello Guys");
        model.addAttribute("var2","Java is Cool");
        return "index";
    }

}
