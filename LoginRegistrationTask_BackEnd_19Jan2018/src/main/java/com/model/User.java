package com.model;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;
	private String phoneNumber;
	private String email;
	private String address;
	private String country;
	
	public User(){
		
	}
	
	
	
	public User(String userName, String password, String phoneNumber, String email, String address, String country) {
		super();
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.country = country;
	}



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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}



	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", address=" + address + ", country=" + country + "]";
	}
	
	
	
	
}
