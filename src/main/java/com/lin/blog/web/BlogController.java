package com.lin.blog.web;

import com.lin.blog.entity.Article;
import com.lin.blog.entity.Comment;
import com.lin.blog.entity.Message;
import com.lin.blog.service.ArticleService;
import com.lin.blog.service.CommentService;
import com.lin.blog.service.MessageService;
import com.lin.blog.service.UtilsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Set;

/**
 * Created by lin on 2016/11/3.
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    ArticleService articleService;
    @Autowired
    CommentService commentService;
    @Autowired
    MessageService messageService;
    @Autowired
    UtilsService utilsService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String root(Model model){
        return index(model);
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model){
        Set<Article> set = utilsService.recommendArticle(4);
        model.addAttribute("articles",set);
        return "blog/index";
    }

    @RequestMapping(value = {"/list/{page}","/list"}, method = RequestMethod.GET)
    public String list(@PathVariable(value = "page",required = false) Integer page, Model model) {
        if(page == null){
            page = 1;
        }
        //获取列表页
        List<Article> list = articleService.showArticleList(page);
        System.out.println(list.size());
        if(list == null){
            list = articleService.showArticleList(1);
        }
        model.addAttribute("articles", list);
        return "blog/list";
    }

    @RequestMapping(value = "{articleId}/detail",method = RequestMethod.GET)
    public String detail(@PathVariable("articleId") Integer articleId,Model model){
        if(articleId == null){
            return "redirect:/blog/list";
        }
        Article article = articleService.getArticleById(articleId);
        if(article == null){
            return "forward:/blog/list";
        }
        List<Comment> list = commentService.queryAll(article.getArticleId(),1);
        model.addAttribute("article",article);
        model.addAttribute("comments",list);
        return "blog/detail";
    }

    @RequestMapping(value = "/message",method = RequestMethod.GET)
    public String message(Model model){
        List<Message> list = messageService.queryAll(1);
        model.addAttribute("messages",list);
        return "blog/message";
    }

    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String about(Model model){

        return "blog/about";
    }
}
