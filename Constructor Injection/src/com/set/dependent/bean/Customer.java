package com.set.dependent.bean;

public class Customer {
	private int customerId;
	private String customerName;
	private String CustomerAddress;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String customerAddress) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		CustomerAddress = customerAddress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", CustomerAddress="
				+ CustomerAddress + "]";
	}
	
}
