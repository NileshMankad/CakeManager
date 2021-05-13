package com.waracle.demo.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.waracle.demo.entity.Cake;
import com.waracle.demo.repository.CakeRepository;
import com.waracle.demo.service.CakeService;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(CakeController.class)

public class CakeControllerSaveCakeTest {
	
	private static Logger LOGGER = LoggerFactory.getLogger(CakeControllerSaveCakeTest.class);
	
	@Autowired 
	MockMvc mvc;
	
	@MockBean 
	CakeService cakeService;
	
	@MockBean 
	CakeRepository cakeRepository;
	
	@Test
	 public void testSaveCakeAPI() throws Exception {
		
		LOGGER.info("Enter testSaveCakeAPI()");
		
		 mvc.perform( MockMvcRequestBuilders
			      .post("/saveCake")
			      .content(asJsonString(new Cake("firstcake", "first cake", "first cake image")))
			      .contentType(MediaType.APPLICATION_JSON)
			      .accept(MediaType.APPLICATION_JSON))
			      .andExpect(status().isOk());
		 LOGGER.info("Exit testSaveCakeAPI()");
		}
			public static String asJsonString(final Object obj) {
			    try {
			        return new ObjectMapper().writeValueAsString(obj);
			    } catch (Exception e) {
			        throw new RuntimeException(e);
			    }
			}
}
