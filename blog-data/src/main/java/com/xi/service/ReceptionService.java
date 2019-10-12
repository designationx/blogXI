package com.xi.service;

import com.xi.bean.Article;
import com.xi.mapper.ReceptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ReceptionService {
    @Autowired
    ReceptionMapper receptionMapper;
    public List<Article> getListForTag(String tag){
        if(tag.equals("null") || tag.equals("undefined")) {
            return receptionMapper.getAllBlogSynopsis();
        }else {
            return receptionMapper.getListForTag("%" + tag + "%");
        }
    }

    public List<Article> getArticleByLook(){
       return  receptionMapper.getArticleByLook();
    }

    public List<Article> getSearch(String content){
        return  receptionMapper.getListForSerach(content);
    }

    public Article getArticleById(int id){
        return   receptionMapper.getArticleById(id);
    }

}
