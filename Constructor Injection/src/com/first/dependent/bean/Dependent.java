package com.first.dependent.bean;

public class Dependent {
	private String job;
	private int salary;
	public Dependent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dependent(String job, int salary) {
		super();
		this.job = job;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Dependent [job=" + job + ", salary=" + salary + "]";
	}
	
}
