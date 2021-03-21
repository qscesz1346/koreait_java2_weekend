package com.kita.second.level3.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList<Card>();

	public CardDeck() {
		init();
	}

	private void init() {
		// 반복문 사용하여 CardDeck인 arr 안에 중복되지 않게 Card타입 인스턴스 생성하여 집어넣기
		// 10, 11, 12, 13 전부 점수가 10
		for (int i = 0; i < Card.PATTERNS.length; i++) {
			String pattern = Card.PATTERNS[i];
			for (int z = 1; z < 14; z++) {
				String denomination = getDeno(z);
				int point = z;
				if(z > 10) {
					point = 10;
				}
				Card c = new Card(pattern, denomination, point);
				arr.add(c);
			}
		}
	}

	// 1~13
	private String getDeno(int num) {
		switch (num) {
		case 1:
			return "A";
		case 11:
			return "J";
		case 12:
			return "Q";
		case 13:
			return "K";
		default :
			return String.valueOf(num);
		}
		// 1이면 A
		// 11이면 J
		// 12면 Q
		// 13이면 K
		// 나머지는 숫자값 그대로 리턴
	}

	public Card getCard() {
		// 0~list의 크기보다 1 작은
		// 값까지 중 한 값을 랜덤으로 뽑아서
		// list에서는 삭제
		// return 뽑은값
		int rIdx = (int) (Math.random() * arr.size());
		Card c = arr.remove(rIdx);
		return c;
//		return arr.remove(rIdx);
	}

	@Override
	public String toString() {
		String str = "";
		for (Card c : arr) {
			str += (c + "\n");
		}
		return str;
	}

}
