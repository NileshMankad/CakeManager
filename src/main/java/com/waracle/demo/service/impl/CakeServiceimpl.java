package com.waracle.demo.service.impl;

import com.waracle.demo.converter.CakeConverter;
import com.waracle.demo.dto.CakeDto;
import com.waracle.demo.repository.CakeRepository;
import com.waracle.demo.service.CakeService;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nilesh
 */
@Service
public class CakeServiceimpl implements CakeService {
	@Autowired
	CakeRepository cakeRepository;

	/*
	@Override
	public CakeDto getCakeById(Integer cakeId) {
		return CakeConverter.entityToDto(userRepository.getOne(cakeId));
	}
    */
	@Override
	public void saveCake(CakeDto cakeDto) {
		cakeRepository.save(CakeConverter.dtoToEntity(cakeDto));
	}

	@Override
	public List<CakeDto> getAllCakes() {
		return cakeRepository.findAll().stream().map(CakeConverter::entityToDto).collect(Collectors.toList());
	}
}
