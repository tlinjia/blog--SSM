package com.lin.blog.dao;

import com.lin.blog.entity.Article;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.HashSet;

/**
 * Created by lin on 2016/11/3.
 */
public interface UtilsDao {
    /**
     * 推荐文章共limit篇
     * @param limit
     * @return
     */
    HashSet<Article> recommendArticle(@Param("limit") int limit);

    /**
     * 获得最新的文章
     * @param limit
     * @return
     */
    List<Article> getNewestArticle(@Param("limit") int limit);
}
