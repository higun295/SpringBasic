package com.example.tv3;

public class TVUser {

	public static void main(String[] args) {
		// 컨테이너를 생성한다.
		BeanContainer container = new BeanContainer();
		
		// 컨테이너로부터 객체를 검색(Lookup)한다.
		TV tv = (TV) container.getBean(args[0]);
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}