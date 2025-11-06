package com.blog.crud.core.ports.in;

import com.blog.crud.core.domain.Post;

public interface CreatedPostUseCase {

    Post createPost(Post post);
}
