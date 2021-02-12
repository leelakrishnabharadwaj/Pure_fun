package com.lkb.alpha.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int id;
	
	private String name;
	private String mobile_number;
	private String password;
	private String user_name;
	
	public Customer()
	{
		
	}
	
	public Customer(int id, String name, String mobile_number, String password, String user_name) {
		super();
		this.id = id;
		this.name = name;
		this.mobile_number = mobile_number;
		this.password = password;
		this.user_name = user_name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobile_number=" + mobile_number + ", user_name=" + user_name
				+ "]";
	}
	
	
	
	

}
