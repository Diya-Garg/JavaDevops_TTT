package com.project.BackEnd.testcases;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.project.BackEnd.dao.SupplierDao;
import com.project.BackEnd.dto.Supplier;


public class SupplierTestCase {
	
	private static AnnotationConfigApplicationContext context;
	private static SupplierDao supplierDao;
	private static Supplier supplier;
	

	@BeforeClass
	public static void setUp() throws Exception {
		context=new AnnotationConfigApplicationContext();
		context.scan("com.project.BackEnd");
		context.refresh();
		supplierDao=(SupplierDao)context.getBean("supplierDao");
		
		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		supplier=null;
		supplierDao=null;
		context=null;
	}

	/*@Test
	public void testAddSupplier() {
		supplier=new Supplier();
		supplier.setSupplierId(5);
		supplier.setSupplierName("Radha Creators");
		assertEquals("Succesfully added a supplier", true,supplierDao.insertSupp(supplier));
	}*/
	
	/*@Test
	public void testDeleteSupplier(){
		assertEquals("Succesfully deleted the supplier",true ,supplierDao.deleteSupp(3));
	}*/
	
	/*@Test
	public void testNotDeleteSupplier(){
		assertEquals("Supplier having id doesnt exist",false,supplierDao.deleteSupp(3));
	}*/
	
	/*@Test
	public void updateSupplier(){
		supplier=new Supplier();
		supplier.setSupplierId(2);
		supplier.setSupplierName("Laxmi Exporters");
		assertEquals("Supplier Updated Succesfully",true,supplierDao.updateSupp(supplier));
	}*/

}
