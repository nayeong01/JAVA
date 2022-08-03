package com.ezdesign.java;

public class CastingTest1 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // 조상타입 <- 자손타입   car = (Car)fe; 에서 형변환이 생략된 상태이다.
//		car.water(); Car 타입의 참조변수로는 water()를 호출할 수 없다.
		fe2 = (FireEngine)car; // 자손타입 <- 조상타입
		fe2.water();
	}
}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water!!!");
	}
}

