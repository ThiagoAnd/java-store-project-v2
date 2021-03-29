package com.wipro.thiago.models;

public class Image {
	
	private String name;
	private int size;
	private String path;
	private String extension;
	public Image(String name, int size, String path, String extension) {
		super();
		this.name = name;
		this.size = size;
		this.path = path;
		this.extension = extension;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getExtension() {
		return extension;
	}
	public void setExtension(String extension) {
		this.extension = extension;
	}
	@Override
	public String toString() {
		return "Image [name=" + name + ", size=" + size + ", path=" + path + ", extension=" + extension + "]";
	}
	
	


}
