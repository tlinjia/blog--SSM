package com.lin.blog.service.impl;

import com.lin.blog.dao.MessageDao;
import com.lin.blog.entity.Message;
import com.lin.blog.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lin on 2016/11/3.
 */
@Service
public class MessageServiceImpl implements MessageService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    MessageDao messageDao;

    public boolean addMessage(String user, String content) {
        int result = messageDao.addMessage(user, content);
        return result <= 0 ? false : true;
    }

    public boolean deleteMessage(int messageId) {
        int result = messageDao.deleteMessage(messageId);
        return result <= 0 ? false : true;
    }

    public List<Message> queryAll(int page) {
        List<Message> list = messageDao.queryAll((page -1) * 8, 8);
        return list;
    }
}
