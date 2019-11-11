package com.romatthe.conduit.repository;


import com.romatthe.conduit.domain.Article;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ArticleRepositoryImpl implements PanacheRepository<Article>, ArticleRepository {

    @Override
    public Article save(Article article) {
        persist(article);
        return article;
    }

}
