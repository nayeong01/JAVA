package com.ezdesign.java;

public class BindingTest {

	public static void main(String[] args) {
		Parent p = new Child(); 
		Child c = new Child();
		// 서로 타입은 다르지만 같은 인스턴스를 참조하고 있다.
		
		System.out.println("p.x = "+p.x); // Child 인스턴스를 참조했지만, 참조변수 x는 Parent 클래스의 것을 사용한다.
		p.method(); //메서드는 참조한 인스턴스의 메서드를 사용한다.
		System.out.println("c.x = "+c.x); // 여기도 Child 클래스의 참조변수 x를 사용한다.
		c.method(); // 메서드는 참조한 인스턴스의 메서드를 사용한다.

	}
}
class Parent{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{ 
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}