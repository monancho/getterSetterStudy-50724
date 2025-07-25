package com.monancho.ch07.pt03;

public class Triangle extends Shape{

	private int width;
	private int height;
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (double) width * height * 0.5;
		
		
		
	}

	@Override
	public void getColor(String color) {
		// TODO Auto-generated method stub
		System.out.println("삼각형 색: " + color);
	}
	
	
	
	
	
	
	
	
}
