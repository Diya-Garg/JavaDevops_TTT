package com.daoImpl;

import java.util.ArrayList;
import java.util.List;
import com.dao.UserDAO;
import com.model.User;

public class UserDAOImpl implements UserDAO {
	
	static List<User> users=new ArrayList<>();
	
	public UserDAOImpl(){
		users.add(new User("Divya Garg","divya123","9878677656","divya@niit.com","Modinagar","India"));
		users.add(new User("Nidhi Agarwal","nidhi123","8878677656","nidhi@niit.com","Delhi","India"));
		users.add(new User("Vineet Agarwal","vineet123","7878677656","vineet@niit.com","Delhi","India"));
		users.add(new User("Vasu Agarwal","vasu123","8888677656","vasu@niit.com","Modinagar","India"));
		users.add(new User("Sagar Garg","sagar123","900077656","sagar@niit.com","Ghaziabad","India"));
	}

	@Override
	public User show(String email) {
		User userObj=null;
		for(User user:users){
			if(user.getEmail().equals(email)){
				userObj=user;
			}
			
		}
		return userObj;
	}
	
	
}
