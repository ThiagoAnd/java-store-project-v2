package com.wipro.thiago.models;

import java.util.ArrayList;

import java.util.List;
public class MainCollection extends Collection{
	
	private List<SubCollection> subCollection;
	

	public MainCollection(String name, String description, List<String> keywords) {
		super(name, description, keywords);
		this.subCollection = new ArrayList<SubCollection>();
	}
	

	public List<SubCollection> getSubCollection() {
		return subCollection;
	}

	public void setSubCollection(ArrayList<SubCollection> subCollection) {
		this.subCollection = subCollection;
	}


	
	

}
