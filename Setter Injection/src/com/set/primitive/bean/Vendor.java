package com.set.primitive.bean;

import java.util.HashSet;
import java.util.Set;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private Set<String> customers= new HashSet<>();
	
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

	public Set<String> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<String> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", customers=" + customers + "]";
	}
}
