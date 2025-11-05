package com.blog.crud.core.domain;


import java.time.LocalDateTime;

public class Post {

    private Long id;
    private String title;
    private String content;
    private String author;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

    public Post(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
        this.createAt = LocalDateTime.now();
        this.updateAt = LocalDateTime.now();
    }

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
