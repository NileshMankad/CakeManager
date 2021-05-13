package com.waracle.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.waracle.demo.CakeDemoApplication;
import com.waracle.demo.dto.CakeDto;
import com.waracle.demo.service.CakeService;
import com.waracle.demo.utils.Constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Nilesh
 */

@RestController
public class CakeController {
	@Autowired
	CakeService cakeService;
	
	private static Logger LOGGER = LoggerFactory.getLogger(CakeController.class);
    /*
	@RequestMapping("/cakes")
	public List<CakeDto> getAllCakes() {
		return cakeService.getAllCakes();
	}
	*/
	@RequestMapping("/")
	public List<CakeDto> getAllCakes() {
		LOGGER.info("getAllCakes called from CakeController");
		return cakeService.getAllCakes();
	}
	@RequestMapping(value= Constants.SAVE_CAKE, method= RequestMethod.POST)
	public void saveCake(@RequestBody CakeDto cakeDto) {
		cakeService.saveCake(cakeDto);
	}
}
