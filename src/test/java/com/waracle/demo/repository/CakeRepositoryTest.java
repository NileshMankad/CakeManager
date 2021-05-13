package com.waracle.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.waracle.demo.controller.CakeController;
import com.waracle.demo.entity.Cake;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CakeRepositoryTest {

	@Autowired
    private CakeRepository cakeRepository;
	
	 @Autowired
	 private TestEntityManager entityManager;
	 
	 
	 @Test
	 public void whenFindByName_thenReturnCake() {
		 Cake cake = new Cake("TestCake", "Testing Cake","Test Image");
		 entityManager.persist(cake);
		 entityManager.flush();
		 
		 //when
		 Cake found = cakeRepository.findByTitle("TestCake");
		 
		 //then
		 assertThat(found.getTitle())
	      .isEqualTo(cake.getTitle());

	 }
}
