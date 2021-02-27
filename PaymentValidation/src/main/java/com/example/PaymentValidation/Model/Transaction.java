package com.example.PaymentValidation.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "Transaction")
public class Transaction implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(generator = "sequence-generator")
	@GenericGenerator(
		      name = "sequence-generator",
		      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
		      parameters = {
		        @Parameter(name = "sequence_name", value = "tansactionID_seq"),
		        @Parameter(name = "initial_value", value = "10000"),
		        @Parameter(name = "increment_size", value = "1")
		        }
		    )
	@Column(name = "TransactionID")
	private int transactionID;

	@Column(name = "MessageID")
	private int messageID;

	@Column(name = "E2EID")
	private int e2eID;

	@Column(name = "DEBITORACCOUNT")
	private String debitorAccount;

	@Column(name = "DebitorAgentIdentifier")
	private String debitorAgenntIdentifier;
	
	@Column(name = "DebitorName")
	private String debitorName;
	
	@Column(name = "DebitorAddress")
	private String debitorAddress;
	
	@Column(name = "CREDITORACCOUNT")
	private String creditorAccount;
	
	@Column(name = "CreditorName")
	private String creditorName;
	
	@Column(name = "CreditorAddress")
	private String creditorrAddress;
	
	@Column(name = "CreditorAgentIdentifier")
	private String creditorAgenntIdentifier;
	
	@Column(name = "PaymentCurrency")
	private String paymentCurrency;
	
	@Column(name = "PaymentAmount")
	private Double paymentAmount;
	
	@Column(name = "ValueDate")
	private Date valueDate;
	
	@Column(name = "TransactionStatus")
	private String transactionStatus;

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getMessageID() {
		return messageID;
	}

	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}

	public int getE2eID() {
		return e2eID;
	}

	public void setE2eID(int e2eID) {
		this.e2eID = e2eID;
	}

	public String getDebitorAccount() {
		return debitorAccount;
	}

	public void setDebitorAccount(String debitorAccount) {
		this.debitorAccount = debitorAccount;
	}

	public String getDebitorAgenntIdentifier() {
		return debitorAgenntIdentifier;
	}

	public void setDebitorAgenntIdentifier(String debitorAgenntIdentifier) {
		this.debitorAgenntIdentifier = debitorAgenntIdentifier;
	}

	public String getDebitorName() {
		return debitorName;
	}

	public void setDebitorName(String debitorName) {
		this.debitorName = debitorName;
	}

	public String getDebitorAddress() {
		return debitorAddress;
	}

	public void setDebitorAddress(String debitorAddress) {
		this.debitorAddress = debitorAddress;
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

	public String getCreditorrAddress() {
		return creditorrAddress;
	}

	public void setCreditorrAddress(String creditorrAddress) {
		this.creditorrAddress = creditorrAddress;
	}

	public String getCreditorAgenntIdentifier() {
		return creditorAgenntIdentifier;
	}

	public void setCreditorAgenntIdentifier(String creditorAgenntIdentifier) {
		this.creditorAgenntIdentifier = creditorAgenntIdentifier;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public Double getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	

}
