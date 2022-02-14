package com.templates.restfulapi.domain.data.dto;

import com.templates.restfulapi.domain.data.valueobject.BeverageStatus;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class BeverageDto extends BaseEntityDto {
    private String name;
    private Long price;
    private BeverageStatus status;

    @Builder
    public BeverageDto(Long id, LocalDateTime createdAt, LocalDateTime updatedAt, String name, Long price, BeverageStatus status) {
        super(id, createdAt, updatedAt);
        this.name = name;
        this.price = price;
        this.status = status;
    }
}
