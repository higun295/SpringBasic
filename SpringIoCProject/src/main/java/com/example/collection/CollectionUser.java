package com.example.collection;

import java.util.Iterator;

import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionUser {

	public static void main(String[] args) {
		// Spring 컨테이너를 구동한다.
		GenericXmlApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 컨테이너로부터 사용할 객체를 Lookup 한다.
		CollectionBean bean = (CollectionBean) container.getBean("collection");
		
		String[] addressList = bean.getAddressList();
		System.out.println("[주소 목록]");
		for (String address : addressList) {
			System.out.println("---> " + address.toString());
		}
		
		// 컨테이너를 종료한다.
		container.close();
	}
}