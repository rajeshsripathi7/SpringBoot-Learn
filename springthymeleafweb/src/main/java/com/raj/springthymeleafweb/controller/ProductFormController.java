package com.raj.springthymeleafweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raj.springthymeleafweb.model.Product;

@Controller
public class ProductFormController {
	
	@RequestMapping (value="/productform")
	public ModelAndView displayProductCreateForm() {
		ModelAndView mv = new ModelAndView("productform"); // view/html name to display data 
		Product product = new Product();
		mv.addObject("product", product);
		return mv;
	}
	
	@RequestMapping (value="/createproduct")
	public ModelAndView sendData(@ModelAttribute Product product) {
		ModelAndView mv = new ModelAndView("success"); // view/html name to display data 
		// Code to invoke Product Repository to save data in DB
		return mv;
	}
	
}
