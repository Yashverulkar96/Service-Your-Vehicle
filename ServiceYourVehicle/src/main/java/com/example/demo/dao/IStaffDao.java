package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Staff;

public interface IStaffDao extends JpaRepository<Staff,Integer> {

	Optional<Staff> findByUsername(String username);

	public Staff findByUsernameAndPassword(String tempUsername, String tempPass);
}
