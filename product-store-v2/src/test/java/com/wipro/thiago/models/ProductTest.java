package com.wipro.thiago.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test 
	void should_ReturnNotNull_When_InstantiateProduct(){
		
		//given
		
		Product product;
		
		
		//when
		
		product = new Product("Book of Java", 58.7, "Book of language Java", 1, null,null);
		
	
		//then
		
		assertNotNull(product);
		
	}

}
