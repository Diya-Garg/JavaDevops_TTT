package com.project.FrontEnd.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.project.BackEnd.dao.SupplierDao;
import com.project.BackEnd.dto.Supplier;


@Controller
public class SupplierController {

	@Autowired
	private SupplierDao supplierDao;
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView getAddSupplierForm(){
		
		//System.out.println("Hello 2 ");
		ModelAndView mv=new ModelAndView("AddSupplier");
		mv.addObject("supplier",new Supplier());
		return mv;
	}
	
	@RequestMapping(value="addSupplierDetails",method=RequestMethod.POST)
	public ModelAndView addSupplierProcess(@ModelAttribute("supplier")Supplier supplierObj){
		
		ModelAndView mv=new ModelAndView("SupplierStatus");
		
		boolean result=supplierDao.insertSupp(supplierObj);
		if(result){
			mv.addObject("msg","Supplier Added Succesfully...");
		}
		else {
			mv.addObject("msg","Not able to Add Supplier");
		}
		return mv;
	}
	
	@RequestMapping(value="delete",method=RequestMethod.GET)
	public ModelAndView getDeleteSupplierForm(){
		ModelAndView mv=new ModelAndView("FetchSupplier");
		mv.addObject("btnLabel","Delete");
		mv.addObject("formAction","deleteSupplier");
		mv.addObject("supplier",new Supplier());
		mv.addObject("msg","Enter the Id of the Supplier you want to delete");
		return mv;
	}
	
	@RequestMapping(value="deleteSupplier",method=RequestMethod.GET)
	public ModelAndView deleteSupplierProcess(@ModelAttribute("supplier")Supplier supplierObj){
		int supplierId=supplierObj.getSupplierId();
		boolean result=supplierDao.deleteSupp(supplierId);
		ModelAndView mv=new ModelAndView("SupplierStatus");
		
		if(result){
		mv.addObject("msg","Supplier Deleted Succesfully...");
		}
		else {
			mv.addObject("msg","Supplier with Id "+supplierId+" doesnt exist");
		}
		return mv;
	}
	
	@RequestMapping(value="update",method=RequestMethod.GET)
	public ModelAndView getUpdateSupplierForm(){
		
		ModelAndView mv=new ModelAndView("FetchSupplier");
		mv.addObject("btnLabel","Update");
		mv.addObject("formAction","updateSupplier");
		mv.addObject("supplier",new Supplier());
		mv.addObject("msg","Enter the Id of the Supplier you want to update");
		return mv;
	}
	
	@RequestMapping(value="updateSupplier",method=RequestMethod.GET)
	public ModelAndView getUpdateSupplierForm2(@ModelAttribute("supplier")Supplier supplierObj){
		int supplierId=supplierObj.getSupplierId();
		
		
		supplierObj=supplierDao.getSupplierById(supplierId);
		//System.out.println(supplierObj.getSupplierId()+" : "+supplierObj.getSupplierName());
		if(supplierObj!=null){
			
		
		ModelAndView mv=new ModelAndView("UpdateSupplierForm");
		mv.addObject("newSupplier",supplierObj);
	
		return mv;
		}
		else {
			ModelAndView mv=new ModelAndView("SupplierStatus");
			mv.addObject("msg","Supplier with Id "+supplierId+" doesnt exist");
			return mv;
		}
		
	}
	
	@RequestMapping(value="updateSupplierDetails",method=RequestMethod.POST)
	public ModelAndView updateSupplierProcess(@ModelAttribute("newSupplier")Supplier newSupplier){
		
		System.out.println("Id : "+newSupplier.getSupplierId()+" "+newSupplier.getSupplierName());
		boolean result=supplierDao.updateSupp(newSupplier);
		
		System.out.println("Result : "+result);
		ModelAndView mv=new ModelAndView("SupplierStatus");
		
		if(result){
		mv.addObject("msg","Supplier Updated Succesfully...");
		}
		
		return mv;
	}
	
}


