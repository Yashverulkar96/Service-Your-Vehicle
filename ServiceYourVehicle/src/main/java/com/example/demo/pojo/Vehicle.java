package com.example.demo.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Vehicle")
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="vehicle_id")
	private int vehicleId;
	@Column(name="vehicle_company")
	private String vehicleCompany;
	private String model;
	@Column(name="number_plate")
	private String numberPlate;
	

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="customer_id")
	private Customer customerId; //foreign key column will appear only in Vehicle table
	
	@JsonIgnore
	@OneToMany(mappedBy="vehicleId")
	private List<Records> recordId;
		
	public Vehicle() {
	System.out.println("In the Constructor "+getClass().getName());
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleCompany() {
		return vehicleCompany;
	}

	public void setVehicleCompany(String vehicleCompany) {
		this.vehicleCompany = vehicleCompany;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNumberPlate() {
		return numberPlate;
	}

	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public List<Records> getRecordId() {
		return recordId;
	}

	public void setRecordId(List<Records> recordId) {
		this.recordId = recordId;
	}

	
}
