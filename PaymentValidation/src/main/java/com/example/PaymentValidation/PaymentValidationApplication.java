package com.example.PaymentValidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.PaymentValidation")
@SpringBootApplication
public class PaymentValidationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentValidationApplication.class, args);
	}

}
