package com.ezdesign.java;

public class BindingTest2 {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		Child1 c = new Child1();
		
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println("c.x = "+c.x);
		c.method();
	}
}

class Parent1{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child1 extends Parent1{} // Child 클래스에 아무런 멤버 정의가 안되어 있다.
							   // 이처럼 멤버가 중복으로 정의하지 않았을 대는 참조변수의 타입에 따른 변화가 없다.
							   // 조상클래스의 멤버변수와 같은 이름의 멤버변수를 자손 클래스에 중복해서 정의한 경우에만 결과가 달라진다.