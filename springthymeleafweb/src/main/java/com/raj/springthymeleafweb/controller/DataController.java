package com.raj.springthymeleafweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataController {
	
	@RequestMapping (value="/senddata")
	public ModelAndView sendData() {
		ModelAndView mv = new ModelAndView("dataview"); // view/html name to display data 
		mv.addObject("msg", "Welcome To Data HTML");
		mv.addObject("time", System.currentTimeMillis());
		return mv;
	}
	
}
