package com.list.dependent.bean;

public class Address {
	private int hno;
	private String street;
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int hno, String street, String city) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + "]";
	}
}
