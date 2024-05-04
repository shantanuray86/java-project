package com.playerbattingaverage;

public class Players {

	String name;
	int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Players(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Players [name=" + name + ", height=" + height + "]";
	}
	
	
}
