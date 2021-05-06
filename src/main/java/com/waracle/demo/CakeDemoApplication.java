package com.waracle.demo;


import com.waracle.demo.entity.Cake;
import com.waracle.demo.repository.CakeRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class CakeDemoApplication {
	@Autowired
	CakeRepository cakeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CakeDemoApplication.class, args);
	}

	@PostConstruct
	public void setupDbWithData(){
		Cake cake= new Cake("Rose", "Rose cake", "rose image");
		//user.setSkills(Arrays.asList(new Skill("java"), new Skill("js")));
		cake= cakeRepository.save(cake);
	}
}
