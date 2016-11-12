package com.demo.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class SpringCloudEurekaServerMain {
	
	static Logger log = LoggerFactory.getLogger(SpringCloudEurekaServerMain.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext configContext = SpringApplication.run(SpringCloudEurekaServerMain.class, args);
		
		log.info("-----bean count:{} ", configContext.getBeanDefinitionCount());
		
	}

}
