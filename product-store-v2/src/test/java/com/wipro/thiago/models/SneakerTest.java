package com.wipro.thiago.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SneakerTest {

	@Test 
	void should_ReturnNotNull_When_InstantiateSneaker(){
		
		//given
		
		Sneaker sneaker;
		
		
		//when
		
		sneaker = new Sneaker("Yellow", "Male", 40, "Sport");
		
	
		//then
		
		assertNotNull(sneaker);
		
	}

}
