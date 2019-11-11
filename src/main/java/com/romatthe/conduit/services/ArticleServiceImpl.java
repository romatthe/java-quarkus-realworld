package com.romatthe.conduit.services;

import com.romatthe.conduit.domain.Article;
import com.romatthe.conduit.repository.ArticleRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository repository;

    @Inject
    public ArticleServiceImpl(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    public Article create(String title, String description, String body) {
        var article = new Article.Builder()
                .setTitle(title)
                .setDescription(description)
                .setBody(body)
                .build();

        return repository.save(article);
    }

}
