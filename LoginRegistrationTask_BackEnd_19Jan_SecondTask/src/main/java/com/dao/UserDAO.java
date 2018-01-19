package com.dao;

import com.model.User;

public interface UserDAO {
	
		public User show(String email);
		public void persist(User user);
		
		
}
