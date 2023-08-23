package com.company.project.singlton;

public class SingletonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2)
			System.out.println("objects are identicle");
		else
			System.out.println("objects are not identicle");
		
	}

}
