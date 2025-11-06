package com.blog.crud.core.ports.in;

import com.blog.crud.core.domain.Post;

public interface CreatePostUseCase {

    Post createPost(Post post);
}
