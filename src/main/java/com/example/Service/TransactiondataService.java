package com.example.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.DTO.PaymentTransactionDTO;
import com.example.Model.TransactionJPA;
import com.example.Repository.TransactionRepository;

@Component
public class TransactiondataService {
	
	private TransactionRepository transactionRepository;

	
	
	public TransactiondataService(TransactionRepository transactionRepository) {
		super();
		this.transactionRepository = transactionRepository;
	}

	public TransactionJPA save(PaymentTransactionDTO paymentTransactionDTO){
		TransactionJPA transaction= new TransactionJPA(paymentTransactionDTO.getDebatorAccount(),paymentTransactionDTO.getDebatorAgentIndentifier(),paymentTransactionDTO.getCreditorAccount()
				,paymentTransactionDTO.getCreditorAgentIndentifier(),paymentTransactionDTO.getPaymentCurrency(),paymentTransactionDTO.getPaymentInfo(),paymentTransactionDTO.getValueDate(),paymentTransactionDTO.getTransactionStatus());
		return transactionRepository.save(transaction);
		
		
	}
	
	

}
