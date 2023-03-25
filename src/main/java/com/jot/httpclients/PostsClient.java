package com.jot.httpclients;

import com.jot.domain.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.DeleteExchange;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;

public interface PostsClient {

    @GetExchange("/posts/{id}")
    public Post getPost(@PathVariable Integer id);

    @GetExchange("/posts")
    public List<Post> getAllPosts();

    @DeleteExchange("/posts/{id}")
    public void deletePost(@PathVariable Integer id);

    @PostExchange("/posts")
    public Post createPost(@RequestBody Post post);
}
