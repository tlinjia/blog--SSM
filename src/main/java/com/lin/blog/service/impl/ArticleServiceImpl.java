package com.lin.blog.service.impl;

import com.lin.blog.dao.ArticleDao;
import com.lin.blog.entity.Article;
import com.lin.blog.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lin on 2016/11/3.
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ArticleDao articleDao;

    public List<Article> getArticleList(int page) {
        List<Article> list = articleDao.queryAll(8 * (page - 1), 8);
        return list;
    }

    public List<Article> showArticleList(int page){
        List<Article> list = articleDao.queryAll(8 * (page - 1), 8);
        Iterator<Article> iterator = list.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getArticleState() == 0){
                iterator.remove();
            }
        }
        return list;
    }

    public Article getArticleById(int articleId) {
        Article article = articleDao.queryById(articleId);
        return article;
    }

    public boolean deleteArticle(int articleId) {
        int result = articleDao.deleteArticle(articleId);
        return result <= 0 ? false : true;
    }

    public boolean modifyArticle(int articleId, String title, String content, Date modifyTime) {
        int result = articleDao.modifyArticle(articleId, title, content, new Date());
        return result <= 0 ? false : true;
    }

    public boolean changeState(int articleId) {
        int result;
        int nowState = articleDao.queryById(articleId).getArticleState();
        if (nowState == 0)
            result = articleDao.publishArticle(articleId);
        else
            result = articleDao.recallArticle(articleId);
        return result <= 0 ? false : true;
    }

    public boolean addArticle(String title, String content,boolean publish) {
        int result;
        if(!publish) {
            result = articleDao.addArticle(title, content);
        }else{
            result = articleDao.addAndShowArticle(title,content);
        }
        return result <= 0 ? false : true;
    }
}
