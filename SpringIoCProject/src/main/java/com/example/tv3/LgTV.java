package com.example.tv3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
	
	@Autowired
	private AppleSpeaker speaker;
	
	public LgTV() {
		System.out.println("===> LgTV 생성");
	}
	public void powerOn() {
		System.out.println("LgTV---전원 켠다.");
	}
	public void powerOff() {
		System.out.println("LgTV---전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
