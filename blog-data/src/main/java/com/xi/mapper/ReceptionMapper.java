package com.xi.mapper;

import com.xi.bean.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReceptionMapper {
    @Select("SELECT * FROM article where tag like #{tag}")
    public List<Article> getListForTag(String tag);

    @Select("SELECT * FROM article")
    public List<Article> getAllBlogSynopsis();

    @Select("select * from article order by look desc limit 10 ")
    public List<Article> getArticleByLook();

    @Select("SELECT * FROM article where title like #{content} or content like #{content} or text like #{content} or title like #{content} or author like #{content} ")
    public List<Article> getListForSerach(String content);

    @Select("SELECT * FROM article where id = #{id}" )
    public Article getArticleById(int id);
}
