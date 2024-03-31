package com.springboot.learning.calculator;

import org.springframework.stereotype.Component;

@Component
public class Subtraction {

	
//
//	private long a,b;
//	
//	public Subtraction(long a, long b) {
//		this.a=a;
//		this.b=b;
//	}
	
	public long sub(long a,long b) {
		return a-b;
	}
}
