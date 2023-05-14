package com.example.Rboard.controller;

import com.example.Rboard.domain.Article;
import com.example.Rboard.domain.User;
import com.example.Rboard.service.ArticleService;
import com.example.Rboard.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@ResponseBody
@RequestMapping(value = "/Articles")
public class ArticleController {

    private ArticleService articleService;
    private UserService userService;
    private Logger log = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    public ArticleController(ArticleService articleService, UserService userService) {
        this.articleService = articleService;
        this.userService = userService;
    }

    /**
     * 게시물 생성
     * @param article
     * @param userId
     */
    @PostMapping("/{userId}")
    public void createArticle(@ModelAttribute Article article,
            @PathVariable String userId) {
        log.debug("Article = {}", article );
        User user = userService.findUser(userId);
        articleService.createArticle(article, user);
    }

    /**
     * 게시물 조회
     * @param ArticleId
     * @return
     */
    @GetMapping("/{ArticleId}")
    public Article searchArticle(@PathVariable Long ArticleId) {
        return articleService.selectArticle(ArticleId);
    }

    /**
     * 게시물 수정
     * @param article
     * @param userId
     * @return
     */
    @PatchMapping("/{userId}")
    public Integer updateArticle(@ModelAttribute Article article, @PathVariable String userId) {
        User user = userService.findUser(userId);
        return articleService.updateArticle(article, user);
    }

    /**
     * 게시물 삭제
     * @param ArticleId
     * @param userId
     * @return
     */
    @PostMapping("/delete/{ArticleId}/{userId}")
    public boolean deleteArticle(@PathVariable Long ArticleId, @PathVariable String userId) {
        Article article = articleService.selectArticle(ArticleId);
        User user = userService.findUser(userId);
        return articleService.deleteArticle(article, user);
    }
}
