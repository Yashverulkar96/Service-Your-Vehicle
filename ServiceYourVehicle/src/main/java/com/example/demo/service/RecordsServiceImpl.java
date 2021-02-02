package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IRecordsDao;
import com.example.demo.pojo.Records;

@Service
@Transactional
public class RecordsServiceImpl implements IRecordsService {

	@Autowired
	private IRecordsDao recordsDao;
	
	
	@Override
	public List<Records> listAllRecords() {
		
		return recordsDao.findAll();
	}

	@Override
	public Optional<Records> findByRecordId(int id) {
		
		return recordsDao.findById(id);
	}

	@Override
	public Records addRecord(Records entry) {
		
		return recordsDao.save(entry);
	}

	@Override
	public Records updateRecordDetails(int recordId, Records oldDetails) {
		Optional<Records> checkPresence=recordsDao.findById(recordId);
		if(checkPresence.isPresent())
		{
			Records updatedDetails=checkPresence.get();
			updatedDetails.setBillingDate(oldDetails.getBillingDate());
			updatedDetails.setTotalCost(oldDetails.getTotalCost());
			updatedDetails.setStatus(oldDetails.getStatus());
			updatedDetails.setBookingDate(oldDetails.getBookingDate());
			updatedDetails.setProblemDescription(oldDetails.getProblemDescription());
			
			return updatedDetails;
		}
		return null;
	}

	@Override
	public Records deleteRecord(int id) {
		// TODO Auto-generated method stub
		 recordsDao.deleteByRecordId(id);
		 return null;
	}
	

}
