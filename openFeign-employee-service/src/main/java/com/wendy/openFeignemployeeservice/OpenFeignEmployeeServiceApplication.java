package com.wendy.openFeignemployeeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenFeignEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignEmployeeServiceApplication.class, args);
	}

}
