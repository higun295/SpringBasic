package com.example.tv3;

import org.springframework.context.annotation.Bean;

// XML 파일을 대체하는 환경설정 클래스
public class TVConfiguration {
	
	public TVConfiguration() {
		System.out.println("===> TVConfiguration 생성");
	}
	
	@Bean // <bean id="tv" class="com.example.tv3.GoogleTV"/> 이것과 동일
	TV tv() { // 여기 이 method 이름이 bean의 id로 자동 부여
		GoogleTV tv = new GoogleTV();
		tv.setSpeaker(speaker());
		return tv;
	}

	Speaker speaker()  	{
		return new AppleSpeaker();
	}
}