package com.kita.second.level1;

import java.util.Scanner;

public class PhoneTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		�⺻�� ����
//		char : ��ĭ  ���ڷ� ��ȯ �� 0
//		������ : 0
//		boolean : false
//
//		������ ����
//		null
		
		Phone myPhone = new Phone();
		myPhone.color = "�Ķ�";
		myPhone.phoneName = "������ 12";
		myPhone.owner = "�ڿ���";
		myPhone.memory = 512;
		
		Phone p1 = new Phone("������ s20", "����", 256);
		
		myPhone.call("����");
		
		Phone yourPhone = new Phone();
		
		
		
		
		
	}
}
