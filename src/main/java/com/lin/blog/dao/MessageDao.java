package com.lin.blog.dao;

import com.lin.blog.entity.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lin on 2016/11/2.
 */
public interface MessageDao {

    /**
     * 添加留言
     * @param user
     * @param content
     * @return
     */
    int addMessage(@Param("user") String user,@Param("content") String content);

    /**
     * 删除留言
     * @param messageId
     * @return
     */
    int deleteMessage(@Param("messageId") int messageId);

    /**
     * 查询所有留言
     * @param offset
     * @param limit
     * @return
     */
    List<Message> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
