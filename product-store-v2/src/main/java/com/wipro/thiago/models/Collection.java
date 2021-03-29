package com.wipro.thiago.models;

import java.util.List;

public abstract class Collection {

	private String name;
	private String description;
	private List<String> keywords ;
	
	
	
	public Collection(String name, String description, List<String> keywords) {
		super();
		this.name = name;
		this.description = description;
		this.keywords = keywords;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
	

}
