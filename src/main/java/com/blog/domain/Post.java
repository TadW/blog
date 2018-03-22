package com.blog.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "post_id")
    private Long id;


    @Column(name = "author")
    private String author;


    @Column(name = "title")
    private String title;


    @Column(name = "body",  length = 1000)
    private String body;


    @Column(name = "posted_on")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postedON;



    public Post(String author, String title, String body, Date postedON) {
        this.author = author;
        this.title = title;
        this.body = body;
        this.postedON = postedON;
    }

    public Post() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Date getPostedON() {
        return postedON;
    }

    public void setPostedON(Date postedON) {
        this.postedON = postedON;
    }


    @Override
    public String toString() {
        return "Post{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", postedON=" + postedON +
                '}';
    }


}
