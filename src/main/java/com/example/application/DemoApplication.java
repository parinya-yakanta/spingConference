package com.example.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
		"com.example.config",
		"com.example.controller",
})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//  monitor HikariCP
//	https://www.programmersought.com/article/82305150272/
//  monitor HikariCP prometheus
//  https://dzone.com/articles/spring-boot-monitoring-via-prometheus-grafana
}
