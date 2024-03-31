package com.springboot.learning.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	
	
	private Addition a;
	
	private Subtraction s;
	public Calculator(Addition a, Subtraction s) {
		super();
		this.a = a;
		this.s = s;
	}
	
	public void Calculate(long aValue,long bValue) {
		System.out.println("Addition:"+a.add(aValue, bValue));
		System.out.println("Subtraction:"+s.sub(aValue, bValue));
	}
	

}
