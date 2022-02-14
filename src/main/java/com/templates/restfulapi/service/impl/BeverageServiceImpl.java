package com.templates.restfulapi.service.impl;

import com.templates.restfulapi.domain.data.dto.BeverageDto;
import com.templates.restfulapi.domain.data.entity.Beverage;
import com.templates.restfulapi.service.BeverageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class BeverageServiceImpl implements BeverageService {

    @Override
    public List<BeverageDto> list() {
        return convertToDto(new ArrayList<>());
    }

    @Override
    public BeverageDto create() {
        return null;

        
    }

    @Override
    public BeverageDto update() {
        return null;
    }

    @Override
    public void delete() {

    }

    private List<BeverageDto> convertToDto(List<Beverage> entities) {
        List<BeverageDto> dtos = new LinkedList<>();

        for (Beverage entity: entities) {
            dtos.add(convertToDto(entity));
        }

        return dtos;
    }

    private BeverageDto convertToDto(Beverage entity) {
        return BeverageDto.builder()
                .id(entity.getId())
                .createdAt(entity.getCreatedAt())
                .updatedAt(entity.getUpdatedAt())
                .name(entity.getName())
                .price(entity.getPrice())
                .status(entity.getStatus())
                .build();
    }
}
