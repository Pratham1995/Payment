package com.example.PaymentValidation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PaymentValidation.Model.Transaction;
import com.example.PaymentValidation.Repository.TransactionRepository;

@RestController
@RequestMapping("/Transaction")
public class TransactionController {

	@Autowired
	private TransactionRepository dao;

	@PostMapping("/add")
	public Transaction addTransaction(@RequestBody Transaction transaction) {
		
		return dao.save(transaction);
	}

	@GetMapping("/all")
	public Iterable<Transaction> allTransaction() {
		
		return dao.findAll();
	}
	
	@PostMapping(value = "/validationService", consumes = {"application/json"})
	public Transaction getValidations(@RequestBody Transaction transaction) {
		
		
		return transaction;
		
	}

}