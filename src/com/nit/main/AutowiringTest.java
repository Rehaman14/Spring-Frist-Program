package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.WishMessageGenerator;

public class AutowiringTest {
	public static void main(String[] args) {
		System.out.println("AutowiringTest.main()==>start");
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("AutowiringTest :: IOC container creation completed");
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		String msg = generator.generateMessage("Raj");
		System.out.println("Result is " + msg);
		System.out.println("AutowiringTest.main()==>End");
	}
}
