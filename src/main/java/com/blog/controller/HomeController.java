package com.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value="/")
    public String home(){

        return "redirect:/posts";
    }

    @RequestMapping(value="/about")
    public String about(){
        return "about";
    }

    @RequestMapping(value="/contact")
    public String contact(){
        return "contact";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(){
        return "/login";
    }


}


