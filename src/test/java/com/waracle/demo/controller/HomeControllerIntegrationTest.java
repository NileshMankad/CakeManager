package com.waracle.demo.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.awt.PageAttributes.MediaType;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.web.client.RestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.waracle.demo.CakeDemoApplication;
import com.waracle.demo.repository.CakeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)


public class HomeControllerIntegrationTest {
	
	@LocalServerPort
	private int port;

	
	 @Test
	 public void testHomeController() throws IOException, URISyntaxException {
		 
		    RestTemplate restTemplate = new RestTemplate();
		 
		    final String baseUrl = "http://localhost:" + port + "/cakes";
		    URI uri = new URI(baseUrl);
	        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class);
	        assertEquals(response.getStatusCode(), HttpStatus.OK);
	 }

}
