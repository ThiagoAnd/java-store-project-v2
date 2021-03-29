package com.wipro.thiago.models;

import java.util.List;

public class Product {
	
	private String name;
	private double price;
	private String description;
	private int quantity;
	private List<String> images;
	private Variant variant;
	

	
	
	public Product(String name, double price, String description, int quantity, List<String> images, Variant variant) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.quantity = quantity;
		this.images = images;
		this.variant = variant;
	}


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


	public List<String> getImages() {
		return images;
	}


	public void setImages(List<String> images) {
		this.images = images;
	}


	public Variant getVariant() {
		return variant;
	}


	public void setVariant(Variant variant) {
		this.variant = variant;
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
