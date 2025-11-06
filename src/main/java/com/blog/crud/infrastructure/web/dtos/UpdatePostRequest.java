package com.blog.crud.infrastructure.web.dtos;

import jakarta.validation.constraints.Size;

public record UpdatePostRequest(
        @Size(min = 5, max = 100, message = "O título deve ter entre 5 e 100 caracteres.")
        String title,

        String content
) {
}
