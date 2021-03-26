package com.wipro.thiago.models;

import com.wipro.thiago.enums.SleeveType;

public class TShirt extends Variant {

	private String size;
	SleeveType sleeve;
	
	
	
	public TShirt(String name, String color, String gender, String activity, String size, SleeveType sleeve) {
		super(name, color, gender);
		this.size = size;
		this.sleeve = sleeve;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public SleeveType getSleeve() {
		return sleeve;
	}
	public void setSleeve(SleeveType sleeve) {
		this.sleeve = sleeve;
	}

	
	
}
