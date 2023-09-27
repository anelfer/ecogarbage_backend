package me.anelfer.ecogarbage.controller;

import me.anelfer.ecogarbage.model.news.News;
import me.anelfer.ecogarbage.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {

    private final NewsService service;

    @Autowired
    public NewsController(NewsService service) {
        this.service = service;
    }

    @GetMapping("/api/v1/news")
    public List<News> getNews(@RequestParam int limit) {
        return service.getNews(limit);
    }

    @PostMapping(value = "/api/v1/news")
    public void postNews(@RequestBody News news) {
        service.postNews(news);
    }
}
