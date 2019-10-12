package com.xi.bean;

public class Remark {
    private int id;
    private int commentid;
    private String name;
    private int floor;
    private String time;
    private String content;
    private int praise;
    private int oppose;
    private String target;

    public Remark() {
    }

    public Remark(int id, int commentid, String name, int floor, String time, String content, int praise, int oppose, String target) {
        this.id = id;
        this.commentid = commentid;
        this.name = name;
        this.floor = floor;
        this.time = time;
        this.content = content;
        this.praise = praise;
        this.oppose = oppose;
        this.target = target;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCommentid() {
        return commentid;
    }

    public void setCommentid(int commentid) {
        this.commentid = commentid;
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

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
}
