package com.swapi.dto;

public class Characters {
	private String name;
	private String gender;
	private String height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public Characters(String name, String gender, String height) {
		super();
		this.name = name;
		this.gender = gender;
		this.height = height;
	}
	

}
