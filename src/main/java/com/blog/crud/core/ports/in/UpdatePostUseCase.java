package com.blog.crud.core.ports.in;

import com.blog.crud.core.domain.Post;

import java.util.Optional;

public interface UpdatePostUseCase {

    Optional<Post> updatePost(Long id, Post postToUpdate);
}
