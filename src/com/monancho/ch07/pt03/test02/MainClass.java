package com.monancho.ch07.pt03.test02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Piano piano = new Piano();		
		piano.play();
		
		Guitar guitar = new Guitar();
		guitar.play();
		
		
		Developer developer = new Developer();
		developer.work();
		
		Designer designer = new Designer();
		designer.work();
		
		Bus bus = new Bus();
		bus.stop();
		bus.move();
		
		Truck truck = new Truck();
		truck.stop();
		truck.move();
		
		Laptop laptop = new Laptop();
		laptop.turnOff();
		laptop.turnOn();
		
		Desktop desktop = new Desktop();
		desktop.turnOff();
		desktop.turnOn();
		
		Student student = new Student("홍길동");
		student.sayHello();
		student.printHi();
				
				
	}

}
