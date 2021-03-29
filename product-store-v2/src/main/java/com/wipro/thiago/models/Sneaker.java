package com.wipro.thiago.models;

public class Sneaker extends Variant {

	private int size;
	private String activity;

	public Sneaker(String color, String gender, int size, String activity) {
		super(color, gender);
		this.size = size;
		this.activity = activity;

	}
	
	

	public int getSize() {
		return size;
	}



	public void setSize(int size) {
		this.size = size;
	}



	public String getActivity() {
		return activity;
	}



	public void setActivity(String activity) {
		this.activity = activity;
	}



	@Override
	public String toString() {
		return "Sneaker {\n\t\t\tsize=" + size + ",\n\t\t\tcolor=" + getColor() + ",\n\t\t\tactivity=" + activity
				+ ", \n\t\t\tgender=" + getGender() + "\n\t}\n";
	}

}
