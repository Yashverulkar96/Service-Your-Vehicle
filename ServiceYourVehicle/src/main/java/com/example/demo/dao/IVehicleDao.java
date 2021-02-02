package com.example.demo.dao;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pojo.Vehicle;

public interface IVehicleDao extends JpaRepository<Vehicle,Integer> {

	Optional<Vehicle>findByVehicleId(int id);
}
