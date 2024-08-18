package com.aakritiracompany.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(DemoApplication.class, args);


		// Test t = context.getBean("bean1",Test.class);
		// System.out.println(t.abc());

		String s = context.getBean(String.class);
		System.out.println(s);

		MyServices ms = context.getBean(MyServices.class);
		System.out.println(ms.getS());
		System.out.println(ms.getSinT());

		// Test t = new Test();
		// System.out.println(t.abc());

	}



	
}
