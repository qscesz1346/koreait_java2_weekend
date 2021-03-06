package com.kita.second.level1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		Korean yj = new Korean("대한민국");
//		System.out.println(yj.nation);
//		yj.nation = "미국";

//		Korean ms = new Korean("미국");
//		System.out.println(ms.nation);
//		ms.nation = "한국";

		Scanner sc = new Scanner(System.in);

		ClassEx cl = new ClassEx();
//		int result = ClassEx.sum(3, 8, 4, 1, 2, 6, 7, 3, 1);
		int result = cl.sum(3, 8, 4, 1, 2, 6, 7, 3, 1);
		// int[] arr = {3, 8, 4, 1, 2, 6, 7, 3, 1};
		System.out.println("result: " + result);
		int result2 = cl.sum(4, 5, 9, 5, 6, 4, 3);
		System.out.println("result2: " + result2);



	
//		final LEN = 3;
//		LEN = 3;
	}
}
