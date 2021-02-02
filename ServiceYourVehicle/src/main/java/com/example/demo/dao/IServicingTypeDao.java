package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.pojo.ServicingType;

public interface IServicingTypeDao extends JpaRepository<ServicingType,Integer> {

	Optional<ServicingType> findByServiceId(int id);
	Optional<ServicingType> findByType(String Type);
	
	
}
