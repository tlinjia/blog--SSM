package com.lin.blog.entity;

import java.util.Date;

/**
 * Created by lin on 2016/11/2.
 */
public class Comment {
    private int commentId;
    private int fkArticleId;
    private String commentUser;
    private String commentContent;
    private Date commentDateline;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", articleId=" + fkArticleId +
                ", commentUser='" + commentUser + '\'' +
                ", commentContent='" + commentContent + '\'' +
                ", commentDateline=" + commentDateline +
                '}';
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getFkArticleId() {
        return fkArticleId;
    }

    public void setFkArticleId(int fkArticleId) {
        this.fkArticleId = fkArticleId;
    }

    public String getCommentUser() {
        return commentUser;
    }

    public void setCommentUser(String commentUser) {
        this.commentUser = commentUser;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Date getCommentDateline() {
        return commentDateline;
    }

    public void setCommentDateline(Date commentDateline) {
        this.commentDateline = commentDateline;
    }
}
