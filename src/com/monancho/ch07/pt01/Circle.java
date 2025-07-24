package com.monancho.ch07.pt01;

public class Circle extends Shape{
	int radius;
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	

	@Override
	public double shapeValue() {
		// TODO Auto-generated method stub
		return radius * radius * PI;
	}
	
	
	
	
	
}
