package com.test;

public class Developer {

	private String name;
	private String lastName;
	private double salary;
	private int age;
	
	public Developer() {
		
	}
	public Developer(String name, String lastName, double salary, int age) {
		super();
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.lastName = lastName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
