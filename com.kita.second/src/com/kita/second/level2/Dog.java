package com.kita.second.level2;

public class Dog extends Animal { // 자식extends부모 클래스상속
	boolean cutiness;

	public Dog(String name) {
		super(name); // Animal(name);
//		super.name = "흰둥이";
//		super.age = 1;
		this.age = 10;
		this.cutiness = true;
//		super.type = "";
//		super.method();
	}
	
//	Overriding
	@Override // 필수
	void cry() {
		System.out.println("개가 운다.");
	}

	void bark() {
		System.out.println("개가 짖는다.");
	}

}
