package com.set.dependent.bean;

public class Customer {
	private int customerId;
	private String customerName;
	private String CustomerAddress;
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", CustomerAddress="
				+ CustomerAddress + "]";
	}
	
}
