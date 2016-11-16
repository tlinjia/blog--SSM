package com.lin.blog.service.impl;

import com.lin.blog.dao.UtilsDao;
import com.lin.blog.entity.Article;
import com.lin.blog.service.UtilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.HashSet;

/**
 * Created by lin on 2016/11/3.
 */
@Service
public class UtilsServiceImpl implements UtilsService {

    @Autowired
    UtilsDao utilsDao;

    public HashSet<Article> recommendArticle(int limit) {
        HashSet<Article> set = utilsDao.recommendArticle(limit);
        if(set.size() < limit){
            List<Article> list2 = utilsDao.getNewestArticle( limit - set.size());
            set.addAll(list2);
        }
        return set;
    }

    public List<Article> getNewestArticle(int limit){
        List<Article> list = utilsDao.getNewestArticle(limit);
        return list;
    }


}
