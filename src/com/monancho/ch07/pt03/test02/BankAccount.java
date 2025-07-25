package com.monancho.ch07.pt03.test02;

public class BankAccount {
	
	private double balance;
	
	
	
	public double getBalance() {
		return balance;
	}



	public void setBalance(double balance) {
		if (balance > 0) {
			this.balance = balance;
			} else System.out.println("음수 입력 불가능");
	}



	public void printNum() {
		System.out.println("첫번째 수: " + balance );
	}
	
	
}
