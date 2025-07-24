package com.monancho.ch07.pt01;

public class Bus extends Car{
	String license;
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Bus(String license) {
		super();
		this.license = license;
	}

	
	
	
	

	public Bus(String carName, String carSize, int carPrice) {
		super(carName, carSize, carPrice);
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String carName, String carSize, int carPrice, String license) {
		super(carName, carSize, carPrice);
		this.license = license;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void carMetHod() {
		// TODO Auto-generated method stub
		System.out.println("\n 차 이름: " + carName  +"\n차 사이즈: "+ carSize + "\n차 가격: "+ carPrice + "\n라이센스: " + license + "\n");
	}
	
	
	
}
