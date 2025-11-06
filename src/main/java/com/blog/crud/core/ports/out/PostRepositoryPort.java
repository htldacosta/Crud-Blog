package com.blog.crud.core.ports.out;

import com.blog.crud.core.domain.Post;
import java.util.List;
import java.util.Optional;

public interface PostRepositoryPort {

    Post save(Post post);

    Optional<Post> findById(Long id);

    List<Post> findAll();

    void deleteById(Long id);

    boolean existsById(Long id);
}
