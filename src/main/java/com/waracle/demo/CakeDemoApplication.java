package com.waracle.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.waracle.demo.entity.Cake;
import com.waracle.demo.repository.CakeRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class CakeDemoApplication {
	
	@Autowired
	CakeRepository cakeRepository;

	private static Logger LOGGER = LoggerFactory.getLogger(CakeDemoApplication.class);
	
	public static void main(String[] args) {
		LOGGER.info("Going to start Spring Boot...");
		SpringApplication.run(CakeDemoApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		LOGGER.info("Enter postConstruct CakeDemoApplication class");
		Cake cake= new Cake("Rose", "Rose cake", "rose image");
		//user.setSkills(Arrays.asList(new Skill("java"), new Skill("js")));
		cake= cakeRepository.save(cake);
	}
}
