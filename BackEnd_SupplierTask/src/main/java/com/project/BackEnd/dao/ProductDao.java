package com.project.BackEnd.dao;

import com.project.BackEnd.dto.Product;

public interface ProductDao {
	
	boolean insertProduct(Product product);
	boolean updateProduct(Product product);
	boolean deleteProduct(int productId);
	public Product getProductById(int productId);
}
