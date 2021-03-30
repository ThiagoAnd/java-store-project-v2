package com.wipro.thiago.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TShirtTest {

	@Test 
	void should_ReturnNotNull_When_InstantiateTshirt(){
		
		//given
		
		TShirt tShirt;
		
		
		//when
		
		tShirt = new TShirt("Black", "Male",null, "M");
		
	
		//then
		
		assertNotNull(tShirt);
		
	}

}
