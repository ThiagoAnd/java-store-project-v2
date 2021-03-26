package com.wipro.thiago.models;

public class Product {
	
	private String name;
	private double price;
	private String description;
	private int quantity;

	
	



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	


	@Override
	public String toString() {
		return 	"\nName=" + name +
				"\nPrice=" + price +
				"\nDescription=" + description +
				"\nQuantity=" + quantity
				;
	}
	
	
	public String getPriceAndDescription() {
		return "\nPrice= "+price+
				"\nDescription= "+description;
	}
	
	
	
	
	
	

}
