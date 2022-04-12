package com.devflamenbaum.api.repositories;

import com.devflamenbaum.api.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, String> {
}
