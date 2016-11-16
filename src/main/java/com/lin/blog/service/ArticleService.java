package com.lin.blog.service;

import com.lin.blog.entity.Article;

import java.util.Date;
import java.util.List;

/**
 * Created by lin on 2016/11/3.
 */
public interface ArticleService {
    /**
     * 查询所有文章
     * @return
     */
    List<Article> getArticleList(int page);

    /**
     * 展示文章(state:1)
     * @param page
     * @return
     */
    List<Article> showArticleList(int page);

    /**
     * 查询单个文章
     * @return
     */
    Article getArticleById(int articleId);

    /**
     * 删除文章
     * @param articleId
     * @return
     */
    boolean deleteArticle(int articleId);

    /**
     * 修改文章
     * @param articleId
     * @param title
     * @param content
     * @param modifyTime
     * @return
     */
    boolean modifyArticle(int articleId, String title, String content, Date modifyTime);

    /**
     * 改变状态 ，发布-->撤回 or 撤回-->发布
     * @param articleId
     * @return
     */
    boolean changeState(int articleId);

    /**
     * 添加文章
     * @param title
     * @param content
     * @return
     */
    boolean addArticle(String title,String content,boolean publish);
}
