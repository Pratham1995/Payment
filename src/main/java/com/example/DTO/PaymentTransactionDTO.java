package com.example.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PaymentTransactionDTO {
	@NotNull
	@NotBlank(message = "DebatorAccount  may not be blank  ")
	@NotEmpty(message = "DebatorAccount should not be empty  ")
	@Size(min=2, max=35)
	private String DebatorAccount;
	@NotNull
	@NotBlank(message = "DebatorAgentIndentifier  may not be blank  ")
	@NotEmpty(message = "DebatorAgentIndentifier should not be empty  ")
	@Size(min=2, max=35)
	private String DebatorAgentIndentifier;
	@NotNull
	@NotBlank(message = "CreditorAccount  may not be blank  ")
	@NotEmpty(message = "CreditorAccount should not be empty  ")
	@Size(min=2, max=35)
	private String CreditorAccount;
	@NotNull
	@NotBlank(message = "CreditorAgentIndentifier  may not be blank  ")
	@NotEmpty(message = "CreditorAgentIndentifier should not be empty  ")
	@Size(min=2, max=35)
	private String CreditorAgentIndentifier;
	@NotNull
	@NotBlank(message = "PaymentCurrency  may not be blank  ")
	@NotEmpty(message = "PaymentCurrency should not be empty  ")
	@Size(min=2, max=10)
	private String PaymentCurrency;
	@NotNull
	@NotBlank(message = "PaymentInfo  may not be blank  ")
	@NotEmpty(message = "PaymentInfo should not be empty  ")
	@Size(min=2, max=35)
	private String PaymentInfo;
	@NotNull
	@NotBlank(message = "ValueDate  may not be blank  ")
	@NotEmpty(message = "ValueDate should not be empty  ")
	private String ValueDate;
	private String TransactionStatus;
	public String getTransactionStatus() {
		return TransactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		TransactionStatus = transactionStatus;
	}
	public String getDebatorAccount() {
		return DebatorAccount;
	}
	public void setDebatorAccount(String debatorAccount) {
		DebatorAccount = debatorAccount;
	}
	public String getDebatorAgentIndentifier() {
		return DebatorAgentIndentifier;
	}
	public void setDebatorAgentIndentifier(String debatorAgentIndentifier) {
		DebatorAgentIndentifier = debatorAgentIndentifier;
	}
	public String getCreditorAccount() {
		return CreditorAccount;
	}
	public void setCreditorAccount(String creditorAccount) {
		CreditorAccount = creditorAccount;
	}
	public String getCreditorAgentIndentifier() {
		return CreditorAgentIndentifier;
	}
	public void setCreditorAgentIndentifier(String creditorAgentIndentifier) {
		CreditorAgentIndentifier = creditorAgentIndentifier;
	}
	public String getPaymentCurrency() {
		return PaymentCurrency;
	}
	public void setPaymentCurrency(String paymentCurrency) {
		PaymentCurrency = paymentCurrency;
	}
	public String getPaymentInfo() {
		return PaymentInfo;
	}
	public void setPaymentInfo(String paymentInfo) {
		PaymentInfo = paymentInfo;
	}
	public String getValueDate() {
		return ValueDate;
	}
	public void setValueDate(String valueDate) {
		ValueDate = valueDate;
	}
	

}
