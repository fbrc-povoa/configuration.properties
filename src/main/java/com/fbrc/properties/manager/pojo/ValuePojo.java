package com.fbrc.properties.manager.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValuePojo {

	@Value("${myconfig.app-name}")
	private String name;
	
	@Value("${myconfig.app-description}")
	private String description;

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
		return "ValuePojo [name=" + name + ", description=" + description + "]";
	}
	
}
