package com.project.BackEnd.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.project.BackEnd.dao.ProductDao;
import com.project.BackEnd.dto.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public boolean insertProduct(Product product) {
		try {
			getSession().persist(product);
			return true;
		}
		catch(Exception e){
			System.out.println(e);
			return false;
			
		}
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteProduct(int productId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
