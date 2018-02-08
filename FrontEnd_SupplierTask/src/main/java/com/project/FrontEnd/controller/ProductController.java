package com.project.FrontEnd.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.project.BackEnd.dao.CategoryDao;
import com.project.BackEnd.dao.ProductDao;
import com.project.BackEnd.dao.SupplierDao;
import com.project.BackEnd.dto.Category;
import com.project.BackEnd.dto.Product;
import com.project.BackEnd.dto.Supplier;


@Controller
public class ProductController {

	@Autowired
	private ProductDao productDao;
	

	@Autowired
	private CategoryDao categoryDao;
	
	@Autowired
	private SupplierDao supplierDao;
	
	
	
	
	//public String addProduct(HttpServletRequest request){
	@RequestMapping(value="/admin/addProduct",method=RequestMethod.POST)
	public ModelAndView addProduct(HttpServletRequest request,@RequestParam("file")CommonsMultipartFile file){
		
		Product p=new Product();
		p.setProductName(request.getParameter("productName"));
		p.setDescription(request.getParameter("description"));
		p.setPrice(Float.parseFloat(request.getParameter("price")));
		p.setQuantity(Integer.parseInt(request.getParameter("quantity")));
		
		int supplierId=Integer.parseInt(request.getParameter("supplier"));
		int categoryId=Integer.parseInt(request.getParameter("category"));
		
		Supplier supplierObj=supplierDao.getSupplierById(supplierId);		
		Category categoryObj=categoryDao.getCategoryById(categoryId);
		
		p.setSupplier(supplierObj);
		p.setCategory(categoryObj);
		
		String filePath=request.getSession().getServletContext().getRealPath("/");
		String fileName=file.getOriginalFilename();
		
		
		System.out.println(filePath+" "+fileName);
		p.setImgname(fileName);
		
		System.out.println("I m here 1 ");
		
		productDao.insertProduct(p);
		
		System.out.println("I m here 2");
		
		try{
			byte[] imageBytes=file.getBytes();
			BufferedOutputStream fos=new BufferedOutputStream(new FileOutputStream(filePath+"/resources/"+fileName));
			fos.write(imageBytes);
			fos.close();
				
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		ModelAndView mv=new ModelAndView("Status");
		mv.addObject("msg","Product Added Succesfully...");
		return mv;
	}
	
}
