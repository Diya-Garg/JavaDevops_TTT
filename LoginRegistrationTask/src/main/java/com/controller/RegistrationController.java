package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDAO;
import com.model.User;

@Controller
public class RegistrationController {

	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView showRegister(){
		ModelAndView mav=new ModelAndView("SignUp");
		mav.addObject("user",new User());
		return mav;
	}
	
	@RequestMapping(value="/registerProcess",method=RequestMethod.POST)
	public ModelAndView registerProcess(@Valid @ModelAttribute("user")User user,BindingResult result){
		
		System.out.println("Hello 1");
		
		if(result.hasErrors()){
			System.out.println("Hello 2");
			ModelAndView mav=new ModelAndView("SignUp");
			return mav;
		}
		
		System.out.println("Hello 3");
		ModelAndView mav=new ModelAndView("Success");
		userDAO.register(user);
		return mav;
	}
	
}
