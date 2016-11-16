package com.lin.blog.web;

import com.lin.blog.entity.Article;
import com.lin.blog.service.UtilsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by lin on 2016/11/4.
 */
@Controller
@RequestMapping("/")
public class RootController {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String root(Model model){
       return "redirect:/blog/index";
    }
    @RequestMapping(value = "a",method = RequestMethod.GET)
    public String roota(Model model){
        return "redirect:/blog/index";
    }
}
