package com.category.example.client;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.category.example.model.CategoryResponse;

@Component
public class CategoryClient {

    private static final Logger logger = LoggerFactory.getLogger(CategoryClient.class);

    private RestTemplate restTemplate;

    @PostConstruct
    public void init() {
       restTemplate = new RestTemplate();
    }

    @Async
    public CompletableFuture<CategoryResponse> getcategory11() {

        CategoryResponse listcategoryResponseObject = null;
       
        listcategoryResponseObject = restTemplate.getForObject("https://opentdb.com/api.php?amount=5&amp;category=11", CategoryResponse.class);
        
        return CompletableFuture.completedFuture(listcategoryResponseObject);
    }

    @Async
    public CompletableFuture<CategoryResponse> getcategory12() {

        CategoryResponse listcategoryResponseObject = null;
        
        listcategoryResponseObject = restTemplate.getForObject("https://opentdb.com/api.php?amount=5&amp;category=12", CategoryResponse.class);
        
        return CompletableFuture.completedFuture(listcategoryResponseObject);
    }

}
