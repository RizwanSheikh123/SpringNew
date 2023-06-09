package com.set.dependent.bean;

import java.util.HashSet;
import java.util.Set;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private Set<Customer> customers = new HashSet<>();
	
	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public void display() {
		customers.forEach(cust->System.out.println(cust));
	}

	public void getVendorCustomer() {
		String str= "vendorId=" + vendorId + ", vendorName=" + vendorName ;
		display();
	}
}
