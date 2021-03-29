package com.wipro.thiago.enums;

public enum Gender {
	M("Masculino"), F("Feminino");

	String gender;

	private Gender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		
		return this.gender;
	}
	
	

}
