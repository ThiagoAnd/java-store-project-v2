package com.wipro.thiago.models;

public class Pants extends Variant {
	
	private String activity;

	public Pants(String name, String color, String gender, String activity) {
		super(name, color, gender);
		this.activity = activity;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}
	
	

}
