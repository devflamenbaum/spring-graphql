package com.devflamenbaum.api.data;

import com.devflamenbaum.api.entities.Post;
import com.devflamenbaum.api.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        postRepository.saveAll(Arrays.asList(
                new Post(UUID.randomUUID().toString(), "Spring is Awesome!", "Learning Graphql with spring."),
                new Post(UUID.randomUUID().toString(), "Java is Awesome!", "Java new feature."),
                new Post(UUID.randomUUID().toString(), "GraphQL is Awesome!", "Graphql Mutation Example.")));
    }
}
