package com.xi.controller;

import com.xi.bean.Article;
import com.xi.bean.ReMsg;
import com.xi.service.ArticleService;
import com.xi.service.CommentService;
import com.xi.service.RemarkService;
import com.xi.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 跳转文章页面
 * 返回文章相应数据
 */
@Controller()
public class ArticleController {
    @Autowired
    private ArticleService articleService;
    @Autowired
    private CommentService commentService;
    @Autowired
    private RemarkService remarkService;

    @GetMapping("/p/{id}")
    public String  article(@PathVariable("id") int id, Model model){
        if(articleService.getArticleById(id)!=null){
            model.addAttribute("article", articleService.getArticleById(id));
//            model.addAttribute("comment",commentService.getCommentsAndRemarks(id).get("comments"));
//           model.addAttribute("remark",commentService.getCommentsAndRemarks(id).get("remark"));
            model.addAttribute("hot",articleService.getArticleByLook());
            return "demo01";
        }else {
            model.addAttribute("code","404");
            model.addAttribute("msg","没有此页面");
            model.addAttribute("data","请核对网址信息");
            return "err";
        }

    }


    @GetMapping("/{authro}/p/{id}")
    @ResponseBody
    public ReMsg s(@PathVariable("authro") StringBuilder authro, @PathVariable("id") int id){
        ReMsg reMsg = new ReMsg();
        if(articleService.getArticleById(id) != null){
            reMsg.setCode(200);
            reMsg.setMsg("查询成功");
            reMsg.setData(articleService.getArticleById(id));
        }else {
            reMsg.setCode(404);
            reMsg.setMsg("查询失败");
            reMsg.setData("该文章不存在，请检查作者名称与文章ID");
        }
        return reMsg;
    }



    @GetMapping("release")
    public String release(){
        return "article/release";
    }

    @PostMapping("article_release")
    @ResponseBody
    public String articleRelease(String val,String title,String author,String tag,String text){
        if (articleService.seleaseArticle(val,title,author,tag,text))
            return "发表成功";
        return "发表失败";
    }
}
