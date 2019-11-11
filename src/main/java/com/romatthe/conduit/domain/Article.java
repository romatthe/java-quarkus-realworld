package com.romatthe.conduit.domain;

import javax.persistence.Entity;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Article {

    private final String slug;
    private final String title;
    private final String description;
    private final String body;
    private final List<String> tagList;
    private final boolean favorite;
    private final int favoritesCount;
    private final LocalDateTime createdAt;
    private final LocalDateTime updatedAt;

    private Article(
            String slug,
            String title,
            String description,
            String body,
            List<String> tagList,
            boolean favorite,
            int favoritesCount,
            LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.slug = slug;
        this.title = title;
        this.description = description;
        this.body = body;
        this.tagList = tagList;
        this.favorite = favorite;
        this.favoritesCount = favoritesCount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public boolean isFavorite() {
        return favorite;
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

        public Article build() {
            return new Article(slug, title, description, body, tagList, favorite, favoritesCount, createdAt, updatedAt);
        }
    }
}
