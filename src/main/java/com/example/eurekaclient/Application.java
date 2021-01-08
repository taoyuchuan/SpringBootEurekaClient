package com.example.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class for Eureka client.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class Application {

	/**
	 * Driver function.
	 * @param args Not used.
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	/**
	 * Return main view.
	 * @return Content to display on browser.
	 */
	@RequestMapping(value = "/")
	public String home() {
		return "Eureka Client application";
	}
}
