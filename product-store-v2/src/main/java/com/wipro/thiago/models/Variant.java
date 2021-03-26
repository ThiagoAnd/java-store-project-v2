package com.wipro.thiago.models;

public class Variant {
	

	
	private String name;
	private String color;
	private String gender;
	

	
	public Variant(String name, String color, String gender) {
		
		this.name = name;
		this.color = color;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Variant [name=" + name + ", color=" + color + ", gender=" + gender + "]";
	}
	
	
	


	
	


}
