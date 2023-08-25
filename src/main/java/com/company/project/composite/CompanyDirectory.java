package com.company.project.composite;

import java.util.ArrayList;
import java.util.List;

// advanced component
// Composite – Composite stores child components and implements child related operations in the component interface.

public class CompanyDirectory implements Employee {
	private List<Employee> employeeList = new ArrayList<Employee>();

	@Override
	public void showEmployeeDetails() {
		for (Employee emp : employeeList) {
			emp.showEmployeeDetails();
		}
	}

	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}

	public void removeEmployee(Employee emp) {
		employeeList.remove(emp);
	}
}