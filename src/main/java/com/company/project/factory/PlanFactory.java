package com.company.project.factory;

/*
 * This class is the Factory (creator) class
 * 
 * which creates the concrete classes(products)
 *  
 */
class PlanFactory{  
      
		// getPlan method is called factory method.because it creates object of 
	 	// product i.e. Plan
       public Plan getPlan(String planType){  
            if(planType == null){  
             return null;  
            }  
          if(planType.equalsIgnoreCase("DOMESTICPLAN")) {  
                 return new DomesticPlan();  
               }   
           else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){  
                return new CommercialPlan();  
            }   
          else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {  
                return new InstitutionalPlan();  
          }  
      return null;  
   }  
} 
