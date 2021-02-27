package com.example.PaymentValidation.Service;

import org.springframework.stereotype.Component;

@Component

public class TransactionResponseDto {
	
	
	String error;
    String status;
   public TransactionResponseDto(String error, String status)
	{
		error=error;
		status=status;
	}
	
}
