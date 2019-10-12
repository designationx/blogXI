package com.xi.service;

import com.xi.bean.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class IndexService {
    @Autowired
    RestTemplate restTemplate;

//    @Cacheable(value = "synopsis")
    public List<Article> getListForTag(String tag){
          System.out.println("查询了数据库");
        String url = "http://BLOG-DATA/receptionController/getListForTag?tag="+tag;
        return restTemplate.postForObject(url,new ArrayList<Article>(),ArrayList.class);
    }

    public List<Article> getSearch(String content){
        return restTemplate.postForObject("http://BLOG-DATA/receptionController/getSearch",new ArrayList<Article>(),ArrayList.class);
    }
}
