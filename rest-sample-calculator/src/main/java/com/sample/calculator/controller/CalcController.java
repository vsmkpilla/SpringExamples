package com.sample.calculator.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.calculator.calservice.CalService;

import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;

@RestController
public class CalcController {
	
	private CalService calc;
	
	@RequestMapping("/add")
	public String add2Numbers(@RequestBody Request r) {
		return 
	}

}
