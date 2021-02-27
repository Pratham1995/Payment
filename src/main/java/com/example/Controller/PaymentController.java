package com.example.Controller;

import org.apache.commons.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.DTO.PaymentTransactionDTO;
import com.example.Model.TransactionJPA;
import com.example.Service.TransactiondataService;

@RestController
public class PaymentController {
	private LogFactory logger=LogFactory.getFactory();
	
	private TransactiondataService transactionDataService;
	
	@PostMapping("/PaymentValidation")
	public TransactionJPA performAccountValidation(@RequestBody PaymentTransactionDTO paymentTransactionDTO) {
		if(paymentTransactionDTO!=null) {
			return transactionDataService.save(paymentTransactionDTO);
		}
		return null;
		
	}

}
