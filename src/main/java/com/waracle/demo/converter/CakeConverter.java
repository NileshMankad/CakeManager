package com.waracle.demo.converter;

import java.util.stream.Collectors;

import com.waracle.demo.dto.CakeDto;
import com.waracle.demo.entity.Cake;

/**
 * Created by Nilesh
 */
public class CakeConverter {
	public static Cake dtoToEntity(CakeDto cakeDto) {
		Cake cake = new Cake(cakeDto.getTitle(), cakeDto.getDescription(), cakeDto.getImage());
		cake.setCakeId(cakeDto.getCakeId());
		return cake;
	}
	public static CakeDto entityToDto(Cake cake) {
		CakeDto cakeDto = new CakeDto(cake.getCakeId(), cake.getTitle(), cake.getDescription(), cake.getImage());
		return cakeDto;
	}
}
