package ru.kenzer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.kenzer.api.entity.News;
import ru.kenzer.api.repo.NewsRepo;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/news")
public class NewsController {
     private final NewsRepo newsRepo;

    @Autowired
    public NewsController(NewsRepo newsRepo) {
        this.newsRepo = newsRepo;
    }

    @GetMapping
    public List<News> list() {
        return newsRepo.findAll();
    }

    @GetMapping ("id")
    public News getOne (@PathVariable("id") News news) {
        return news;
    }

    @PostMapping
    public News create(@RequestBody News news) {
        return newsRepo.save(news);
    }
}
