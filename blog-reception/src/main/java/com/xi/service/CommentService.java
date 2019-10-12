package com.xi.service;

import com.xi.bean.Article;
import com.xi.bean.Comment;
import com.xi.bean.ReMsg;
import com.xi.bean.Remark;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class CommentService {
//    @Autowired
//    CommentMap commentMap;
//    @Autowired
//    ArticleMapper articleMapper;
//    @Autowired
//    RemarkMapper remarkMapper;
//    @Autowired
//    RedisTemplate redisTemplate;

    public Map<String,Object> getCommentsAndRemarks(int id){
        Map<String,Object> map = new HashMap<>();
//        List<Integer> list = commentMap.getId(id);
//        List<List<Remark>> remarkList = new ArrayList<>() ;
//        List<Remark> remarks;
//        List<Comment> comments = commentMap.getConments(id);
//        map.put("comments",comments);
//        for(int l : list){
//            remarks = remarkMapper.getRemarks(l);
//            if(remarks.size()>0)
//                 remarkList.add(remarks);
//        }
//        map.put("remark",remarkList);
        return map;
    };

    public ReMsg addComment(String val,Integer id,String name){
//        ValueOperations valueOperations = redisTemplate.opsForValue();
//        if(!redisTemplate.hasKey("articleFloor"+id)){
//            valueOperations.set("articleFloor"+id,commentMap.floorMax(id)==null?0:commentMap.floorMax(id));
//        }
//        if(!redisTemplate.hasKey("articleComment"+id)){
//            valueOperations.set("articleComment"+id,articleMapper.getComment(id));
//        }
//        int comment = (int)valueOperations.get("articleComment"+id);
//        comment++;
//        Article article = new Article();
//        article.setId(id);
//        article.setComment(comment);
//        articleMapper.updateComment(article);
//        int floor = (int)valueOperations.get("articleFloor"+id);
//        floor ++;
//        valueOperations.set("articleFloor"+id,floor);
//        Comment c = new Comment();
//        ReMsg reMsg = new ReMsg();
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        c.setTime(df.format(new Date()));
//        c.setArticleid(id);
//        c.setContent(val);
//        c.setName(name);
//        c.setFloor(floor);
//        int a = commentMap.addComment(c);
//        if(a>0){
//            reMsg.setCode(200);
//            reMsg.setMsg("评论成功");
//        }else{
//            reMsg.setCode(500);
//            reMsg.setMsg("评论失败");
//            reMsg.setData("内部错误，请稍后再试");
//        }
//        return reMsg;
        return null;
    }
}
