package com.lin.blog.dao;

import com.lin.blog.entity.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lin on 2016/11/2.
 */
public interface CommentDao {

    /**
     * 添加评论
     * @param articleId
     * @param user
     * @param content
     * @return
     */
    int addComment(@Param("articleId") int articleId,@Param("user") String user,@Param("content") String content);

    /**
     * 查询文章下所有的评论
     * @param articleId
     * @param offset
     * @param limit
     * @return
     */
    List<Comment> queryAll(@Param("articleId") int articleId,@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 删除评论
     * @param commentId
     * @return
     */
    int deleteComment(@Param("commentId") int commentId);
}
