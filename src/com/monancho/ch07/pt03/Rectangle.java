package com.monancho.ch07.pt03;

public class Rectangle extends Shape{
	
	private int width;
	private int height;
	
	
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int width, int height) {
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
		return (double) width * height;
		
	
	}
	@Override
	public void getColor(String color) {
		System.out.println("사각형 색: " + color);
		
	}
	
}
