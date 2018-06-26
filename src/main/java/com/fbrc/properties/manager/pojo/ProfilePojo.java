package com.fbrc.properties.manager.pojo;


public class ProfilePojo {
	
	private String name;
	private String description;
	
	public ProfilePojo(String name, String description) {
		this.name = name;
		this.description = description;
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

	@Override
	public String toString() {
		return "ProfilePojo [name=" + name + ", description=" + description + "]";
	}
	
}
