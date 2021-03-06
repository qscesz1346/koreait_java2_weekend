package com.kita.second.level2;

public class Animal extends Object {
	String name;
	int age;

	public Animal(String name) {
		this.name = name;
	}

	void cry() {
		System.out.printf("%s(이)가 운다.\n", name);
	}

}
