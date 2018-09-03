package com.capgemini.day3.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day3.Employee;

public class EmployeeTest {
	Employee employee;

	@BeforeEach
	void setUp() {
		employee = new Employee(1234, "John Doe", 10000, 5000);
	}
	
	@Test
	void testcalculateNetSalary1() {
        assertEquals(18600.00,employee.calculateNetSalary(),0.03);
	}
	
	@AfterEach
	void tearDown() {
		employee = null;
	} 

}
