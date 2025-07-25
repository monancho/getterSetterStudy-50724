package com.monancho.ch07.pt02;

import com.monancho.ch07.pt01.Solider;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a;
		int b = 10;
		a = b; // 자동 형변환
		b = (int) a; // 강제 형변환
		
		

//		String c = "100";
//		int d = Interger.parseInt(c);
		
		Person person = new Person();
		Student student = new Student();
		Solider solider = new Solider();	
	
		person = student; // 부모는 자식의 모든것을 받아준다
		student = (Student)person;
//		solider = student;
		
		
		
		Car myCar = new Car();
		
		myCar.carName = "소나타";
		myCar.year = 2010;
		
		myCar.frontTire = new KumoTire();
		myCar.rearTire = new HankkookTire();
		
		HankkookTire hanTire = new HankkookTire();
		KumoTire kumTire = new KumoTire();
		
		myCar.tirePrint(hanTire);
		myCar.tirePrint(kumTire);
	}
}
