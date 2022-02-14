package com.templates.restfulapi.domain.data.entity;

import com.templates.restfulapi.domain.data.valueobject.BeverageStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Beverage extends BaseEntity {
    @NotNull
    private String name;

    @NotNull
    private Long price;

    @NotNull
    private BeverageStatus status;
}
