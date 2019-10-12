package com.xi.controller;

import com.xi.bean.Article;
import com.xi.service.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReceptionController {
    @Autowired
    ReceptionService receptionService;
    /**
     * 根据标签返回文章列表，用于首页展示列表
     * @param tag
     * @return
     */
    @PostMapping("/receptionController/getListForTag")
    public List<Article> getListForTag(String tag){
        return  receptionService.getListForTag(tag);
    }

    /**
     * 得到浏览量前十的文章
     * @return 文章列表
     */
    @PostMapping("/receptionController/getArticleByLook")
    public List<Article> getArticleByLook(){
        return receptionService.getArticleByLook();
    }

    /**
     * 根据内容值搜索文章
     * @return 文章列表
     */
    @PostMapping("/receptionController/getSearch")
    public List<Article> getSearch(String content){
        return receptionService.getSearch(content);
    }

    /**
     * 根据内容值搜索文章
     * @return 文章列表
     */
    @PostMapping("/receptionController/getArticleById")
    public Article getArticleById(int id){
        return receptionService.getArticleById(id);
    }
}
