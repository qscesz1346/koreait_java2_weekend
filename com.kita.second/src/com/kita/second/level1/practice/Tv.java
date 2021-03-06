package com.kita.second.level1.practice;

public class Tv {
//	필드
//	전원(isPowerOn) 채널(channel) 볼륨(volume)
	private boolean ispowerOn;
	private int channel;
	private int volume;

//	생성자
//	기본값 전원 false, 채널 1, 볼륨 0
	public Tv() {
		ispowerOn = false;
		channel = 1;
		volume = 0;
	}

//	메소드
//	전원켜기(powerOn), 전원끄기(powerOff)
//	채널올리기(channelUp), 채널내리기(channelDown)
//	볼륨높이기(volumeUp), 볼륨낮추기(volumeDown)
	void powerOn() {
		if (ispowerOn) {
			System.out.println("전원이 이미 켜져있습니다.");
			return;
		}
		ispowerOn = true;
		System.out.println("전원을 킵니다.");
	}

	void powerOff() {
		if (!ispowerOn) {
			System.out.println("전원이 이미 꺼져있습니다.");
			return;
		}
		ispowerOn = false;
		System.out.println("전원을 끕니다.");
	}

	void channelUp() {
		channel++;
		System.out.println("채널을 올립니다.");
	}

	void channelDown() {
		if (channel < 2) {
			System.out.println("최소 채널입니다.");
			return;
		}
		channel--;
		System.out.println("채널을 내립니다");
	}

	void volumeUp() {
		volume++;
		System.out.println("볼륨을 올립니다.");
	}

	void volumeDown() {
		if (volume < 1) {
			System.out.println("최소 볼륨입니다.");
			return;
		}
		volume--;
		System.out.println("볼륨을 내립니다.");
	}

}
