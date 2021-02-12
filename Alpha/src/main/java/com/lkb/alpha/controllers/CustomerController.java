package com.lkb.alpha.controllers;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lkb.alpha.dao.LoginDAO;
import com.lkb.alpha.models.Customer;
import com.lkb.alpha.services.CustomerService;

@RestController
@RequestMapping("/customer")
@CrossOrigin("http://localhost:4200")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping("/createCustomer")
	public String createCustomer(@RequestBody Customer customer)
	{
		return customerService.createCustomer(customer);
	}
	@RequestMapping("/login")
	public JSONObject login(@RequestBody LoginDAO logindao)
	{
		return customerService.login(logindao.getUsername(), logindao.getPassword());
	}
	
	@RequestMapping("/Register")
	
	public String register(@RequestBody Customer customer)
	{
		
		return customerService.createCustomer(customer);
		
	}
	
	@RequestMapping("/getUserDetails")
	public List<String> getDetails(@PathVariable String username)
	{
		return customerService.getDetails(username);
	}
	

	

}
