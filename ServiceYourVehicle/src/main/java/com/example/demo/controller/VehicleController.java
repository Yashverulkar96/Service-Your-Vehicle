/*package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.pojo.Vehicle;
import com.example.demo.service.IVehicleService;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

	@Autowired
	private IVehicleService Service;
	
	public VehicleController() {
		System.out.println("In the Constructor "+getClass().getName());
	} 
	@GetMapping
	public ResponseEntity<?> allVehicle() {
		System.out.println("in the"+getClass().getName());
		List<Vehicle> vehicles= Service.allVehicle();
		if(vehicles.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
			return new ResponseEntity<>(vehicles,HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?>getVehicle(@PathVariable int id){
		System.out.println("in the "+getClass().getName());
		Optional<Vehicle>vehicle=Service.findById(id);
		
		if(vehicle.isPresent())
			return new ResponseEntity<>(vehicle.get(),HttpStatus.OK);
		
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping
	public ResponseEntity<?>addVehicle(@RequestBody Vehicle entry)
	{
		System.out.println("in the "+getClass().getName());
		try {
			Vehicle vehicle =Service.addVehicle(entry);
			return new ResponseEntity<>(vehicle,HttpStatus.OK);
		}
		catch(RuntimeException e)
		{
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?>updateVehicle(@PathVariable int id, @RequestBody Vehicle vehicle)
	{
		System.out.println("in the "+getClass().getName());
		try {
			Vehicle  v=Service.updateVehicle(id, vehicle);
			return new ResponseEntity<>(v,HttpStatus.OK);
		}catch(RuntimeException e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public Vehicle deleteVehicle(@PathVariable int id) {
		System.out.println("in the "+getClass().getName());
		return Service.deleteVehicle(id);
	}
}
*/