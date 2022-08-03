package com.bharath.springweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.bharath.springweb.entities.Product;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductrestapiApplicationTests {
	
	@Value("${productrestapi.service.url}")
	private String baseURL;

	@Test
	public void testGetProduct() {
		System.out.println(baseURL);
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseURL+"1", Product.class);
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getDescription());
		System.out.println(product.getPrice());
	}
	
	@Test
	public void testCreateProduct() {
		
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("Asus");
		product.setDescription("Asus_Desc");
		product.setPrice(5000);
		restTemplate.postForObject(baseURL, product, Product.class);
	}

	@Test
	public void testUpdateProduct() {
		
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseURL+"7", Product.class);
		product.setPrice(6000);
		restTemplate.put("http://localhost:8080/productapi/products/", product);
	}

}
