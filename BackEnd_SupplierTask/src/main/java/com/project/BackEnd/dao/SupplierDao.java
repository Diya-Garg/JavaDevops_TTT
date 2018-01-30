package com.project.BackEnd.dao;

import com.project.BackEnd.dto.Supplier;

public interface SupplierDao {
	
	boolean insertSupp(Supplier supplier);
	boolean updateSupp(Supplier supplier);
	boolean deleteSupp(int supplierId);
	public Supplier getSupplierById(int supplierId);
}
