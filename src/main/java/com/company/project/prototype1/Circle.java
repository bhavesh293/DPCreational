package com.company.project.prototype1;

public class Circle extends Shape{
	private int x;
	private int y;
	private int radius;
	
	public Circle(int r) {
		this.radius = r;
	}
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", radius=" + radius + "]";
	}
	
	
}
