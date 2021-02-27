package com.example.PaymentValidation.DTO;

import java.sql.Date;
import java.util.UUID;

public class TransactionDTO {
private int messageId;
private int endToEndId;
private String debtorAccount;
private String debtorName;
private String Address;
private String creditorAccount;
private String creditorName;
private String creditorAddress;
private String debtorAgentIdentifier;
private String creditorAgentIdentifier;
private String paymentCurrency;
private double paymentAmount;
private String valueDate;
public int getMessageId() {
	return messageId;
}
public void setMessageId(int messageId) {
	this.messageId = messageId;
}
public int getEndToEndId() {
	return endToEndId;
}
public void setEndToEndId(int endToEndId) {
	this.endToEndId = endToEndId;
}
public String getDebtorAccount() {
	return debtorAccount;
}
public void setDebtorAccount(String debtorAccount) {
	this.debtorAccount = debtorAccount;
}
public String getDebtorName() {
	return debtorName;
}
public void setDebtorName(String debtorName) {
	this.debtorName = debtorName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCreditorAccount() {
	return creditorAccount;
}
public void setCreditorAccount(String creditorAccount) {
	this.creditorAccount = creditorAccount;
}
public String getCreditorName() {
	return creditorName;
}
public void setCreditorName(String creditorName) {
	this.creditorName = creditorName;
}
public String getCreditorAddress() {
	return creditorAddress;
}
public void setCreditorAddress(String creditorAddress) {
	this.creditorAddress = creditorAddress;
}
public String getDebtorAgentIdentifier() {
	return debtorAgentIdentifier;
}
public void setDebtorAgentIdentifier(String debtorAgentIdentifier) {
	this.debtorAgentIdentifier = debtorAgentIdentifier;
}
public String getCreditorAgentIdentifier() {
	return creditorAgentIdentifier;
}
public void setCreditorAgentIdentifier(String creditorAgentIdentifier) {
	this.creditorAgentIdentifier = creditorAgentIdentifier;
}
public String getPaymentCurrency() {
	return paymentCurrency;
}
public void setPaymentCurrency(String paymentCurrency) {
	this.paymentCurrency = paymentCurrency;
}
public double getPaymentAmount() {
	return paymentAmount;
}
public void setPaymentAmount(double paymentAmount) {
	this.paymentAmount = paymentAmount;
}
public String getValueDate() {
	return valueDate;
}
public void setValueDate(String valueDate) {
	this.valueDate = valueDate;
}


}
