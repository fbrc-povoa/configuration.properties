package com.fbrc.properties.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fbrc.properties.manager.pojo.ConfigurationProcessorPojo;

@RestController
public class ConfigurationProcessorController {

	private ConfigurationProcessorPojo pojo;
	
	@Autowired
	public ConfigurationProcessorController(ConfigurationProcessorPojo pojo) {
		this.pojo = pojo;
	}
	
	@RequestMapping("/")
	public String home() {
		return pojo.toString();
	}
}
