package com.kita.second.level1.baseball;

import java.util.Scanner;

public class MyBall {
//	내가 숫자값 입력하고 예외 처리하는 클래스
//	필드
	private int[] myArr;
	private Scanner scan;
	
	public MyBall(int gameCnt) {
		myArr = new int[gameCnt];
		scan = new Scanner(System.in);
	}
	
	// 메소드
	// 숫자를 입력받기 setNumbers()
	// 내 배열안의 숫자값 뽑기 getMyNum()
	
	void setNumbers() {
		int max = 9;
		int min = 1;
		for (int i = 0; i < myArr.length; i++) {
			System.out.printf("값%d: \n", i+1);
			myArr[i] = scan.nextInt();
			if (myArr[i] < min || myArr[i] > max) {
				System.out.println("범위 밖의 숫자입니다.");
				i--;
				continue;
			}
			for (int z = 0; z < i; z++) {
				if(myArr[i] == myArr[z]) {
					System.out.println("중복된 숫자입니다.");
					i--;
					break;
				}
			}
		}
		
		
	}
	
	int getMyNum(int idx) {
		return myArr[idx];
	}
	
	
	
}
