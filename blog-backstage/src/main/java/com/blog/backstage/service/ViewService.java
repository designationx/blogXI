package com.blog.backstage.service;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@Service
public interface ViewService {
    //返回页面总入口
    public String ViewReturnHQ(String viewname);

    //根据页面不同，分配不同的数据处理方法
    public String ViewDistribute(String str,String viewname);

    //返回文章发布页面
    public String ViewArticleIssue(String str);

    //返回文章列表页面
    public String ViewArticleList(String str);
}
