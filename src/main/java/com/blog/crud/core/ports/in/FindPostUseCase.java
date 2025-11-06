package com.blog.crud.core.ports.in;

import com.blog.crud.core.domain.Post;

import java.util.List;
import java.util.Optional;

public interface FindPostUseCase {

    Optional<Post> findById(Long id);

    List<Post> findAll();
}
