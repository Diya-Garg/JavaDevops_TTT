package com.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {
	

	@NotEmpty
	private String userName;
	
	@Size(min=2,max=12)
	private String password;
	
	@NotEmpty
	private String firstName;
	
	@NotEmpty
	private String lastName;
	
	@NotEmpty @Email
	private String email;
	
	@NotEmpty
	@Size(min=10)
	private String phone;

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String
			phone) {
		this.phone = phone;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	
}
