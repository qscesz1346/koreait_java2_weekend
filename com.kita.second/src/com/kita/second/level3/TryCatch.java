package com.kita.second.level3;

import java.util.Scanner;

public class TryCatch {
	public static void main(String[] args) {
		int[] arr = new int[2];
//		try {
////			에러가 날 수 있는 코드
//			System.out.println(arr[2]);
//		} catch(NullPointerException e) {
//			System.out.println("NullPointer 예외가 발생했습니다.");
//		} catch(Exception e) {
////			예외 발생 시 처리 코드
//			System.out.println("예외가 발생했습니다.");
//		}
////		finally {
////			System.out.println("예외처리구간끝");
////		}
//		System.out.println("다음코드");

		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.print("숫자를 입력하시오.");
//		int num = scan.nextInt();
//		String strNum = scan.next();
//		num = Integer.parseInt(strNum);
		
		
//		ㅇㅇ 오류가 발생했습니다. <- 2개 있음
//		다른 모든 예외의 경우 -> 알 수 없는 오류가 발생했습니다.
		String strNum = scan.next();
		try {
			num = Integer.parseInt(strNum);
			arr[2] = num;	
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException 오류가 발생했습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 오류가 발생했습니다.");
		} catch(Exception e) {
			System.out.println("알 수 없는 오류가 발생했습니다.");
		} finally {
			System.out.println("예외처리구간 끝");
		}
		
		
		
		
		
		
	}
}
