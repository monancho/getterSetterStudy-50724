package com.monancho.ch07.pt01;

public class Shape {
	final static double PI = 3.1425;
	int width;
	int hight;
	
	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shape(int width, int hight) {
		super();
		this.width = width;
		this.hight = hight;
	}
	
	public double shapeValue () {
		return width * hight;
		
	}
	
}
