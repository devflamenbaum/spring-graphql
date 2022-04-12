package com.devflamenbaum.api.controller;

import com.devflamenbaum.api.entities.Post;
import com.devflamenbaum.api.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @QueryMapping
    public Post getPostById(@Argument String id){
        return postService.findPostById(id).get();
    }

    @MutationMapping
    public Post createPost(@Argument Post post){
        return postService.create(post);
    }

}
