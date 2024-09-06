package com.nit.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	
	@Autowired
	private LocalTime lt;

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:: 0-Arg constructor");
	}

	public String generateMessage(String user) {
		int hour = lt.getHour();
		if (hour < 12)
			return "Good Mng ::" + user;
		else if (hour < 16)
			return "Good aftnoon ::" + user;
		else if (hour < 20)
			return "Good evening ::" + user;
		else
			return "Good night ::" + user;
	}

}
