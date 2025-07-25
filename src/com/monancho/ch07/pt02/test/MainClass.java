package com.monancho.ch07.pt02.test;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Dog(); // 업 캐스팅
		animal.name = "바둑이";
		// animal.age = 4; // 자식 클래스의 필드는 접근 불가
		animal.sound();
		
		// **********************************************
		Dog dog;
		dog = (Dog)animal; // 다운 캐스팅
		dog.age = 10;
		dog.name = "멍멍이";
		dog.sound();
		
		Animal animal2 = new Animal(); // 인스턴스화 -> 실제 객체가 Animal 클래스로 만들어 짐
//		Dog dog2 = (Dog)animal2; // ClassCastingException 오류 발생
		// animal3.eat(); // 자식 메서드 접근불가 -> 오류발생!
		
		Animal animal3 = new Cat();
		// animal.eat(); // 자식 메서드 접근불가 -> 오류발생
		Cat cat = (Cat) animal3; // 다운 캐스팅
			cat.eat(); // 자식 메서드 접근 가능
			
		Dog dog3;
		if (animal instanceof Dog) {
			dog3 = (Dog) animal;
			dog3.sound();
		}
	 	}
	}
