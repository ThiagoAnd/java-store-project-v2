package com.wipro.thiago.models;

import com.wipro.thiago.enums.SleeveType;
import com.wipro.thiago.enums.TShirtSize;

public class TShirt extends Variant {

	String sleeve;
	String size;
	
			
	public TShirt(String color, String gender, String sleeve, String size) {
		super(color, gender);
		this.sleeve = sleeve;
		this.size = size;
	}
	public String getSleeve() {
		return sleeve;
	}
	public void setSleeve(String sleeve) {
		this.sleeve = sleeve;
	}
	@Override
	public String toString() {
		return "TShirt {\n\t\t\tsleeve=" + sleeve + ", \n\t\t\tsize=" + size + ", \n\t\t\tcolor=" + getColor() + ", \n\t\t\tgender="
				+ getGender() + "\n\t}\n";
	}
	
	
	
	

	
	
}
