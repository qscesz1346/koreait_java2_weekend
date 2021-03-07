package com.kita.second.level2;

public class Animal extends Object {
	String name;
	int age;
	private String type;
	
	public Animal() {}
	public Animal(String name) {
		this.name = name;
	}

	void cry() {
		System.out.printf("%s(이)가 운다.\n", name);
	}
	
	private void method() {}
	
	
	
}
