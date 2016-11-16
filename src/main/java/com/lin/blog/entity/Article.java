package com.lin.blog.entity;

import java.util.Date;

/**
 * Created by lin on 2016/11/2.
 */
public class Article {
    private int articleId;
    private String articleTitle;
    private String articleContent;
    private Date articleDateline;
    private Date articleModifyTime;
    private short articleState;

    @Override
    public String toString() {
        return "Article{" +
                "articleId=" + articleId +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleContent='" + articleContent + '\'' +
                ", articleDateline=" + articleDateline +
                ", articleModifyTime=" + articleModifyTime +
                ", articleState=" + articleState +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if(this.getClass() != obj.getClass()){
            System.out.println("obj:"+obj.getClass());return false;}
        Article obj2 = (Article)obj;
        return this.articleContent.equals(obj2.getArticleContent()) && this.articleDateline.equals(obj2.getArticleDateline())
                && this.articleId == obj2.getArticleId() && this.articleModifyTime.equals(obj2.getArticleModifyTime())
                && this.articleState == obj2.getArticleState() && this.articleTitle.equals(obj2.getArticleTitle())?true:false;
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(articleId).hashCode();
    }

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    public Date getArticleDateline() {
        return articleDateline;
    }

    public void setArticleDateline(Date articleDateline) {
        this.articleDateline = articleDateline;
    }

    public Date getArticleModifyTime() {
        return articleModifyTime;
    }

    public void setArticleModifyTime(Date articleModifyTime) {
        this.articleModifyTime = articleModifyTime;
    }

    public short getArticleState() {
        return articleState;
    }

    public void setArticleState(short articleState) {
        this.articleState = articleState;
    }
}
