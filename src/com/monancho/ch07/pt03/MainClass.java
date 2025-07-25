package com.monancho.ch07.pt03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Shape shape = new Shape(); // 추상 클래스 -> 메모리에 객체를 생성할 수 없다.
		
		Rectangle rec = new Rectangle(10, 20); // 생성자로 초기화
		System.out.println("사각형의 넓이: " + rec.getArea());
		
		Circle cir = new Circle();
		cir.setRadius(10); // setter로 초기화
		System.out.println("원의 넓이: " + cir.getArea());
		
		
		Shape shape = new Triangle(20, 10); // 업캐스팅
		System.out.println( shape.getArea());
		
		Triangle tri02;
		tri02 = (Triangle)shape;
		
		System.out.println(tri02.getArea());
		
	}

}
