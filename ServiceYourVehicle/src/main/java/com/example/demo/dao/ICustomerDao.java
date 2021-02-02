package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Customer;

public interface ICustomerDao extends JpaRepository<Customer,Integer>{

	Optional<Customer> findByUsername(String username);

	public Customer findByUsernameAndPassword(String tempUsername, String tempPass);

	
}
