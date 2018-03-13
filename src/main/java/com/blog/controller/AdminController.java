package com.blog.controller;

import com.blog.domain.Post;
import com.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class AdminController {

    @Autowired
    private PostService postService;





    @RequestMapping("/admin/posts")
    public String listPosts(Model model) {
        model.addAttribute("posts", postService.listPosts());
        return "admin/postslist";
    }

    @RequestMapping("/admin/post/{id}")
    public String viewPost(@PathVariable Long id, Model model) {
        model.addAttribute("post", postService.getPostById(id));
        return "admin/post" ;
    }

    @RequestMapping("/admin/create")
    public String newPost(Model model) {
        model.addAttribute("formPost", new Post());
        return "admin/postForm";
    }

    @RequestMapping(value = "/admin/save", method = RequestMethod.POST)
    public String postSave(Post post, BindingResult bindingResult, Model model) {
        Post savePost = postService.savePost(post);
        return "redirect:/admin/posts";
    }



    @RequestMapping("/admin/post/edit/{id}")
    public String edit(@PathVariable Long id,   Model model) {
        model.addAttribute("formPost", postService.getPostById(id));
        return "admin/postForm" ;

    }



    @RequestMapping("/admin/post/delete/{id}")
    public String delete(@PathVariable Long id) {
        postService.deletePost(id);
        return "redirect:/admin/posts";
    }




}
