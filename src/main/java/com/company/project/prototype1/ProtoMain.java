package com.company.project.prototype1;

public class ProtoMain {
	
	public static void main(String[] args) {
		
		Shape s = new Circle(5);		
		System.out.println(s.toString());
		
		
		Shape s1 = (Shape) s.clone();
		s1.setPosition(1, 1);		
		System.out.println(s1.toString());
		
		
	}

}
