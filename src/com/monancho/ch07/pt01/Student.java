package com.monancho.ch07.pt01;

public class Student extends Person{

	
	
	public void personvalue(String name, String job) {
		// TODO Auto-generated method stub
		System.out.println("\n이름: " + name + "\n직업: " + job +"\n");
	}
	
	
	@Override
	public void personvalue(String name, String job, int pay) {
		// TODO Auto-generated method stub
		super.personvalue(name, job, pay);
	}

}
