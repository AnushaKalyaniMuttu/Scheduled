package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@EnableScheduling
@SpringBootApplication
public class ScheduledApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(ScheduledApp2Application.class, args);
	}

	@Scheduled(fixedRate = 2000L,initialDelay = 10000L)
	public void job() {
		System.out.println("Current Job Time"+new Date());
	}
}
