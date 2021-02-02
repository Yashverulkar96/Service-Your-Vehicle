package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.pojo.Vehicle;

public interface IVehicleService {

	List<Vehicle>allVehicle();
	Optional<Vehicle>findById(int id);
	Vehicle addVehicle(Vehicle entry);
	/*Vehicle updateVehicle(int id,Vehicle vehicle);*/
	Vehicle updateVehicle(Vehicle vehicle);
	Vehicle deleteVehicle(int id);
	
}
