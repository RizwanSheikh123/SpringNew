package com.list.dependent.bean;

import java.util.ArrayList;
import java.util.List;

public class Emp {
	private int id;
	private String name;
	private List<Address> addresses = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", addresses=" + addresses + "]";
	}
}
