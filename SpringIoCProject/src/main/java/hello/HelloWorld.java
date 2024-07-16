package hello;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	public HelloWorld() {
		System.out.println("===> HelloWorld 생성");
	}
}
