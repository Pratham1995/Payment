package com.example.PaymentValidation.Exception;

import org.springframework.stereotype.Component;

@Component
public class PaymentProcessException extends Exception {
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	private String msg;
	public PaymentProcessException(String msg)
	{
		this.msg=msg;
	}
	

}
