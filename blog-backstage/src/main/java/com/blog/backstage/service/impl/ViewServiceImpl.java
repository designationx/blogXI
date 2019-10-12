package com.blog.backstage.service.impl;

import com.blog.backstage.service.ViewService;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ViewServiceImpl implements ViewService{



    @Override
    public String ViewReturnHQ(String viewname) {
        String path ="static/view/"+viewname+".txt";
        StringBuffer stringBuffer = new StringBuffer();
        Resource resource = new ClassPathResource(path);
        try {
            File file = resource.getFile();
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String line = null;
            while ((line = br.readLine()) != null) {
                stringBuffer.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ViewDistribute(stringBuffer.toString(),viewname);
    }

    @Override
    public String ViewDistribute(String str,String viewname) {
        String returnString = "";
        switch (viewname){
            case "articleissue":
                returnString = ViewArticleIssue(str);
                break;
            case "articlelist":
                returnString = ViewArticleList(str);
                break;
            default:
                break;
        }
        return  returnString;
    }

    @Override
    public String ViewArticleIssue(String str) {
        return str;
    }

    @Override
    public String ViewArticleList(String str) {
        StringBuffer stringBuffer = new StringBuffer();

        return null;
    }
}
