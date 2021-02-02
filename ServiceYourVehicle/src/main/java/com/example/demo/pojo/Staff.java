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
@Table(name="Staff")
public class Staff {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="staff_id")
		private int staffId;
		private String username;
		private String password;
		private String name;
		@Column(name="phone_number")
		private String phoneNumber;
		
	
		@JsonIgnore
		@OneToMany(mappedBy="staffId")
		private List<Records> recordId;
		
		public Staff() {
			System.out.println("In the Constructor "+getClass().getName());
		}

		public int getStaffId() {
			return staffId;
		}

		public void setStaffId(int staffId) {
			this.staffId = staffId;
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

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public List<Records> getRecordId() {
			return recordId;
		}

		public void setRecordId(List<Records> recordId) {
			this.recordId = recordId;
		}

			
		
}
