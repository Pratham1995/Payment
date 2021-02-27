package com.example.PaymentValidation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.PaymentValidation.DTO.TransactionDTO;
import com.example.PaymentValidation.Model.Transaction;
import com.example.PaymentValidation.Repository.TransactionRepository;
import com.example.PaymentValidation.Service.PaymentService;
import com.example.PaymentValidation.Service.TransactionResponseDto;

@RestController
@RequestMapping("/Transaction")
public class TransactionController {

//	@Autowired
//	private TransactionRepository dao;
	@Autowired
	private PaymentService service; 

//	@PostMapping("/add")
//	public Transaction addTransaction(@RequestBody Transaction transaction) {
//		
//		return dao.save(transaction);
//	}
//
//	@GetMapping("/all")
//	public Iterable<Transaction> allTransaction() {
//		
//		return dao.findAll();
//	}
	
	  @PostMapping(value = "/paymentProcess")
	    public ResponseEntity<TransactionResponseDto> paymentProcess(@RequestBody TransactionDTO dto) {
	        TransactionResponseDto dtoResponse = service.makePayment(dto);
	        return new ResponseEntity(dtoResponse, HttpStatus.OK);
	    }
		

}