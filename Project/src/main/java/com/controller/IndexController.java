package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class IndexController {

	@RequestMapping("/getHomePage")
	public String helloWorld(){
		return "homepage";
	}
	
	@RequestMapping("/locate")
	public String locateUs(){
		return "LocateUs";
	}
	
}
