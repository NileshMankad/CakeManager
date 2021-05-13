package com.waracle.demo.service.impl;

import com.waracle.demo.controller.CakeController;
import com.waracle.demo.converter.CakeConverter;
import com.waracle.demo.dto.CakeDto;
import com.waracle.demo.repository.CakeRepository;
import com.waracle.demo.service.CakeService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Nilesh
 */
@Service
public class CakeServiceimpl implements CakeService {
	@Autowired
	CakeRepository cakeRepository;
	
	private static Logger LOGGER = LoggerFactory.getLogger(CakeServiceimpl.class);

	/*
	@Override
	public CakeDto getCakeById(Integer cakeId) {
		return CakeConverter.entityToDto(userRepository.getOne(cakeId));
	}
    */
	@Override
	public void saveCake(CakeDto cakeDto) {
		LOGGER.info("saveCake called from CakeServiceImpl");
		cakeRepository.save(CakeConverter.dtoToEntity(cakeDto));
	}

	@Override
	public List<CakeDto> getAllCakes() {
		LOGGER.info("getAllCakes called from CakeServiceImpl");
		return cakeRepository.findAll().stream().map(CakeConverter::entityToDto).collect(Collectors.toList());
	}
}
