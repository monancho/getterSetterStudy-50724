package com.monancho.ch07.pt02;

public class TireMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tire tire;
		
		tire = new KumoTire();
		

	 //	tire.tireComPanyKumo -> 자식 빌드인 tireCompanyKumo는 사용 불가
		//Tire tire2 = new Tire();
		KumoTire kumho2;
		kumho2 = (KumoTire) tire; // 강제 형변환

		kumho2.tireName(); // 부모 필드 사용가능
		
	}

}
