package com.lin.blog.dao;

import com.lin.blog.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by lin on 2016/11/2.
 */
public interface ArticleDao {

    /**
     * 添加文章,暂不发布
     * @param title
     * @param content
     * @return
     */
    int addArticle(@Param("title") String title,@Param("content") String content);


    int addAndShowArticle(@Param("title") String title,@Param("content") String content);

    /**
     * 发布文章
     * @param articleId
     * @return
     */
    int publishArticle(int articleId);

    /**
     * 撤回文章
     * @param articleId
     * @return
     */
    int recallArticle(int articleId);

    /**
     * 修改文章
     * @param articleId
     * @param title
     * @param content
     * @param modifyTime
     * @return
     */
    int modifyArticle(@Param("articleId") int articleId,@Param("title") String title,@Param("content") String content,@Param("nowTime") Date modifyTime);

    /**
     * 删除文章
     * @param artcileId
     * @return
     */
    int deleteArticle(int artcileId);

    /**
     * 根据ID查找文章
     * @param articleId
     * @return
     */
    Article queryById(int articleId);


    /**
     * 根据偏移量查询文章列表--后台
     * @param offset
     * @param limit
     * @return
     */
    List<Article> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
