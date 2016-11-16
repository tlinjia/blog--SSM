package com.lin.blog.dao;

import com.lin.blog.entity.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * 配置spring和junit整合,以便junit启动时加载springIOC容器
 * Created by lin on 2016/11/2.
 */
@RunWith(SpringJUnit4ClassRunner.class) //加载容器
@ContextConfiguration({"classpath:spring/spring-dao.xml"}) //加载配置文件
public class CommentDaoTest {

    @Autowired
    CommentDao commentDao;

    @Test
    public void addComment() throws Exception {
       int result = commentDao.addComment(2,"lin","unit test");
        System.out.println(result);
    }

    @Test
    public void queryAll() throws Exception {
        List<Comment> list1 = commentDao.queryAll(1,1,2);
        List<Comment> list2 = commentDao.queryAll(2,0,1);
        for (Comment comment : list1){
            System.out.println(comment);
        }
        System.out.println();
        for (Comment comment : list2){
            System.out.println(comment);
        }
    }

    @Test
    public void deleteComment() throws Exception {
        int result = commentDao.deleteComment(3);
        System.out.println(result);
    }

}