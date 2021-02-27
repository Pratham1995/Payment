package com.example.PaymentValidation.Service;

import org.springframework.stereotype.Component;

public class TransactionResponseDto {
	
	
	String error;
    String status;
   public TransactionResponseDto(String error, String status)
	{
		this.error=error;
		this.status=status;
	}
public String getError() {
	return error;
}
public void setError(String error) {
	this.error = error;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
	
}
