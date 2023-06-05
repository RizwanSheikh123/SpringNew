package com.list.dependent.bean;

import java.util.ArrayList;
import java.util.List;

public class Vendor {
	private int id;
	private String name;
	private List<Address> addresses = new ArrayList<>();
	public Vendor() {
		// TODO Auto-generated constructor stub
	}
	public Vendor(int id, String name, List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", addresses=" + addresses + "]";
	}
	
}
