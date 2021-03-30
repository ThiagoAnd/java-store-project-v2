package com.wipro.thiago.models;

import java.util.ArrayList;
import java.util.List;

public class SubCollection extends Collection {

	private List<Product> products;

	public SubCollection(String name, String description, List<String> keywords) {
		super(name, description, keywords);
		this.products = new ArrayList<Product>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

}
