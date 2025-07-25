package com.monancho.ch07.pt02;

public class Car {
	
	String carName;
	int maxSpeed;
	int year;
	int carPrice;
	
//	Tire frontTire = new KumoTire(); // 앞 바퀴
//	Tire rearTire = new HankkookTire(); // 뒷 바퀴
	
	Tire frontTire;
	Tire rearTire;
	
	// 매개변수에 인수로 금호타이어가 들어오면 -> 금호, 한국 타이어가 들어오면 한국으로 출력하는 메소드
	public void tirePrint(Tire tire) { 
		//타이어 이름을 출력
		tire.tireName();
	}
}
