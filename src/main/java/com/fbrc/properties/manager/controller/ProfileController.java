package com.fbrc.properties.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fbrc.properties.manager.pojo.ProfilePojo;

@RestController
public class ProfileController {
	
	private ProfilePojo pojo;
	
	@Autowired
	public ProfileController(ProfilePojo pojo) {
		this.pojo = pojo;
	} 

	@RequestMapping("/profile")
	private String profile() {
		return pojo.toString();
	}

}
