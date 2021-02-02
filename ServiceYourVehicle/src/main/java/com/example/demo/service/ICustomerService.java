package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Customer;

public interface ICustomerService {
	
	List<Customer> getAllCustomers();
	Optional<Customer> findUserDetails(String username);
	Customer addNewCustomer(Customer newCustomer);
	/*Customer updateCustomerDetails(int cutomerId, Customer oldDetails);*/
	Customer updateCustomerDetails(Customer oldDetails);
	Customer deleteCustomer(int customerId);
	Customer fetchCustomerByUsernameAndPassword(String tempUsername, String tempPass);
}
