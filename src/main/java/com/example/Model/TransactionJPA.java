package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="TransactionData", uniqueConstraints = @UniqueConstraint(columnNames = {"TransactionId","MessageId"}))
public class TransactionJPA {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String TransactionId;
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String MessageId;
	
	@Column(name="End2EndID")
	private String End2EndId;
	@Column(name="DebatorAccount")
	private String DebatorAccount;
	@Column(name="DebatorAgentIndentifier")
	private String DebatorAgentIndentifier;
	@Column(name="CredatorAccount")
	private String CredatorAccount;
	@Column(name="CredatorAccountIdentidier")
	private String CredatorAccountIdentidier;
	@Column(name="PaymentCurrency")
	private String PaymentCurrency;
	@Column(name="End2EndID")
	private String PaymentInfo;
	@Column(name="End2EndID")
	private String ValueDate;
	@Column(name="End2EndID")
	private String TransactionStatus;
	
	
	public TransactionJPA(String debatorAccount,
			String debatorAgentIndentifier, String credatorAccount, String credatorAccountIdentidier,
			String paymentCurrency, String paymentInfo, String valueDate, String transactionStatus) {
		super();
		DebatorAccount = debatorAccount;
		DebatorAgentIndentifier = debatorAgentIndentifier;
		CredatorAccount = credatorAccount;
		CredatorAccountIdentidier = credatorAccountIdentidier;
		PaymentCurrency = paymentCurrency;
		PaymentInfo = paymentInfo;
		ValueDate = valueDate;
		TransactionStatus = transactionStatus;
	}
	public String getTransactionId() {
		return TransactionId;
	}
	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}
	public String getMessageId() {
		return MessageId;
	}
	public void setMessageId(String messageId) {
		MessageId = messageId;
	}
	public String getEnd2EndId() {
		return End2EndId;
	}
	public void setEnd2EndId(String end2EndId) {
		End2EndId = end2EndId;
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
	public String getCredatorAccount() {
		return CredatorAccount;
	}
	public void setCredatorAccount(String credatorAccount) {
		CredatorAccount = credatorAccount;
	}
	public String getCredatorAccountIdentidier() {
		return CredatorAccountIdentidier;
	}
	public void setCredatorAccountIdentidier(String credatorAccountIdentidier) {
		CredatorAccountIdentidier = credatorAccountIdentidier;
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
	public String getTransactionStatus() {
		return TransactionStatus;
	}
	public void setTransactionStatus(String transactionStatus) {
		TransactionStatus = transactionStatus;
	}
	
	

}
