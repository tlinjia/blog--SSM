package com.lin.blog.service;

import com.lin.blog.entity.Article;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.List;
import java.util.HashSet;

/**
 * Created by lin on 2016/11/3.
 */
public interface UtilsService {
    /**
     * 推荐文章共limit篇
     * @param limit
     * @return
     */
    HashSet<Article> recommendArticle(int limit);

    /**
     * 获得最新的文章
     * @param limit
     * @return
     */
    List<Article> getNewestArticle(int limit);

}
