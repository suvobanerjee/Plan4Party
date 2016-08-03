package com.plan4party.vendor.pojo;

import java.sql.Timestamp;

public class Customer_request {
	
	
	int id,customerRegId,eventId,contactVia,vendorId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	Timestamp createdOn;
	public int getCustomerRegId() {
		return customerRegId;
	}
	public void setCustomerRegId(int customerRegId) {
		this.customerRegId = customerRegId;
	}
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	public int getContactVia() {
		return contactVia;
	}
	public void setContactVia(int contactVia) {
		this.contactVia = contactVia;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public Timestamp getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}
	
	

}
