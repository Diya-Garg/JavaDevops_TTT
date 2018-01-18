package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDAO;
import com.model.User;

@Controller
public class LoginController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView showLogin(){
		ModelAndView mav=new ModelAndView("Login");
		mav.addObject("user",new User());
		return mav;
	}
	
	@RequestMapping(value="/loginProcess",method=RequestMethod.POST)
	public ModelAndView registerProcess(@ModelAttribute("user")User user){
		
		User user1=userDAO.validateUser(user.getUserName(), user.getPassword());
		if(user1!=null){
			ModelAndView mav=new ModelAndView("LoginSuccess");
			return mav;
		}
		else {
			ModelAndView mav=new ModelAndView("LoginFailure");
			return mav;
		}
	}

}
