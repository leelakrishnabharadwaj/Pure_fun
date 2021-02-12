package com.lkb.alpha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.lkb.alpha.models.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,String>{
	
	@Query(value = "Select * from Customer where user_name = ?1 and password = ?2", nativeQuery = true )
	public Customer findUserById(String user_name, String password);


}
