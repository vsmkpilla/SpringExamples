package com.spring.learning.stereotypeannotations;

import org.springframework.stereotype.Repository;

@Repository
public class MongoDBdataService implements DataService{

	@Override
	public void Calculate() {
		System.out.println("Calculating in MongoDBDataService");
		
	}

}
