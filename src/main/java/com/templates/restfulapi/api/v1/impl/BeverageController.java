package com.templates.restfulapi.api.v1.impl;

import com.templates.restfulapi.api.v1.BeverageApi;
import com.templates.restfulapi.domain.data.dto.BeverageDto;
import com.templates.restfulapi.domain.data.entity.Beverage;
import com.templates.restfulapi.service.BeverageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@Slf4j
public class BeverageController implements BeverageApi {
    private final BeverageService beverageService;

    @Autowired
    public BeverageController(BeverageService beverageService) {
        this.beverageService = beverageService;
    }

    @Override
    public ResponseEntity<List<BeverageDto>> list(Boolean purchasable) {
        return beverageService.list();
    }

    @Override
    public ResponseEntity<String> create(BeverageDto beverageDto) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<BeverageDto> updateInfo(@PathVariable Long id, BeverageDto beverageDto) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }

    @Override
    public ResponseEntity<String> delete(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
    }
}
