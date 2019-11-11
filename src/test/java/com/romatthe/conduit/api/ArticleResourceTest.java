package com.romatthe.conduit.api;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.config.ObjectMapperConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static com.romatthe.conduit.api.Constants.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

@QuarkusTest
public class ArticleResourceTest {

    @Inject
    ObjectMapper mapper;

    @BeforeEach
    void setUp() {
        RestAssured.config = RestAssuredConfig.config().objectMapperConfig(new ObjectMapperConfig().jackson2ObjectMapperFactory(
            (cls, charset) -> {
                ObjectMapper om = new ObjectMapper().findAndRegisterModules();
                om.enable(SerializationFeature.WRAP_ROOT_VALUE);
                om.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
                om.registerModule(new JavaTimeModule());
                return om;
            }
        ));
    }

    @Test
    public void testCreateArticle() {
        given()
            .when()
            .body(CREATE_ARTICLE_REQUEST)
            .contentType(ContentType.JSON)
            .log().all()
            .post("/api/articles")
            .then()
            .statusCode(201)
            .body("", equalTo(""))
            .body("article.title", equalTo(ARTICLE_TITLE))
            .body("article.favorited", equalTo(ARTICLE_FAVORITE))
            .body("article.body", equalTo(ARTICLE_BODY))
            .body("article.favoritesCount", equalTo(ARTICLE_FAVORITE_COUNT))
            .body("article.taglist", equalTo(ARTICLE_TAG_LIST));
    }

}
