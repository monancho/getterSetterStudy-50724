package com.monancho.ch07.pt02.test;

public class Dog extends Animal {
	int age; // 개나이

	@Override
	public void sound() { // 오버 라이딩
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}
}
