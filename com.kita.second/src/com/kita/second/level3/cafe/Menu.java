package com.kita.second.level3.cafe;

public class Menu {
	private MenuItem[] arr = new MenuItem[4];
	
	public Menu() {
		arr[0] = new MenuItem("아메리카노", 2000);
		arr[1] = new MenuItem("카페라떼", 2300);
		arr[2] = new MenuItem("카페모카", 2500);
		arr[3] = new MenuItem("카라멜마끼아또",2600);
	}
	
	public void showMenus () {
		System.out.println("\t--MENU--");
		for (int i = 0; i < arr.length; i++) {
			MenuItem mi = arr[i];
//			System.out.printf("%s\t\t%,원", mi.getName(), mi.getPrice());

//			String menuLine = mi.toString();
//			System.out.println(menuLine);
			
			System.out.printf(i+1+".\t"+mi.toString()+"\n");
		}
	}
	
	public MenuItem choose(int idx) {
		return arr[idx];
	}
	
	
}
