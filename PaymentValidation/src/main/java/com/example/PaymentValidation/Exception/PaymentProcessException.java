package com.example.PaymentValidation.Exception;

import org.springframework.stereotype.Component;


public class PaymentProcessException extends Exception {
	
	private String msg;
	public PaymentProcessException(String msg)
	{
		this.msg=msg;
	}
	public String getMsg() {
		return msg;
	}
	

}
