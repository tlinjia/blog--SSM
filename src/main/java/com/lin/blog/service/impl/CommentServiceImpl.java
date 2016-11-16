package com.lin.blog.service.impl;

import com.lin.blog.dao.CommentDao;
import com.lin.blog.entity.Comment;
import com.lin.blog.service.CommentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lin on 2016/11/3.
 */
@Service
public class CommentServiceImpl implements CommentService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    CommentDao commentDao;

    public boolean addComment(int articleId, String user, String content) {
        int result = commentDao.addComment(articleId, user, content);
        return result <= 0 ? false : true;
    }

    public List<Comment> queryAll(int articleId, int page) {
        List<Comment> list;
        if (page == 0) {
            list = commentDao.queryAll(articleId, 0, Integer.MAX_VALUE);
        }
        list = commentDao.queryAll(articleId, (page - 1) * 8, 8);
        return list;
    }

    public boolean deleteComment(int commentId) {
        int result = commentDao.deleteComment(commentId);
        return result <= 0 ? false : true;
    }
}
