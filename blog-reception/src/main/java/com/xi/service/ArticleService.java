package com.xi.service;

import com.xi.bean.Article;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ArticleService {
//    @Autowired
//    private ArticleMapper articleMapper;
//
//    @Autowired
//     RedisTemplate redisTemplate;
    @Autowired
    RestTemplate restTemplate;
    /**
     * 根据id得到文章
     * @param id
     * @return 文章
     */
    public Article getArticleById(int id) {
        Article article=  restTemplate.postForObject("http://BLOG-DATA/receptionController/getArticleById?id="+id,new Article(),Article.class);
        if (article==null)
            return null;
        article.setContent(getArticleContent(id));
        return article;
    }

    /**
     * 得到浏览量前十的文章
     * @return 文章列表
     */
    public List<Article> getArticleByLook(){
//        return articleMapper.getArticleByLook();
        return  restTemplate.postForObject("http://BLOG-DATA/receptionController/getArticleByLook",new ArrayList<Article>(),ArrayList.class);

    }

    /**
     * 根据文章存放路劲，得到文章具体内容
     * @return
     */
    private List<String> getArticleContent(int id){
        List<String> list = new ArrayList<>();
        try(
                BufferedReader br = new BufferedReader
                        (new InputStreamReader
                                (new FileInputStream
                                        (new File("H:/java/"+id+".txt")),"UTF-8"))
        ){
            //按行读取
            String line = null;
            while ((line = br.readLine()) != null){
                list.add(line);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    /**
     * 发布文章
     * @return  成功/失败
     */
    public boolean seleaseArticle(String val,String title,String author,String tag,String text){
//        Integer id =articleMapper.getMaxId()+1;
//        Article article = new Article();
//        article.setTag(tag);
//        article.setText(text);
//        article.setAuthor(author);
//        article.setTitle(title);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        article.setCreatetime(df.format(new Date()));
//
//        String fileName = "/usr/local/blog-article/"+id+".txt";
//        FileWriter fwriter = null;
//        try {
//            fwriter = new FileWriter(fileName);
//            fwriter.write(val);
//            if(articleMapper.setArticle(article)==0)
//                return false;
//
//
//            return true;
//        } catch (IOException ex) {
//            ex.printStackTrace();
//        } finally {
//            try {
//                fwriter.flush();
//                fwriter.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//
//        return false;
        return true;
    }
}
