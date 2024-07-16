package com.example.tv3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {

	public static void main(String[] args) {
		// Spring 컨테이너를 생성한다.
		AnnotationConfigApplicationContext container = 
				new AnnotationConfigApplicationContext("com.example.tv3");
		// <context:component-scan base-package="com.example.tv3"/> 동일한 동작
		
		// 컨테이너로부터 객체를 검색(Lookup)한다.
		TV tv = (TV) container.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		// 컨테이너를 종료하면 컨테이너가 관리하던 모든 객체가 삭제된다.
		container.close();
	}
}