package com.romatthe.conduit.api;

import com.romatthe.conduit.api.reponses.CreateArticleResponse;
import com.romatthe.conduit.api.requests.CreateArticleRequest;
import com.romatthe.conduit.domain.Article;
import com.romatthe.conduit.services.ArticleService;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("api/articles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ArticlesResource {

    private final ArticleService service;

    public ArticlesResource(ArticleService service) {
        this.service = service;
    }

    @POST
    public Response createArticle(CreateArticleRequest request) {
        var article = service.create(request.getTitle(), request.getDescription(), request.getBody());
        return Response.ok(new CreateArticleResponse(article)).status(Response.Status.CREATED).build();
    }
}
