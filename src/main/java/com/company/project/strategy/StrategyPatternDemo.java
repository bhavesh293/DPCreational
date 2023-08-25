package com.company.project.strategy;

public class StrategyPatternDemo {
	
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd()); // create context with strategy
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5)); // call execute strategy with arguments

		context = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
