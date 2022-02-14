package com.templates.restfulapi.domain.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    @Setter
    private LocalDateTime createdAt;

    @NotNull
    @Setter
    private LocalDateTime updatedAt;
}
