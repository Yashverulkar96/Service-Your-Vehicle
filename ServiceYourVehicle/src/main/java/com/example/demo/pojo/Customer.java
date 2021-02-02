package com.example.demo.pojo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="Customer")
public class Customer {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="customer_id")
		private int customerId;
	
		private String username;
		private String password;
		private String name;
		private String address;

		@Column(name="phone_number")
		private String phoneNumber;
		
		// as bidirectional mapping is use @Json will help to--
		//@JsonIgnore //it will not show vehicle details 
		@OneToMany(mappedBy ="customerId")//so that extra column of foreign key will apper in vehicle table
		private List<Vehicle> vehicleId;
		
	
		@JsonIgnore  //it will not show order details 
		@OneToMany(mappedBy="customerId")
		private List<Records> recordId;
		
		
		public Customer() {
			System.out.println("In the Constructor "+getClass().getName());
		}


		public int getCustomerId() {
			return customerId;
		}


		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getPhoneNumber() {
			return phoneNumber;
		}


		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}


		public List<Vehicle> getVehicleId() {
			return vehicleId;
		}


		public void setVehicleId(List<Vehicle> vehicleId) {
			this.vehicleId = vehicleId;
		}


		public List<Records> getRecordId() {
			return recordId;
		}


		public void setRecordId(List<Records> recordId) {
			this.recordId = recordId;
		}

		

	
}
