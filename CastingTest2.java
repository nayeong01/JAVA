package com.ezdesign.java;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car(); //에러를 나지 않게 하려면 Car car = new FireEngine();으로 변경해야 된다.
		Car car2 = null;
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; // 조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지 않는다.
		fe.drive();
		car2 = fe;
		car2.drive();

	}

}
