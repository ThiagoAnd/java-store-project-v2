package com.wipro.thiago.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PantsTest {

	@Test 
	void should_ReturnNotNull_When_InstantiatePants(){
		
		//given
		
		Pants pant;
		
		
		//when
		
		pant = new Pants("Green", "Male", "Sport", "Cotton", "35");
		
	
		//then
		
		assertNotNull(pant);
		
	}

}
