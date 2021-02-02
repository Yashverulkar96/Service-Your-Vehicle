package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Admin;

public interface IAdminDao extends JpaRepository<Admin,Integer> {

	Optional<Admin>findByName(String username);

	public Admin findByUsernameAndPassword(String username,String password);
}
