package com.wipro.thiago.models;

public class Pants extends Variant {
	
	private String activity;
	private String material;
	private String size;

	



	public Pants(String color, String gender, String activity, String material, String size) {
		super(color, gender);
		this.activity = activity;
		this.material = material;
		this.size = size;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Pants {\n\t\t\tsize=" + size + ",\n\t\t\tcolor=" + getColor() +"\n\t\t\tmaterial="+material+ ",\n\t\t\tactivity=" + activity
				+ ", \n\t\t\tgender=" + getGender() + "\n\t}\n";
	}
	
	
	

}
