package com.wipro.thiago.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ImageTest {

	@Test 
	void should_ReturnNotNull_When_InstantiateImage(){
		
		//given
		
		Image image;
		
		
		//when
		
		image = new Image("Front", 44, "http://www.google.com/front.png", "png");
		
	
		//then
		
		assertNotNull(image);
		
	}

}
