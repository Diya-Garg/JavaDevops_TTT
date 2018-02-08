package com.project.FrontEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.BackEnd.dao.CategoryDao;
import com.project.BackEnd.dao.SupplierDao;
import com.project.BackEnd.dto.Category;
import com.project.BackEnd.dto.Product;
import com.project.BackEnd.dto.Supplier;


@Controller
@RequestMapping("/")
public class IndexController {

	
	@Autowired
	CategoryDao categoryDao;
	
	@Autowired
	SupplierDao supplierDao;
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView welcomePage(){
		ModelAndView mv=new ModelAndView("welcome");
		return mv;
	}
	
	@RequestMapping(value="/admin/welcome",method=RequestMethod.GET)
	public ModelAndView welcomeAdmin(){
		ModelAndView mv=new ModelAndView("AdminAdding");
		
		List<Category> categories=categoryDao.listCategories();
		List<Supplier> suppliers=supplierDao.listSuppliers();
		
		mv.addObject("supplierObj",new Supplier());
		mv.addObject("categoryObj",new Category());
		
		mv.addObject("categoryList",categories);
		mv.addObject("supplierList",suppliers);
		
		return mv;
	}
	
	
}
