package com.cc._00_ArrayList;

public class Employee {
	private int empID;
	private String Name;
	private double salary;
	public Employee(int empID, String name, double salary) {
		super();
		this.empID = empID;
		Name = name;
		this.salary = salary;
	}
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", Name=" + Name + ", salary=" + salary + ", getEmpID()=" + getEmpID()
				+ ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}
	

}
