package com.raj.springweb.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raj.springweb.model.Product;
import com.raj.springweb.repos.ProductJpaRepository;

@RestController
public class RestProductController {
	
	@Autowired
	ProductJpaRepository productRepo;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RestProductController.class);
	
	@RequestMapping (value="/productapi/product/byId/{id}", method=RequestMethod.GET)
	@Transactional(readOnly=true)
	@Cacheable("product-cache")
	public Product findProductbyId (@PathVariable("id") long id) {
		return productRepo.findById(id).get();
	}
	
	@RequestMapping (value="/productapi/deleteproduct/byId/{id}", method=RequestMethod.DELETE)
	@CacheEvict("product-cache")
	public void deleteProduct (@PathVariable long id) {
		productRepo.deleteById(id);
	}
	
	@RequestMapping (value="/productapi/allproducts", method=RequestMethod.GET)
	public List<Product> findAllProducts () {
		LOGGER.info("Find All Products");
		return productRepo.findAll();
	}
	
	@RequestMapping (value="/productapi/createproduct", method=RequestMethod.POST)
	public Product createProduct (@RequestBody Product product) {
		return productRepo.save(product);
	}
	
	@RequestMapping (value="/productapi/updateproduct", method=RequestMethod.PUT)
	public Product updateProduct (@RequestBody Product product) {
		return productRepo.save(product);
	}
	
}
