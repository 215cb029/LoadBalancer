package com.java.load.balancing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudLoadBalancingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLoadBalancingApplication.class, args);
	}

}
