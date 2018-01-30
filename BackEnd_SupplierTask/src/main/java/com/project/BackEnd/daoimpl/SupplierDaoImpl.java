package com.project.BackEnd.daoimpl;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.BackEnd.dao.SupplierDao;
import com.project.BackEnd.dto.Supplier;


@Repository("supplierDao")
@Transactional//(noRollbackFor=Exception.class)
public class SupplierDaoImpl implements SupplierDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public boolean insertSupp(Supplier supplier) {
		try {
			getSession().persist(supplier);
			return true;
		}
		catch(Exception e){
			System.out.println(e);
			return false;
			
		}
		
	}

	public Supplier getSupplierById(int supplierId){
		return getSession().get(Supplier.class,supplierId);
	}

	public boolean updateSupp(Supplier supplier) {
		try {
			
			//Supplier obj=getSession().get(Supplier.class,supplier.getSupplierId());
			//System.out.println("obj : "+obj);
			getSession().update(supplier);
			return true;
		}
		catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteSupp(int supplierId) {
		Supplier obj=(Supplier)getSession().get(Supplier.class, supplierId);
		if(obj!=null){
			getSession().delete(obj);
			return true;
		}
		else {
			return false;
		}
	}

}
