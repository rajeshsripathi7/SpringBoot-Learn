package com.raj.springthymeleafweb.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class Product {

	String name;
	
	BigDecimal price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
