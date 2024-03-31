package com.springboot.learning.calculator;

import org.springframework.stereotype.Component;

@Component
public class Addition {
//
//	private long a,b;
//	
//	public Addition(long a, long b) {
//		this.a=a;
//		this.b=b;
//	}
	
	public long add(long a,long b) {
		return a+b;
	}
	
}
