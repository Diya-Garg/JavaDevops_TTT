package com.project.FrontEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView sayHello(){
		
		//System.out.println("Hello 1");
		ModelAndView mv=new ModelAndView("AdminAdding");
		return mv;
	}
	
	
}
