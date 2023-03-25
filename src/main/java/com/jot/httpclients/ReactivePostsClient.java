package com.jot.httpclients;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;

import com.jot.domain.Post;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ReactivePostsClient {

    @GetExchange("/posts/{id}")
    public Mono<Post> getPost(@PathVariable Integer id);

    @GetExchange("/posts")
    public Flux<Post> getAllPosts();
    
}
