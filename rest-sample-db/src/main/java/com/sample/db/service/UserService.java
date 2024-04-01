package com.sample.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.db.entity.UserDetails;
import com.sample.db.repo.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	public UserDetails insertDB(UserDetails user) {
		userRepo.save(user);
		return user;
	}

	
	
}
