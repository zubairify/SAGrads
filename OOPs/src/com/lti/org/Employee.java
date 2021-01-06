package com.lti.org;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	
	// Creating static variable for counter
	private static int counter = 1001;
	
	public Employee() {
	}

	public Employee(String empName, double salary) {
		this.empId = counter ++;	// Assigning counter to id and incrementing
		this.empName = empName;
		this.salary = salary;
	}
	
	public void payslip() {
		System.out.println("Emp ID: " + empId);
		System.out.println("Name: " + empName);
		System.out.println("Salary: " + salary);
	}

	public double getSalary() {
		return salary;
	}
}
