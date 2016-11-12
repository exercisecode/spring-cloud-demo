package com.demo.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class BaseMain {
	
	static Logger log = LoggerFactory.getLogger(BaseMain.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext configContext = SpringApplication.run(BaseMain.class, args);
		log.info("-----bean count:{} ", configContext.getBeanDefinitionCount());
	} 

}
