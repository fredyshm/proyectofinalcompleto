package com.proyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class AtmDepositApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmDepositApplication.class, args);
	}

}
