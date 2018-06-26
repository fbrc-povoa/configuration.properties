package com.fbrc.properties.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fbrc.properties.manager.pojo.ValuePojo;

@RestController
public class ValueController {

	private ValuePojo pojo;
	
	@Autowired
	public ValueController(ValuePojo pojo){
		this.pojo = pojo;
	}
	
	@RequestMapping("/value")
	public String value() {
		return pojo.toString();
	}
}
