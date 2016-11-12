package com.demo.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin
@RestController
public class ConfigDemoController {
	
	@Value("${config.value1}")
	private String configValue1;
	
	@RequestMapping(value = "/spring/cloud/eureka/server/value", method = RequestMethod.GET)
	public String  value() {
		String value = configValue1;
		
		return value;
	}

}
