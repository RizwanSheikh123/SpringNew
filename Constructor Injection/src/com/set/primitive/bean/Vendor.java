package com.set.primitive.bean;

import java.util.HashSet;
import java.util.Set;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private Set<String> customers= new HashSet<>();
	public Vendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vendor(int vendorId, String vendorName, Set<String> customers) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", customers=" + customers + "]";
	}
}
