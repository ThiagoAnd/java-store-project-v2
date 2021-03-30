package com.wipro.thiago.models;



public abstract class Variant {
	


	private String color;
	private String gender;
	

	
	public Variant(String color, String gender) {
		
		this.color = color;
		this.gender = gender;
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
		return "Variant [color=" + color + ", gender=" + gender + "]";
	}
	
	
	


	
	


}
