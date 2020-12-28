package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GoodsController {

	@RequestMapping("/godds")
	@ResponseBody
	public String testPage() {
		
		return "Tes springboot?";		
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String testhello() {
		
		return "hello";		
	}
	
	
}
