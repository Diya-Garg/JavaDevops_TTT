package com.project.BackEnd.dao;

import java.util.List;

import com.project.BackEnd.dto.Category;


public interface CategoryDao {
	
	boolean insertCategory(Category category);
	boolean updateCategory(Category category);
	boolean deleteCategory(int categoryId);
	public Category getCategoryById(int categoryId);
	public List<Category> listCategories();
}
