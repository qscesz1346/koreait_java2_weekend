package com.kita.second.level3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

		list1.add("안녕"); // 삽입
		String result1 = list1.get(0); // 뽑아오기
		list1.set(0, "하이"); // 수정
//		String result2 = list1.remove(0);
		boolean result2 = list1.remove("하이"); // 삭제
		int len = list1.size(); // 리스트의 길이

		List<Dog> list2 = new LinkedList<Dog>();
//		list2 안에 각각 "누렁이", "흰둥이", "얼룩이" 이름 가진
//		멍멍이 세 마리 집어널기
//		list2 안에 든 멍멍이 이름들 출력
//		"얼룩이" 자리에 "까망이"라는 이름 가진 새 멍멍이 넣기
//		0번째 인덱스 값 list2에서 삭제		

		Dog d1 = new Dog("누렁이");
		Dog d2 = new Dog("흰둥이");
		Dog d3 = new Dog("얼룩이");
		list2.add(d1);
		list2.add(d2);
		list2.add(d3);
		for (int i = 0; i < list2.size(); i++) {
			Dog d = list2.get(i);
			String name = d.getName();
			System.out.println("댕댕이: " + name);
			System.out.println("댕댕이: " + list2.get(i).getName());
		}
		for(Dog val : list2) {
			Dog d = val;
			String name = d.getName();
			System.out.println("댕댕이: " + name);
			System.out.println("댕댕이: " + val.getName());
		}
		Dog d4 = new Dog("까망이");
		list2.set(2, d4);
		list2.remove(0);
		
//		list1에 좋아하는 음식 5개 이상 입력하기
//		for문(forEach문) 사용하여 list1 안의 값 출력
//		list1의 3번째 인덱스값을 싫어하는 음식으로 바꾸기
//		list1의 싫어하는 음식값을 출력하기
		
		
		
		
		
		
		
		
		
		
		

	}
}
