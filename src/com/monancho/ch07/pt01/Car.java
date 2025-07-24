package com.monancho.ch07.pt01;

public class Car {
	String carName; // 차 이름
	String carSize; // 차 사이즈
	int carPrice; // 차 가격
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(String carName, String carSize, int carPrice) {
		super();
		this.carName = carName;
		this.carSize = carSize;
		this.carPrice = carPrice;
	}
	
	public void carMetHod () {
		System.out.println("\n차 이름: " + carName  +"\n차 사이즈: "+ carSize + "\n차 가격: "+ carPrice + "\n");
	}
	
}
