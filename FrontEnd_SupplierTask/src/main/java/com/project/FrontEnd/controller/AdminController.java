package com.project.FrontEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AdminController {
	
	@RequestMapping(value="login")
	public ModelAndView login(){
		ModelAndView mv=new ModelAndView("login");
		mv.addObject("title","Login");
		return mv;
	}
}
