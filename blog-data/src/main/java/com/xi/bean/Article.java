package com.xi.bean;

import java.io.Serializable;
import java.util.List;

public class Article implements Serializable{
    private int id;
    private String title;
    private String author;
    private String tag;
    private String text;
    private int look;
    private int praise;
    private int comment;
    private List<String> content;
    private String createtime;

    public Article() {
    }

    public Article(int id, String title, String author, String tag, String text, int look, int praise, int comment, List<String> content, String createtime) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.tag = tag;
        this.text = text;
        this.look = look;
        this.praise = praise;
        this.comment = comment;
        this.content = content;
        this.createtime = createtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getLook() {
        return look;
    }

    public void setLook(int look) {
        this.look = look;
    }

    public int getPraise() {
        return praise;
    }

    public void setPraise(int praise) {
        this.praise = praise;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }
}
