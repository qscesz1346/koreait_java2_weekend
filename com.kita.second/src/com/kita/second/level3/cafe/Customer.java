package com.kita.second.level3.cafe;

import java.util.Scanner;

public class Customer {
	public MenuItem order(Menu m) {
		m.showMenus();
		
		Scanner scan = new Scanner(System.in);
		MenuItem mi = null;
		
		while(mi == null) {
			m.choose(scan.nextInt());
			
			
			break;
		}
		scan.close();
		return mi;
	}

	void drinkCoffee(Coffee c) {
		String name = c.getName();
		System.out.println(name + "(을)를 마신다.\n");
	}
	
	
	
	
	
	
	
		
}