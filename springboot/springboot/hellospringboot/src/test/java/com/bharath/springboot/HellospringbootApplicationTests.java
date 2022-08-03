package com.bharath.springboot;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HellospringbootApplicationTests {

	@Test
	public void testGetProduct() {
		
		RestTemplate restTemplate = new RestTemplate();
		
	}

}
