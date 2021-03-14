package com.kita.second.level3.cafe;

public class Menu {
	private String name;
	private int price;
	
	public Menu() {}
	
	public Menu(MenuItem mi) {
		name = mi.getName();
		price = mi.getPrice();
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
