package com.sample.calculator.calservice;

import com.sample.calculator.entity.Calc;

public class CalService implements Calc {

	@Override
	public long add(long a, long b) {
		
		return a+b;
	}

	@Override
	public long sub(long a, long b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public long mul(long a, long b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public long div(long a, long b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	

}
