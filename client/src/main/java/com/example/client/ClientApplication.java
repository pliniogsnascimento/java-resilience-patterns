package com.example.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class ClientApplication {

	@Autowired
	Client client;

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@GetMapping("/v1/message")
	public String request() {
		return client.getMessage();
	}

}
