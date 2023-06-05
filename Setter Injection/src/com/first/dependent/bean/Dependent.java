package com.first.dependent.bean;

public class Dependent {
	private String job;
	private int salary;
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Dependent [job=" + job + ", salary=" + salary + "]";
	}
}
