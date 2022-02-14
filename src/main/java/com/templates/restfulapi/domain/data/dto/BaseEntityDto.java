package com.templates.restfulapi.domain.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
abstract class BaseEntityDto {
    private Long id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
