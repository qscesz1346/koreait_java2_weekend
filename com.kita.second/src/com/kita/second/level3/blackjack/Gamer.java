package com.kita.second.level3.blackjack;

import java.util.LinkedList;
import java.util.List;

public class Gamer {
	// Gamer의 덱
	private List<Card> arr;
	
	// arr 안에 LinkedList 인스턴스 들어가는
	// Gamer 생성자 작성
	public Gamer() {
		arr = new LinkedList<Card>();
	}
	
	// Gamer의 덱 안에 카드 한 장씩 추가하는 메소드
	public void receiveCard() {
		Card c = new Card();
		arr.add(c);
	}
	
	// Gamer의 덱에 있는 카드 전체 출력하는 메소드
	public void openCard() {
		
	}
	
	// Gamer의 덱에 있는 카드 전체 점수 리턴하는 메소드
	public int getTotalPoint() {
		return;
	}
	
	// 게이머가 그만둘 때까지 카드를 더 받는 메소드
	public void moreCards() {
		
	}
	
}
