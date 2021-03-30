package com.wipro.thiago.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainCollectionTest {

	@Test 
	void should_ReturnNotNull_When_InstantiateSubCollection(){
		
		//given
		
		MainCollection collection;
		
		
		//when
		
		collection = new MainCollection("Books", "Main collection of books", null);
		
	
		//then
		
		assertNotNull(collection);
		
	}
	
}
