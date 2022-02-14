package com.templates.restfulapi.service;

import com.templates.restfulapi.domain.data.dto.BeverageDto;

import java.util.List;

/**
 * Beverage related services and CRUD functionalities.
 *
 * @author Jonas Castanheira
 */
public interface BeverageService {
    List<BeverageDto> list();

    BeverageDto create();

    BeverageDto update();

    void delete();
}
