package com.romatthe.conduit.api.reponses;

import com.romatthe.conduit.domain.Article;

import java.time.LocalDateTime;
import java.util.List;

public class CreateArticleResponse {

    private final String slug;
    private final String title;
    private final String description;
    private final String body;
    private final List<String> tagList;
    private final boolean favorited;
    private final int favoritesCount;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    private CreateArticleResponse(
            String slug,
            String title,
            String description,
            String body,
            List<String> tagList,
            boolean favorited,
            int favoritesCount,
            LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.body = body;
        this.tagList = tagList;
        this.favorited = favorited;
        this.favoritesCount = favoritesCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public CreateArticleResponse(Article article) {
        this.slug = article.getSlug();
        this.title = article.getTitle();
        this.description = article.getDescription();
        this.body = article.getBody();
        this.tagList = article.getTagList();
        this.favorited = article.isFavorite();
        this.favoritesCount = article.getFavoritesCount();
        this.createdAt = article.getCreatedAt();
        this.updatedAt = article.getUpdatedAt();
    }

    public String getSlug() {
        return slug;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getBody() {
        return body;
    }

    public List<String> getTagList() {
        return tagList;
    }

    public boolean isFavorited() {
        return favorited;
    }

    public int getFavoritesCount() {
        return favoritesCount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public static class Builder {
        private String slug;
        private String title;
        private String description;
        private String body;
        private List<String> tagList;
        private boolean favorite;
        private int favoritesCount;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        public Builder setSlug(String slug) {
            this.slug = slug;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setBody(String body) {
            this.body = body;
            return this;
        }

        public Builder setTagList(List<String> tagList) {
            this.tagList = tagList;
            return this;
        }

        public Builder setFavorite(boolean favorite) {
            this.favorite = favorite;
            return this;
        }

        public Builder setFavoritesCount(int favoritesCount) {
            this.favoritesCount = favoritesCount;
            return this;
        }

        public Builder setCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CreateArticleResponse build() {
            return new CreateArticleResponse(slug, title, description, body, tagList, favorite, favoritesCount, createdAt, updatedAt);
        }
    }
}
