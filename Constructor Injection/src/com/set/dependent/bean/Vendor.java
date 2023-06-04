package com.set.dependent.bean;

import java.util.HashSet;
import java.util.Set;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private Set<Customer> customers = new HashSet<>();

	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vendor(int vendorId, String vendorName, Set<Customer> customers) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
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
