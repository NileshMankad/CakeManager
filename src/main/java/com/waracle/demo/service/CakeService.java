package com.waracle.demo.service;

import java.util.List;

import com.waracle.demo.dto.CakeDto;

/**
 * Created by Nilesh
 */
public interface CakeService {
    void saveCake(CakeDto cakeDto);
    List<CakeDto> getAllCakes();
}
