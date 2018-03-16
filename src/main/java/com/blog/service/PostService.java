package com.blog.service;

import com.blog.domain.Post;
import com.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;

@Service
@Transactional
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> listPosts() {
        return postRepository.findAll();
    }

    public  Post savePost(Post post) {
       return  postRepository.save(post);
    }

    public void deletePost(Long id) {
        postRepository.delete(id);
    }


    public Post getPostById(Long id){
        return postRepository.findOne(id);
    }


}







