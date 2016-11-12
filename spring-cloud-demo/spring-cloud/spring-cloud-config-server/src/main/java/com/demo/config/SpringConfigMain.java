package com.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.ConfigurableApplicationContext;

@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableConfigServer
public class SpringConfigMain {
	
	static Logger log = LoggerFactory.getLogger(SpringConfigMain.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext configContext = SpringApplication.run(SpringConfigMain.class, args);
		log.info("----- bean count:{} ", configContext.getBeanDefinitionCount());
	}
}
