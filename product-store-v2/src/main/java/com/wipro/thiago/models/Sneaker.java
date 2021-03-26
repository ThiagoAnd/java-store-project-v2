package com.wipro.thiago.models;

public class Sneaker extends Variant {

	
	private int size;
	private String activity;
	private String material;
	
	
	public Sneaker(String name, String color, String gender, int size, String activity, String material) {
		super(name, color, gender);
		this.size = size;
		this.activity = activity;
		this.material = material;
	}
	
	

	

}
