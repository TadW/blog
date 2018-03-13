package com.blog.repository;

import com.blog.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;


@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
