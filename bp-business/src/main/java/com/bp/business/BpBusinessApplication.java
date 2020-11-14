package com.bp.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@ServletComponentScan(basePackages = {"com.bp.business.*"})
public class BpBusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(BpBusinessApplication.class, args);
	}

}
