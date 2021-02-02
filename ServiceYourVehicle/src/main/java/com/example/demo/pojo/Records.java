package com.example.demo.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name="Records")
public class Records {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="record_id")
	private int recordId;

	@Column(name="billing_date")
	private LocalDate billingDate;
	
	@Column(name="total_cost")
	private int totalCost;
	
	private String status;
	
	@ManyToOne //@JoinColumn not required as we are not changing column name
	@JoinColumn(name="customer_id")
	private Customer customerId;
	
	
	@ManyToOne
	@JoinColumn(name="vehicle_id")
	private Vehicle vehicleId;
	
	@ManyToOne
	@JoinColumn(name="service_id")
	private ServicingType serviceId;
	
	@ManyToOne
	@JoinColumn(name="staff_id")
	private Staff staffId;
	
	
	/*@OneToOne
	@JoinColumn(name="spareId")
	private SparePart spareId;
	*/
	@Column(name="booking_date")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate bookingDate;
	
	@Column(length=500,name="problem_description")
	private String problemDescription;
	
	
	
	public Records() {
		System.out.println("In the Constructor "+getClass().getName());
	}



	public int getRecordId() {
		return recordId;
	}



	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}



	public LocalDate getBillingDate() {
		return billingDate;
	}



	public void setBillingDate(LocalDate billingDate) {
		this.billingDate = billingDate;
	}



	public int getTotalCost() {
		return totalCost;
	}



	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Customer getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}



	public Vehicle getVehicleId() {
		return vehicleId;
	}



	public void setVehicleId(Vehicle vehicleId) {
		this.vehicleId = vehicleId;
	}



	public ServicingType getServiceId() {
		return serviceId;
	}



	public void setServiceId(ServicingType serviceId) {
		this.serviceId = serviceId;
	}



	public Staff getStaffId() {
		return staffId;
	}



	public void setStaffId(Staff staffId) {
		this.staffId = staffId;
	}

	/*public SparePart getSpareId() {
		return spareId;
	}

	public void setSpareId(SparePart spareId) {
		this.spareId = spareId;
	}
*/


	public LocalDate getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}



	public String getProblemDescription() {
		return problemDescription;
	}



	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}
	
	
	
}

		
	