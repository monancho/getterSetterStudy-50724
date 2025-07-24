package com.monancho.ch07.pt01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck("트럭","중간", 2000);
		SportsCar sportCar = new SportsCar("스포츠카", "작음", 8000);
		Bus bus = new Bus("버스","큼",5000, "대형 1종");
		
		truck.carMetHod();
		sportCar.carMetHod();
		bus.carMetHod();
		System.out.println("===================");
		
		Rectangle rectangle = new Rectangle(20, 10);
		Triangle triangle = new Triangle(20, 10);
		Circle circle = new Circle(15);
		
		System.out.println("\n사각형 너비: " + rectangle.shapeValue());
		System.out.println("삼각형 너비: " + triangle.shapeValue());
		System.out.println("원 너비: " + circle.shapeValue() + "\n");
		
		System.out.println("===================");
		
		Student student = new Student();
		Solider solider = new Solider();
		Employee employee = new Employee();
		
		student.personvalue("홍길동", "학생");
		solider.personvalue("김유신", "군인", 210);
		employee.personvalue("전우치", "종업원", 180);
		
		System.out.println("===================");
		
		Dog dog = new Dog("바둑이","개","멍멍");
		Cat cat = new Cat("슈퍼울트라짱쎈캡숑타이거 2세","고양이","야옹");
		Tiger tiger = new Tiger("나비", "호랑이", "어흥");
		
		dog.bark();
		cat.bark();
		tiger.bark();
	}

}
