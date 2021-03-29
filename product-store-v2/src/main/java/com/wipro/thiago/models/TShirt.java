package com.wipro.thiago.models;

import com.wipro.thiago.enums.SleeveType;
import com.wipro.thiago.enums.TShirtSize;

public class TShirt extends Variant {

	String sleeve;
	String size;
	
			
	public TShirt(String name, String color, String gender, String sleeve, String size) {
		super(name, color, gender);
		this.sleeve = sleeve;
		this.size = size;
	}
	public String getSleeve() {
		return sleeve;
	}
	public void setSleeve(String sleeve) {
		this.sleeve = sleeve;
	}

	
	
}
