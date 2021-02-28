package com.kita.second.level1;

public class Phone {
	// 필드(속성)
	String phoneName;
	String owner;
	String color;
	int memory;
	String phoneNumber;

	// ������
	// �����ڰ� ���ǵ��� �ʾ��� ����!! �����Ϸ��� �⺻ ������ �־���
	public Phone() {
	}

	public Phone(String phoneName, String color, int memory) {
//			phoneName = name;
		this.phoneName = phoneName;
		this.color = color;
		this.memory = memory;
	}

	// Phone�� ��� �ʵ忡 �ʱⰪ�� �־��ִ� ������ �����
	public Phone(String phoneName, String owner, String color, int memory, String phoneNumber) {
		this.phoneName = phoneName;
		this.owner = owner;
		this.color = color;
		this.memory = memory;
		this.phoneNumber = phoneNumber;
	}

	// �޼ҵ�(����)
	// call(Ÿ�� person)
	// person���� ��ȭ�� �Ǵ�.
	void call(String person) {
		System.out.println(person + "���� ��ȭ�� �Ǵ�.");
	}

	// message(String person) {}
	// person���� owner�� ���ڸ� ������.
	void message(String person) {
		System.out.printf("%s���� %s�� ���ڸ� ������.", person, owner);
	}

//		����Ÿ�� �޼ҵ��(�Ű�����) {}
}
