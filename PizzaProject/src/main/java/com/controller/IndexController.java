package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
