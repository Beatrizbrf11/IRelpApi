package com.irelp.receitadespesaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ReceitadespesaserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReceitadespesaserviceApplication.class, args);
	}
}
