package com.raj.springweb;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.raj.springweb.model.Product;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringwebApplicationTests {

	
	@Test
	public void testGetProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject("http://localhost:8080/service/productapi/product/byId/4", Product.class);
		assertNotNull(product);
		assertEquals("prod4", product.getName());
	}
	
	
	@Test
	public void testPostProduct() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = new Product();
		product.setName("prod5");
		product.setDescription("Product Five");
		product.setPrice(BigDecimal.valueOf(12.50));
		
		Product newProd = restTemplate.postForObject("http://localhost:8080/service/productapi/createproduct", product, Product.class);
		assertNotNull(newProd);
		assertEquals("prod5", newProd.getName());
	}
	
	

}
