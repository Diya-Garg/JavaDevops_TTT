package com.LoginRegistrationTask_BackEnd;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.config.AppConfig;
import com.dao.UserDAO;
import com.daoImpl.UserDAOImpl;
import com.model.User;

public class App 
{
    public static void main( String[] args )
    {
     /* Scanner sc=new Scanner(System.in);
       System.out.println("Enter the email address u want to search : ");
       String email=sc.next();
       
       UserDAO userDAO=new UserDAOImpl();
       User user=userDAO.show(email);
       System.out.println(user);
       
       sc.close();*/
    	
    AbstractApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
    UserDAO obj=(UserDAO)context.getBean("userDAO");
    
    
    User user=new User();
    user.setUserName("Divya Garg");
    user.setPassword("Divya123");
    user.setAddress("Modinagar");
    user.setPhoneNumber("8789786765");
    user.setCountry("India");
    user.setEmail("divya@niit.com");
    
    obj.persist(user);
    System.out.println("User saved succesfully...");
    }
}
