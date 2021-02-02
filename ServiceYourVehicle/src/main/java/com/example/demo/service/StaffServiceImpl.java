package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IStaffDao;
import com.example.demo.pojo.Staff;

@Service
@Transactional
public class StaffServiceImpl implements IStaffService {

	
	@Autowired
	private IStaffDao staffDao;
	
	@Override
	public List<Staff> getAllStaff()
	{
		return staffDao.findAll();
	}
	
	@Override
	public Optional<Staff> findByUsername(String username) {
		
		return staffDao.findByUsername(username);
	}
	
	@Override
	public Staff addNewStaff(Staff newStaff) {
		
		return staffDao.save(newStaff);
	}
	
	/*@Override
	public Staff updateStaffDetails(int staffId, Staff oldDetails) {
		
		Optional<Staff> checkPresence=staffDao.findById(staffId);
		if(checkPresence.isPresent())
		{
			Staff updatedDetails=checkPresence.get();
			updatedDetails.setPassword(oldDetails.getPassword());
			updatedDetails.setName(oldDetails.getName());
			updatedDetails.setPhoneNumber(oldDetails.getPhoneNumber());
			updatedDetails.setUsername(oldDetails.getUsername());
			
			
			return updatedDetails;
		}
		return null;
		
	}*/
	
	@Override
	public Staff updateStaffDetails( Staff oldDetails) {
		System.out.println("in staff update impl service"+ oldDetails.getStaffId());
		Optional<Staff> checkPresence=staffDao.findById(oldDetails.getStaffId());
		if(checkPresence.isPresent())
		{/*
			Staff updatedDetails=checkPresence.get();
			updatedDetails.setPassword(oldDetails.getPassword());
			updatedDetails.setName(oldDetails.getName());
			updatedDetails.setPhoneNumber(oldDetails.getPhoneNumber());
			updatedDetails.setUsername(oldDetails.getUsername());
			*/
			
			return staffDao.save(oldDetails);
		}
		return null;
		
	}
	
	
	
	@Override
	public Staff deleteStaff(int staffId) {
		staffDao.deleteById(staffId);
		return null;
	}

	@Override
	public Staff fetchStaffByUsernameAndPassword(String tempUsername, String tempPass) {
		
		return staffDao.findByUsernameAndPassword(tempUsername, tempPass);
	}

	
}
