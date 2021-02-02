package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAdminDao;
import com.example.demo.pojo.Admin;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService {

	

	@Autowired
	private IAdminDao dao;
	
	@Override
	public List<Admin> showAllAdmin() {
		System.out.println("in the "+getClass().getName());
		return	dao.findAll();
	}
	
	@Override
	public Optional<Admin>findByName(String username){
		return dao.findByName(username);
	}
	
	@Override
	public Admin addAdmin(Admin entry) {
		return dao.save(entry);
	}
	
	@Override
	public Admin updateAdminDetails(int adminId, Admin oldDetails) {
		Optional<Admin> checkPresence=dao.findById(adminId);
		if(checkPresence.isPresent())
		{
			Admin updatedDetails=checkPresence.get();
			updatedDetails.setPassword(oldDetails.getPassword());
			updatedDetails.setName(oldDetails.getName());
			updatedDetails.setPhoneNumber(oldDetails.getPhoneNumber());
			updatedDetails.setUsername(oldDetails.getUsername());
			
			
			return updatedDetails;
		}
		return null;
	}

	@Override
	public Admin deleteAdmin(int id) {
		dao.deleteById(id);
		return null;
	}
	
	@Override
	  public Admin fetchAdminByUsernameAndPassword(String username,String password){
		  return dao.findByUsernameAndPassword(username, password);
	  }

}
