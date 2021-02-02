package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.ServicingType;

public interface IServicingTypeService {

	List<ServicingType> getAllServicingType();
	Optional<ServicingType> findByType(String Type);
	ServicingType addNewServicingType(ServicingType newtype);
	/*ServicingType updateServicingTypeDetails(int id, ServicingType oldDetails);*/
	ServicingType updateServicingTypeDetails(ServicingType oldDetails);
	ServicingType deleteServicingType(int typeId);
}
