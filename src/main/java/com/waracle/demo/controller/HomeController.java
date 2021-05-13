package com.waracle.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HomeController {
	private static Logger LOGGER = LoggerFactory.getLogger(CakeController.class);
	@RequestMapping("/cakes")
	public String home() {
		LOGGER.info("index.html called from HomeController");
		return "index";
	}
}
