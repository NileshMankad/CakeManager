package com.waracle.demo.controller;

import static org.junit.Assert.assertEquals;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)

public class CakeControllerIntegrationTest {	
	
	@LocalServerPort
    int randomServerPort;
	
    @Test
	public void testGetAllCakes() throws IOException, URISyntaxException {
		    RestTemplate restTemplate = new RestTemplate();
	     
		    final String baseUrl = "http://localhost:" + randomServerPort + "/";
		    URI uri = new URI(baseUrl);
		 
		    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		     
		    //Verify request succeed
		    assertEquals(200, result.getStatusCodeValue());
	 }
}

