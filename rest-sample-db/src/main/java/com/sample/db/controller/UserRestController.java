package com.sample.db.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.db.entity.UserDetails;
import com.sample.db.service.UserService;

@RestController
public class UserRestController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/insert")
	public UserDetails insert(@RequestParam long id,@RequestParam String name, @RequestParam String city) {
		return userService.insertDB(new UserDetails(id,name,city));
	}

	@PostMapping("/insert")
	public UserDetails insertWithBody(@RequestBody UserDetails user) {
		return userService.insertDB(user);
	}
}
	
	


