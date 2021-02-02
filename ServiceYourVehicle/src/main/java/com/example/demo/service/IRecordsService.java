package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Records;

public interface IRecordsService {
	List<Records> listAllRecords();
	Optional<Records> findByRecordId(int id);
	Records addRecord(Records entry);
	Records updateRecordDetails(int recordId,Records oldDetails);
	Records deleteRecord(int id);
	
}
