package com.example.tv3;

public class GoogleTV implements TV {
	private Speaker speaker;
	
	public GoogleTV() {
		System.out.println("===> GoogleTV(1) 생성");
	}
	public GoogleTV(Speaker speaker) {
		System.out.println("===> GoogleTV(2) 생성");
		this.speaker = speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public void powerOn() {
		System.out.println("GoogleTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("GoogleTV---전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}