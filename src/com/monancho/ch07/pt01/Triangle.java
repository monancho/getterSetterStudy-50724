package com.monancho.ch07.pt01;

public class Triangle extends Shape {

	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int hight) {
		super(width, hight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double shapeValue() {
		// TODO Auto-generated method stub
		return super.shapeValue() * 0.5;
	}
	
	
	
}
