package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@LoadBalancerClient(name = "servicio-productos")
@EnableFeignClients
@SpringBootApplication
public class ServiceItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceItemsApplication.class, args);
	}

}
