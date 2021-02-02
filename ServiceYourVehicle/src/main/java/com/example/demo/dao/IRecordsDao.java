package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.pojo.Records;

public interface IRecordsDao extends JpaRepository<Records, Integer>
{
	Optional<Records> findByRecordId(int id);

	void deleteByRecordId(int id);
	
}
