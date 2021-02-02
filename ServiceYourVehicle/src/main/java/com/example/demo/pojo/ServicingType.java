package com.example.demo.pojo;

import java.time.LocalTime;
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
@Table(name="ServicingType")
public class ServicingType {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column(name="service_id")
		private int serviceId;
		private String type;
		private int price;
		private LocalTime time;
		
		@JsonIgnore
		@OneToMany(mappedBy="serviceId")
		private List<Records> recordId;
		
		
		public ServicingType() {
			System.out.println("In the Constructor "+getClass().getName());
		}


		public int getServiceId() {
			return serviceId;
		}


		public void setServiceId(int serviceId) {
			this.serviceId = serviceId;
		}


		public String getType() {
			return type;
		}


		public void setType(String type) {
			this.type = type;
		}


		public int getPrice() {
			return price;
		}


		public void setPrice(int price) {
			this.price = price;
		}


		public LocalTime getTime() {
			return time;
		}


		public void setTime(LocalTime time) {
			this.time = time;
		}


		public List<Records> getRecordId() {
			return recordId;
		}


		public void setRecordId(List<Records> recordId) {
			this.recordId = recordId;
		}
	
		
		
}
