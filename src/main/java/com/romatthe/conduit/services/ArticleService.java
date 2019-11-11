package com.romatthe.conduit.services;

import com.romatthe.conduit.domain.Article;

public interface ArticleService {

    public Article create(String title, String description, String body);

}
