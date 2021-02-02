/*package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ISparePartDao;
import com.example.demo.pojo.SparePart;

@Service
@Transactional
public class SparePartServiceImpl implements ISparePartService {

	@Autowired
	private ISparePartDao spareDao;
	
	@Override
	public List<SparePart> getAllSparePart() {
		
		return spareDao.findAll();
	}

	@Override
	public Optional<SparePart> findByPartName(String name) {
		
		return  spareDao.findByPartName(name);
	}

	@Override
	public SparePart addNewSparePart(SparePart newSparePart) {
		
		return spareDao.save(newSparePart);
	}

	@Override
	public SparePart updateSparePartDetails(int sparePartId, SparePart oldDetails) {
	
		Optional<SparePart> checkPresence=spareDao.findById(sparePartId);
		if(checkPresence.isPresent())
		{
			SparePart updatedDetails=checkPresence.get();
			updatedDetails.setCompanyName(oldDetails.getCompanyName());
			updatedDetails.setPartName(oldDetails.getPartName());
			updatedDetails.setPrice(oldDetails.getPrice());
			updatedDetails.setWarranty(oldDetails.getWarranty());
			
			
			return updatedDetails;
		}
		return null;
	}

	@Override
	public SparePart deleteSparePart(int sparePartId) {
		spareDao.deleteById(sparePartId);
		return null;
	}
	
	
	
	
	

		
	
}*/
