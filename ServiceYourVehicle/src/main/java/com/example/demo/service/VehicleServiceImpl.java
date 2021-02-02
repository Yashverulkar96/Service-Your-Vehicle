package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.custException.NotFound;
import com.example.demo.dao.IVehicleDao;
import com.example.demo.pojo.Vehicle;

@Service
@Transactional
public class VehicleServiceImpl implements IVehicleService {
	
	@Autowired
	private IVehicleDao dao;
	
	@Override
	public List<Vehicle> allVehicle() {
		System.out.println("in the "+getClass().getName());
		return	dao.findAll();
	}
	
	@Override
	public Optional<Vehicle>findById(int id){
		return dao.findByVehicleId(id);
		
	}
	
	@Override
	public Vehicle addVehicle(Vehicle entry) {
		return dao.save(entry);
	}
	/*@Override
	public Vehicle updateVehicle(int id,Vehicle vehicle) {
		Optional<Vehicle> v = dao.findById(id);
		
		if(v.isPresent()) {
			Vehicle v1=v.get();
			v1.setModel(vehicle.getModel());
			v1.setNumberPlate(vehicle.getNumberPlate());
			v1.setVehicleCompany(vehicle.getVehicleCompany());
			return v1;
		}
		throw new NotFound("Vehicle not found");
	}*/
	
	@Override
	public Vehicle updateVehicle(Vehicle vehicle) {
		System.out.println("in vehicle update impl service"+ vehicle.getVehicleId());
		Optional<Vehicle> v = dao.findById(vehicle.getVehicleId());
		
		if(v.isPresent()) {
			/*Vehicle v1=v.get();
			v1.setModel(vehicle.getModel());
			v1.setNumberPlate(vehicle.getNumberPlate());
			v1.setVehicleCompany(vehicle.getVehicleCompany());*/
			return dao.save(vehicle);
		}
		throw new NotFound("Vehicle not found");
	}
	
	@Override
	public Vehicle deleteVehicle(int id) {
		dao.deleteById(id);
			return null;
		}
	}
