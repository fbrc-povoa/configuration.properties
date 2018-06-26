package com.fbrc.properties.manager.pojo;

import org.springframework.stereotype.Component;

@Component
@org.springframework.boot.context.properties.ConfigurationProperties(prefix="myconfig")
public class ConfigurationProcessorPojo {

	private String appName;
	private String appDescription;
	
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppDescription() {
		return appDescription;
	}
	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
	}
	@Override
	public String toString() {
		return "Pojo [appName=" + appName + ", appDescription=" + appDescription + "]";
	}
	
}
