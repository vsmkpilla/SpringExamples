package com.spring.learning.stereotypeannotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MySqlDataService implements DataService{

	@Override
	public void Calculate() {
		System.out.println("Calculating in MySqlDataService");
		
	}

}
