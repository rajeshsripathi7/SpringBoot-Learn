package com.raj.springthymeleafweb.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raj.springthymeleafweb.model.Product;

@Controller
public class ProductDataController {
	
	@RequestMapping (value="/products")
	public ModelAndView sendData() {
		ModelAndView mv = new ModelAndView("products"); // view/html name to display data 
		Product product1 = new Product();
		product1.setName("First Product");
		product1.setPrice(BigDecimal.valueOf(11.50));
		
		Product product2 = new Product();
		product2.setName("Second Product");
		product2.setPrice(BigDecimal.valueOf(13.50));
		
		List<Product> products = Arrays.asList(product1, product2);
		
		mv.addObject("products", products);
		return mv;
	}
	
}
