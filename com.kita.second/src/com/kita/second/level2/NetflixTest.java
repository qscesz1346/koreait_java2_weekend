package com.kita.second.level2;

public class NetflixTest {
	public static void main(String[] args) {
		ProGamer hong = new ProGamer();
		Game gm = new Game();
		BattleGround bg = new BattleGround();
		Overwatch ow = new Overwatch();

		hong.work(gm);
		hong.work(bg);
		hong.work(ow);

//		Viewer rv = new Viewer();
//		rv.chooseNew();
	
		
		
		
		
		
	}
}
//Drama d1 = new Drama(2);
//Movie m1 = new Movie(3);
//Movie m2  = new Movie(4);
//Viewer rv2 = new Viewer(d1, m1, m2); 