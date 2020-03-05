package com.example.springbootes.controller;

import com.example.springbootes.entity.mysql.MysqlBlog;
import com.example.springbootes.repository.mysql.MysqlBlogRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Slf4j
public class IndexController {
    @Autowired
    private MysqlBlogRepository mysqlBlogRepository;
    @RequestMapping("/")
    public String index(){
        List<MysqlBlog> all = mysqlBlogRepository.findAll();
        log.info(">>> {} <<<",all.size());
        return "index.html";
    }
}
