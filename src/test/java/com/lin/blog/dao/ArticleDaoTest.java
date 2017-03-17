package com.lin.blog.dao;

import com.lin.blog.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合,以便junit启动时加载springIOC容器
 * Created by lin on 2016/11/2.
 */
@RunWith(SpringJUnit4ClassRunner.class) //加载容器
@ContextConfiguration({"classpath:spring/spring-dao.xml"}) //加载配置文件
public class ArticleDaoTest {
    //注入Dao实现类依赖
    @Resource
    private ArticleDao articleDao ;
    @Resource
    private UtilsDao utilsDao;

    @Test
    public void addArticle() throws Exception {
        String title = "unit test";
        String content = "unit test";
        int result = articleDao.addArticle(title,content);
        System.out.println(result);
    }

    @Test
    public void publishArticle() throws Exception {
        int result = articleDao.publishArticle(1);
        System.out.println(result);
    }

    @Test
    public void modifyArticle() throws Exception {
       int result = articleDao.modifyArticle(4,"unit test modify","nit test modify",new Date());
        System.out.println(result);
    }

    @Test
    public void deleteArticle() throws Exception {
        int result = articleDao.deleteArticle(4);
        System.out.println(result);
    }

    @Test
    public void queryById() throws Exception {
        Article article = articleDao.queryById(1);
        System.out.println(article);
    }

    @Test
    public void queryAll() throws Exception {
        List<Article> list = articleDao.queryAll(0,10);
        for(Article article:list){
            System.out.println(article);
        }

    }


}