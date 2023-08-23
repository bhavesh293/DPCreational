package com.company.project.prototype;

public class Circle implements Shape{
	private int x;
	private int y;
	private int radius;
	
	public Circle(int r) {
		this.radius = r;
	}
	
	public Circle(Circle c) {
		this.radius = c.radius;
	}
	
	@Override
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	public Shape copy() {
		
		return new Circle(this);
	}

	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	
	
}
