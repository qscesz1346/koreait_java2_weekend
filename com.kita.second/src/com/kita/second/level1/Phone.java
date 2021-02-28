package com.kita.second.level1;

public class Phone {
	// 필드(속성)
	private String phoneName;
	private String owner;
	private String color;
	private int memory;
	private String phoneNumber;

	void setColor(String color) {
		this.color = color;
	}

	void setMemory(int memory) {
		this.memory = memory;
	}

	void setOwner(String owner) {
		this.owner = owner;
	}

	String getColor() {
		return color;
	}

	int getMemory() {
		return memory;
	}

	String getOwner() {
		return owner;
	}

	// 생성자
	// 생성자가 정의되지 않았을 때만!! 컴파일러가 기본 생성자 넣어줌
	public Phone() {
	}

	public Phone(String phoneName, String color, int memory) {
//			phoneName = name;
		this.phoneName = phoneName;
		this.color = color;
		this.memory = memory;
	}

	// Phone
	public Phone(String phoneName, String owner, String color, int memory, String phoneNumber) {
		this.phoneName = phoneName;
		this.owner = owner;
		this.color = color;
		this.memory = memory;
		this.phoneNumber = phoneNumber;
	}

	// 메소드(동작)
	// call(타입 person)
	// person에게 전화를 건다.
	void call(String person) {
		System.out.println(person + "에게 전화를 건다.");
	}

	// message(String person) {}
	// person에게 owner가 문자를 보낸다.
	void message(String person) {
		System.out.printf("%s에게 %s가 문자를 보낸다.", person, owner);
	}

//	리턴타입 메소드명(매개변수) {}
}
