package com.xi.controller;

import com.xi.bean.ReMsg;
import com.xi.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;
    @PostMapping("/comment_add")
    public ReMsg addComment(String val,int id,String name){
        return commentService.addComment(val,id,name);
    }

}
