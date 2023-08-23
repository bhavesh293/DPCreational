package com.company.project.factory;

import java.io.*;

class FactoryMain {
	public static void main(String args[]) throws IOException {
		
		// Multiple plans are created by this Plan factory
		PlanFactory planFactory = new PlanFactory();

		// Read PLAN and UNIT from USER INPUT - System.in
		System.out.print("Enter the name of plan \n"
				+ "DOMESTICPLAN, COMMERCIALPLAN, INSTITUTIONALPLAN: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String planName = br.readLine();
		System.out.print("Enter the number of units: ");
		int units = Integer.parseInt(br.readLine());

		
		// Calling the factory method - getPlan() by passing planName
		Plan p = planFactory.getPlan(planName);
		

		System.out.print("Bill amount for " + planName + " of  " + units + " units is: ");
		
		// calculateBill -  will print the bill amount.
		p.calculateBill(units);  
	}
}
