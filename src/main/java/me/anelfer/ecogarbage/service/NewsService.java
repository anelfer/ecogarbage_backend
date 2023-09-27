package me.anelfer.ecogarbage.service;

import me.anelfer.ecogarbage.model.news.News;
import me.anelfer.ecogarbage.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    private final NewsRepository repository;

    @Autowired
    public NewsService(NewsRepository repository) {
        this.repository = repository;
    }

    public void postNews(News news) {
        repository.save(news);
    }

    public List<News> getNews(int limit) {
        return repository.findAll(Pageable.ofSize(limit)).stream().toList();
    }
}
