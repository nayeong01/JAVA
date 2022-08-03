package com.ezdesign.java;

public class InstanceofTest {

	public static void main(String[] args) {
		FireEngine fe = new FireEngine(); // 인스턴스 타입이 FireEngine인데도 
		
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		
		if (fe instanceof Car) {
			System.out.println("This is an Car instance."); // 이것도 출력되고,
		}
		
		if (fe instanceof Object) {
			System.out.println("This is an Object instance."); // 이것 또한 출력된다. 왜?
															   // 왜냐면 FireEngine은 이 둘의 자식클래스이기 때문이다. 
		}
		System.out.println(fe.getClass().getName()); // 클래스의 이름을 출력
	}
}
		// 어떤 타입에 대한 instance연산의 결과가 true라는 것은 검사한 타입으로 형변환이 가능하다는 것을 뜻한다.
		// 여기서는 Car, Object 형변환이 가능하다.