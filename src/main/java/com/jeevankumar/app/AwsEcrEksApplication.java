package com.jeevankumar.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsEcrEksApplication {

    @GetMapping("/")
    public String home() {
        return "Hello, AWS ECR and EKS!";
    }

	public static void main(String[] args) {
		SpringApplication.run(AwsEcrEksApplication.class, args);
	}

}
