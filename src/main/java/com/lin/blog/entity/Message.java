package com.lin.blog.entity;

import java.util.Date;

/**
 * Created by lin on 2016/11/2.
 */
public class Message {
    private int messageId;
    private String messageUser;
    private String messageContent;
    private Date messageDateline;

    @Override
    public String toString() {
        return "Message{" +
                "messageId=" + messageId +
                ", messageUser='" + messageUser + '\'' +
                ", messageContent='" + messageContent + '\'' +
                ", messageDateline=" + messageDateline +
                '}';
    }

    public int getMessageId() {
        return messageId;
    }

    public void setMessageId(int messageId) {
        this.messageId = messageId;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public Date getMessageDateline() {
        return messageDateline;
    }

    public void setMessageDateline(Date messageDateline) {
        this.messageDateline = messageDateline;
    }
}
