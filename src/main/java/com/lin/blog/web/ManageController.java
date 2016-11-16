package com.lin.blog.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lin.blog.dto.RequestResult;
import com.lin.blog.entity.Article;
import com.lin.blog.service.ArticleService;
import com.lin.blog.service.CommentService;
import com.lin.blog.service.MessageService;
import com.lin.blog.service.UtilsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

/**
 * Created by lin on 2016/11/3.
 */
@Controller
@RequestMapping("/manage")
public class ManageController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    ArticleService articleService;
    @Autowired
    CommentService commentService;
    @Autowired
    MessageService messageService;
    @Autowired
    UtilsService utilsService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(Model model){
        return "manage/login";
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public String root(Model model){return "manage/login";}

    @RequestMapping(value = {"/list/{page}","list"}, method = RequestMethod.GET)
    public String list(@PathVariable(value = "page",required = false) Integer page, Model model) {
        if(page == null){
            page = 1;
        }
        //获取列表页
        List<Article> list = articleService.getArticleList(page);
        model.addAttribute("articles", list);
        return "manage/list";
    }

    @RequestMapping(value = "/{articleId}/changeState",method = RequestMethod.GET)
    @ResponseBody
    public RequestResult<Article> changeState(@PathVariable("articleId") int articleId){
        boolean result = articleService.changeState(articleId);
        RequestResult<Article> requestResult = new RequestResult<Article>(true,result);
        return requestResult;
    }

    @RequestMapping(value = "/{articleId}/delete",method = RequestMethod.GET)
    @ResponseBody
    public RequestResult<Article> delete(@PathVariable("articleId")int articleId){
        boolean result = articleService.deleteArticle(articleId);
        RequestResult<Article> requestResult = new RequestResult<Article>(true,result);
        return requestResult;
    }

    @RequestMapping(value = "/post",method = RequestMethod.GET)
    public String post(Model model){
        return "manage/post";
    }

    @RequestMapping(value = "/uploadArticle",method = RequestMethod.POST)
    @ResponseBody
    public RequestResult<Article> uploadArticle(@RequestBody String requestBody){
        String[] s = requestBody.substring(6).split("//content:");
        String title = s[0];
        String content = s[1];
        boolean result = articleService.addArticle(title,content,false);
        RequestResult<Article> requestResult = new RequestResult<Article>(true,result);
        return requestResult;
    }

    @RequestMapping(value = "/publishArticle",method = RequestMethod.POST)
    @ResponseBody
    public RequestResult<Article> publishArticle(@RequestBody String requestBody){
        String[] s = requestBody.substring(6).split("//content:");
        String title = s[0];
        String content = s[1];
        boolean result = articleService.addArticle(title,content,true);
        RequestResult<Article> requestResult = new RequestResult<Article>(true,result);
        return requestResult;
    }

}
