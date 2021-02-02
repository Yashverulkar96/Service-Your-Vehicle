package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICustomerDao;
import com.example.demo.pojo.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerDao custDao;

	@Override
	public List<Customer> getAllCustomers() {
		
		return custDao.findAll();
	}

	@Override
	public Optional<Customer> findUserDetails(String userName) {
		
		return custDao.findByUsername(userName);
	}

	@Override
	public Customer addNewCustomer(Customer newCustomer) {
		
		return custDao.save(newCustomer);
	}

	/*@Override
	public Customer updateCustomerDetails(int customerId, Customer oldDetails) {
		
		Optional<Customer> checkPresence=custDao.findById(customerId);
		if(checkPresence.isPresent())
		{
			Customer updatedDetails=checkPresence.get();
			updatedDetails.setAddress(oldDetails.getAddress());
			updatedDetails.setName(oldDetails.getName());
			updatedDetails.setPhoneNumber(oldDetails.getPhoneNumber());
			updatedDetails.setUsername(oldDetails.getUsername());
			updatedDetails.setPassword(oldDetails.getPassword());
			
			
			return updatedDetails;
		}
		return null;
		
	}*/
	
	
	
	
	
	
	
	@Override
	public Customer updateCustomerDetails(Customer oldDetails) {
		
		Optional<Customer> checkPresence=custDao.findById(oldDetails.getCustomerId());
		if(checkPresence.isPresent())
		{
			/*Customer updatedDetails=checkPresence.get();
			updatedDetails.setAddress(oldDetails.getAddress());
			updatedDetails.setName(oldDetails.getName());
			updatedDetails.setPhoneNumber(oldDetails.getPhoneNumber());
			updatedDetails.setUsername(oldDetails.getUsername());
			updatedDetails.setPassword(oldDetails.getPassword());*/
			
			
			return custDao.save(oldDetails);
		}
		return null;
		
	}

	@Override
	public Customer deleteCustomer(int customerId) {
		custDao.deleteById(customerId);
		return null;
	}

	@Override
	public Customer fetchCustomerByUsernameAndPassword(String tempUsername, String tempPass) {
		
		return custDao.findByUsernameAndPassword(tempUsername,tempPass);
	}
	
	
	
}
