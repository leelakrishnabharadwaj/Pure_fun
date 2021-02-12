package com.lkb.alpha.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lkb.alpha.models.Customer;
import com.lkb.alpha.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public JSONObject login(String user_name, String password)
	{
		JSONObject jo = new JSONObject();
		Customer customer = customerRepository.findUserById(user_name, password) ;
		if(customer != null)
		{
			jo.put("Message","Successful");
			jo.put("name",customer.getName());
		}
		else
			jo.put("Message", "Unsuccessful");
		return jo;
		
	}
	
	public String createCustomer(Customer customer)
	{
		customerRepository.save(customer);
		return "Success";
	}

	public List<String> getDetails(String username) {
		List<String> details = new ArrayList<>();
		Optional<Customer> customer = customerRepository.findById(username);
		if(customer != null)
		{
			Customer c = customer.get();
			details.add(c.getName());
			details.add(c.getMobile_number());
			details.add(c.getUser_name());
			
		}
		else
		{
			details.add("Failed to retive data");
		}
		
		return details;
	}
	
	
	

}
