package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.pojo.Staff;
import com.example.demo.service.IStaffService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/staffs")
public class StaffController {

	@Autowired 
	private IStaffService staffService;
	
	
	/*@GetMapping
	public ResponseEntity<?> listAllStaff()
	{
		System.out.println("in the "+getClass().getName());
		List<Staff> allStaff=staffService.getAllStaff();
		if(allStaff.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		return new ResponseEntity<>(allStaff, HttpStatus.OK);
	}
	*/
	
	@GetMapping("/{userName}")
	public ResponseEntity<?> getStaffDetails(@PathVariable String userName)
	{
		System.out.println("in the "+getClass().getName());
		Optional<Staff> staffDetails = staffService.findByUsername(userName);
		if(staffDetails.isPresent())
			return new ResponseEntity<>(staffDetails, HttpStatus.OK);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
  /*@PostMapping
	public ResponseEntity<?> addNewStaff(@RequestBody Staff newStaff)
	{
		System.out.println("in the "+getClass().getName());
		try {
			Staff newlyAdded = staffService.addNewStaff(newStaff);
			return new ResponseEntity<>(newlyAdded, HttpStatus.OK);
		}catch(RuntimeException e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	*/
	
	/*@PutMapping("/{staffId}")
	public ResponseEntity<?> updateStaff(@PathVariable int staffId,@RequestBody Staff oldDetails)
	{
		System.out.println("in the "+getClass().getName());
		try {
			Staff updatingDetails=staffService.updateStaffDetails(staffId, oldDetails);
			return new ResponseEntity<>(updatingDetails, HttpStatus.OK);
		}catch(RuntimeException e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}*/
	
	@DeleteMapping("/{staffId}")
	public ResponseEntity<?> deleteStaff(@PathVariable int staffId)
	{
		System.out.println("in the "+getClass().getName());
		try {
			staffService.deleteStaff(staffId);
		return new ResponseEntity<>(HttpStatus.OK);
		}
			catch(RuntimeException e)
		{
		e.printStackTrace();
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	@PostMapping("/login")
    @CrossOrigin(origins = "http://localhost:4200")
    public Staff loginCustomer(@RequestBody Staff staff)throws Exception{
   	 String tempUsername=staff.getUsername();
   	 String tempPass=staff.getPassword();
   	 
   	Staff staffobj= null;
   	 if(tempUsername !=null && tempPass!=null) {
   		staffobj=staffService.fetchStaffByUsernameAndPassword(tempUsername, tempPass);
   	 }
   	 if(staffobj == null) {
   		 throw new Exception("Bad credential");
   	 }
   	 return staffobj;
    }
	

}
