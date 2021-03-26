package com.wipro.thiago.enums;

public enum SleeveType {

	SHORT("Short sleeve"),LONG("Long sleeve");
	
	private String type;
	
	private SleeveType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
