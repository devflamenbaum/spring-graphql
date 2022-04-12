package com.devflamenbaum.api.services;

import com.devflamenbaum.api.entities.Post;
import com.devflamenbaum.api.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post create(Post post){
        return postRepository.save(post);
    }

    public Optional<Post> findPostById(String id){
        return postRepository.findById(id);
    }
}
