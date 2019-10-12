package com.xi.controller;

import com.xi.bean.Article;
import com.xi.service.ArticleService;
import com.xi.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class IndexController {
    @Autowired
    IndexService indexService;
    @Autowired
    ArticleService articleService;
    @GetMapping(value = {"/index","/"})
    public String getIndex(String tag,Model model){
       List<Article> articles=  indexService.getListForTag(tag);
       model.addAttribute("articles",articles);
       model.addAttribute("hot",articleService.getArticleByLook());
       return "index";
    }


    @GetMapping(value = {"/search"})
    public String getSearch(String content,Model model){
        List<Article> articles=  indexService.getSearch(content);
        model.addAttribute("articles",articles);
        model.addAttribute("hot",articleService.getArticleByLook());
        return "index";
    }
}
