package com.dao;


import com.model.User;

public interface UserDAO {
	
	void register(User user);
	User validateUser(String userName,String userPass);
}
