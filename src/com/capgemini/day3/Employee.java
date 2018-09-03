package com.capgemini.day3;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double grossSalary;
	private double netSalary;
	private double medical;
	private double hra;
	private double pf;
	
	public static final double PT = 200; 
	
	public Employee(int employeeId , String employeeName, double basicSalary, double medical) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public Employee() {
	}
	
	public double calculateNetSalary() {
		hra = 0.5*basicSalary;
	    pf = 0.12*basicSalary;
	    grossSalary = hra+basicSalary+medical;
	    netSalary=grossSalary-(pf+PT);
	    
		return netSalary;
		
	}
	public void displayEmployeeDetails() {
		System.out.println("Employee Id : " + employeeId + "\nEmployee name: " + employeeName +  
				"\nNet Salary: " + netSalary);
	}

	

}
