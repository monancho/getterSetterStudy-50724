package com.monancho.ch07.pt01;

public class Tiger extends Animal{

	
	
	public Tiger(String name, String value, String sound) {
		super(name, value, sound);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		super.bark();
		System.out.print(" 사육여부: 불가능");
	}
  
}
