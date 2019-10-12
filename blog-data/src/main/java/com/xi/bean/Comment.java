package com.xi.bean;

public class Comment {
    private int id;
    private int articleid;
    private String  name;
    private int floor;
    private String time;
    private String content;
    private int  praise;
    private int oppose;

    public Comment() {
    }

    public Comment(int id, int articleid, String name, int floor, String time, String content, int praise, int oppose) {

        this.id = id;
        this.articleid = articleid;
        this.name = name;
        this.floor = floor;
        this.time = time;
        this.content = content;
        this.praise = praise;
        this.oppose = oppose;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getArticleid() {
        return articleid;
    }

    public void setArticleid(int articleid) {
        this.articleid = articleid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getPraise() {
        return praise;
    }

    public void setPraise(int praise) {
        this.praise = praise;
    }

    public int getOppose() {
        return oppose;
    }

    public void setOppose(int oppose) {
        this.oppose = oppose;
    }
}
