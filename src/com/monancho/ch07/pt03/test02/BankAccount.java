package com.monancho.ch07.pt03.test02;

public class BankAccount {
	int numA;
	int numB;
	
	public BankAccount() {
		super();
	}
	public BankAccount(int numA, int numB) {
		super();
		this.numA = numA;
		this.numB = numB;
	}
	public int getNumA() {
		return numA;
	}
	public void setNumA(int numA) {
		if (numA > 0) {
		this.numA = numA;
		} else System.out.println("음수 입력 불가능");
	}
	public int getNumB() {
		return numB;
	}
	public void setNumB(int numB) {
		if (numB > 0) {
			this.numB = numB;
			} else System.out.println("음수 입력 불가능");
	}
	
	
	public void printNum() {
		System.out.println("첫번째 수: " + numA + "두번째 수: " + numB);
	}
	
	
}
