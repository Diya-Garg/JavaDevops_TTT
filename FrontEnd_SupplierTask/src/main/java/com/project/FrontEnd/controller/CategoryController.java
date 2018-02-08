package com.project.FrontEnd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.BackEnd.dao.CategoryDao;
import com.project.BackEnd.dto.Category;


@Controller
public class CategoryController {

	@Autowired
	private CategoryDao categoryDao;
	
	
	
	@RequestMapping(value="/admin/addCategory",method=RequestMethod.POST)
	public ModelAndView addCategory(@ModelAttribute("categoryObj")Category categoryObj){
		
		ModelAndView mv=new ModelAndView("Status");
		
		boolean result=categoryDao.insertCategory(categoryObj);
		if(result){
			mv.addObject("msg","Category Added Succesfully...");
		}
		else {
			mv.addObject("msg","Not able to Add Category");
		}
		return mv;
	}
}