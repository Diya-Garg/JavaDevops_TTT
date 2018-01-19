package com.LoginRegistrationTask_BackEnd;

import java.util.Scanner;

import com.dao.UserDAO;
import com.daoImpl.UserDAOImpl;
import com.model.User;

public class App 
{
    public static void main( String[] args )
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the email address u want to search : ");
       String email=sc.next();
       
       UserDAO userDAO=new UserDAOImpl();
       User user=userDAO.show(email);
       System.out.println(user);
       
       sc.close();
    }
}
