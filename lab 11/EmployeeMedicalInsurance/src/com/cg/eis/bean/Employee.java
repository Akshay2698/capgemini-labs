package com.cg.eis.bean;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	private String designation;
	private String insuranceScheme;
	public Employee() {}
	public Employee(int id, String name, int salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	
	public String toString()
	{
		return id+"\t"+name+"\t"+salary+"\t"+designation+"\t"+insuranceScheme;
	}
	

}
