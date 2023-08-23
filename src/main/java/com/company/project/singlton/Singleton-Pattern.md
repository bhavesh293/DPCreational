# Singlton Pattern

## There are many objects we only need one of: 

thread pools, 
caches, 
dialog boxes, 
objects that handle preferences and registry settings, 
objects used for logging, and 
objects that act as device drivers to devices like printers and graphics cards.

Singleton Pattern is a time-tested method for ensuring only
one object gets created. The Singleton Pattern also gives us a global point of access, just like a
global variable, but without the downsides.

## STEP 1 : Make constructor private, so no one can instantiate using constructor.

public MyClass {
	private MyClass() {}
}

## STEP 2 : Make static method getInstance which returns the Object by calling MyClass.getInstance()

public MyClass {
	public static MyClass getInstance() { // its a class method
	}
}

## STEP 3: Add Static variable and Method as below.

public class Singleton {
	private static Singleton uniqueInstance;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
		uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
}	
## STEP 4 : If you have multiple thread is accessing getInstance method

# Add synchronized keyword in the method as below.

public static synchronized Singleton getInstance()

# OR ELSE

a. create object instance eagerly rather than lazily with static variable initialized while declaring it.

private static Singleton uniqueInstance = new Singleton();

b. No need for null check in getInstance method. 

public static Singleton getInstance() {
return uniqueInstance;
} 	

## OO Patterns
Observer - defines a one-to-many
dependency between objects so that
when one object changes state, all its
dependents are notified and updated
automatically

Decorator - Attach additional
responsibilities to an object dynamically.
Decorators provide a flexible
alternative to subclassing for extending
functionality.

Abstract Factory - Provide an
interface for creating families of
related or depedent objects without
specifying their concrete classes.

Factory Method - Define an
interface for creating an object, but
let subclasses decide which class to
instantiate. Factory Method lets
a class defer instantiation

## OO principles

Encapsulate what varies.
Favor composition over inheritance.
Program to interfaces, not
implementations.
Strive for loosely coupled designs between objects that interact.
Classes should be open for extension but closed for modification.
Depend on abstractions. Do not depend on concrete classes.	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}