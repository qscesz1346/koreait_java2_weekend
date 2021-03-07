package com.kita.second.level2;

public class Adventurer {
//	필드
	int strength;
	int dexterity;
	int intellegence;
	int luck;
	int hp;

//	생성자
//	기본스텟 전부 10으로 맞추기
	public Adventurer() {
		strength = 10;
		dexterity = 10;
		intellegence = 10;
		luck = 10;
		hp = 10;
	}

	public Adventurer(int strength, int dexterity, int intellegence, int luck, int hp) {
		this.strength = strength;
		this.dexterity = dexterity;
		this.intellegence = intellegence;
		this.luck = luck;
		this.hp = hp;
	}

//	메소드
	void attack() {
		System.out.println("일반 공격을 한다.");
	}

	void jump() {
		System.out.println("점프를 한다.");
	}
}
