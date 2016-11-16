package com.lin.blog.service;

import com.lin.blog.entity.Message;

import java.util.List;

/**
 * Created by lin on 2016/11/3.
 */
public interface MessageService {
    /**
     * 添加留言
     * @param user
     * @param content
     * @return
     */
    boolean addMessage( String user,String content);

    /**
     * 删除留言
     * @param messageId
     * @return
     */
    boolean deleteMessage(int messageId);

    /**
     * 查询所有留言
     * @return
     */
    List<Message> queryAll(int page);
}
