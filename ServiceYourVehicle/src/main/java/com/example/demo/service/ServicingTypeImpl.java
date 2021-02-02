package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.dao.IServicingTypeDao;
import com.example.demo.pojo.ServicingType;

@Service
@Transactional
public class ServicingTypeImpl implements IServicingTypeService {


	@Autowired
	private IServicingTypeDao stDao;
	
	@Override
	public List<ServicingType> getAllServicingType() {
		
		return stDao.findAll();
	}

	@Override
	public Optional<ServicingType> findByType(String type) {
		
		return stDao.findByType(type);
	}

	@Override
	public ServicingType addNewServicingType(ServicingType newtype) {
	
		return stDao.save(newtype);
	}

	/*@Override
	public ServicingType updateServicingTypeDetails(int id, ServicingType oldDetails) {
		
		Optional<ServicingType> checkPresence=stDao.findByServiceId(id);
		if(checkPresence.isPresent())
		{
			ServicingType updatedDetails=checkPresence.get();
			updatedDetails.setType(oldDetails.getType());
			updatedDetails.setPrice(oldDetails.getPrice());
			updatedDetails.setTime(oldDetails.getTime());
						
			return updatedDetails;
		}
		return null;
		
	}*/
	
	@Override
	public ServicingType updateServicingTypeDetails(ServicingType oldDetails) {
		
		Optional<ServicingType> checkPresence=stDao.findByServiceId(oldDetails.getServiceId());
		if(checkPresence.isPresent())
		{
						
			return stDao.save(oldDetails);
		}
		return null;
		
	}
	
	

	@Override
	public ServicingType deleteServicingType(int Id) {
		stDao.deleteById(Id);
		return null;
	}

}
