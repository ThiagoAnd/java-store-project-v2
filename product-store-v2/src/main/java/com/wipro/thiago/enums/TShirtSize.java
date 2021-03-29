package com.wipro.thiago.enums;

public enum TShirtSize {
	
	XS(1,"XS"),S(2,"S"),M(3,"M"),L(4,"L"),XL(5,"XL"),XXL(6,"XXL"),XXXL(7,"XXXL");
	
	private String size;
	private int index;
	
	private TShirtSize(int index,String size) {
		this.size = size;
		this.index = index;
	}
	
	public String getSize() {
		return this.size;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	


}
