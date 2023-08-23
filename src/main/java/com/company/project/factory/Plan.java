package com.company.project.factory;
import java.io.*;      
/*
 * Plan is abstract class. 
 * DomesticPlan , CommercialPlan  and InstitutionalPlan are the concrete classses
 * that overrides :  getLatestRateFromDB() method.
 */
abstract class Plan{  
         protected double rate;  
         
         abstract double getLatestRateFromDB();  
   
         public void calculateBill(int units){  
             rate =  getLatestRateFromDB();
        	 System.out.println(units*rate);  
          }  
}
