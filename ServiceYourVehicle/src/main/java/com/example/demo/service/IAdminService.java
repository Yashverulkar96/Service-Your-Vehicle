package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Admin;

public interface IAdminService {

	List<Admin> showAllAdmin();
	Optional<Admin>findByName(String username);
	Admin addAdmin(Admin entry);
	Admin updateAdminDetails(int adminId, Admin oldDetails);
	Admin deleteAdmin(int id);
	
	Admin fetchAdminByUsernameAndPassword(String username, String password);
}
