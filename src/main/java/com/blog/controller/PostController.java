package com.blog.controller;

import com.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {

    @Autowired
    private PostService postService;



    @RequestMapping("/posts")
    public String listPosts(Model model){
        model.addAttribute("posts", postService.listPosts());
        return "posts";
    }





}
