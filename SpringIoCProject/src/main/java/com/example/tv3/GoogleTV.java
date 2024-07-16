package com.example.tv3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("tv")
@ComponentScan(basePackages = "hello")
public class GoogleTV implements TV {
	
	@Autowired //Type Injection
	private Speaker speaker;
	
	public GoogleTV() {
		System.out.println("===> GoogleTV(1) 생성");
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