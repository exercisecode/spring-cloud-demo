package com.demo.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudBaseMain {
	
	static Logger log = LoggerFactory.getLogger(SpringCloudBaseMain.class);
	
	public static void main(String[] args) {
		ConfigurableApplicationContext configContext = SpringApplication.run(SpringCloudBaseMain.class, args);
		log.info("-----bean count:{} ", configContext.getBeanDefinitionCount());
	} 

}
