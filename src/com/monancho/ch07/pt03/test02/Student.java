package com.monancho.ch07.pt03.test02;

public class Student extends Person {
	
	

	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요 저는 학생입니다.");
	}
	
}
