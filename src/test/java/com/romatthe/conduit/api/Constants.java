package com.romatthe.conduit.api;

import com.romatthe.conduit.api.reponses.CreateArticleResponse;
import com.romatthe.conduit.api.requests.CreateArticleRequest;

import java.util.Arrays;
import java.util.List;

class Constants {

    static final String ARTICLE_TITLE = "How to train your dragon";
    static final String ARTICLE_DESCRIPTION = "Ever wonder how?";
    static final String ARTICLE_BODY = "Very carefully.";
    static final List<String> ARTICLE_TAG_LIST = Arrays.asList("dragons", "training");
    static final boolean ARTICLE_FAVORITE = false;
    static final int ARTICLE_FAVORITE_COUNT = 0;

    static final CreateArticleRequest CREATE_ARTICLE_REQUEST =
        new CreateArticleRequest.Builder()
                .setTitle(ARTICLE_TITLE)
                .setDescription(ARTICLE_DESCRIPTION)
                .setBody(ARTICLE_BODY)
                .setTagList(ARTICLE_TAG_LIST)
                .build();

    static final CreateArticleResponse CREATE_ARTICLE_RESPONSE =
        new CreateArticleResponse.Builder()
                .setTitle(ARTICLE_TITLE)
                .setDescription(ARTICLE_DESCRIPTION)
                .setBody(ARTICLE_BODY)
                .setTagList(ARTICLE_TAG_LIST)
                .setFavorite(ARTICLE_FAVORITE)
                .setFavoritesCount(ARTICLE_FAVORITE_COUNT)
                .build();

}
