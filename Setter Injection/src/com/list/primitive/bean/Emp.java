package com.list.primitive.bean;

import java.util.ArrayList;
import java.util.List;

public class Emp {
	private int id;
	private String name;
	private List<String> degree = new ArrayList<>();
	
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

	public List<String> getDegree() {
		return degree;
	}

	public void setDegree(List<String> degree) {
		this.degree = degree;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", degree=" + degree + "]";
	}
}
