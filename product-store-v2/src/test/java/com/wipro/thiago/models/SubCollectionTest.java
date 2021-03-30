package com.wipro.thiago.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubCollectionTest {

	@Test 
	void should_ReturnNotNull_When_InstantiateSubCollection(){
		
		//given
		
		SubCollection collection;
		
		
		//when
		
		collection = new SubCollection("Hot books", "Sub collection of books", null);
		
	
		//then
		
		assertNotNull(collection);
		
	}

}
