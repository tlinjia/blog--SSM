package com.lin.blog.service;

import com.lin.blog.entity.Comment;

import java.util.List;

/**
 * Created by lin on 2016/11/3.
 */
public interface CommentService {

    /**
     * 添加评论
     * @param articleId
     * @param user
     * @param content
     * @return
     */
    boolean addComment(int articleId,String user,String content);

    /**
     * 查询文章下所有的评论
     * @param articleId
     * @return
     */
    List<Comment> queryAll(int articleId,int page);

    /**
     * 删除评论
     * @param commentId
     * @return
     */
    boolean deleteComment(int commentId);
}
