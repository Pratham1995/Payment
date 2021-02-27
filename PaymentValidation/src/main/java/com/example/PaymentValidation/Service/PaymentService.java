package com.example.PaymentValidation.Service;

import com.example.PaymentValidation.DTO.TransactionDTO;

public interface PaymentService {
	
	TransactionResponseDto makePayment(TransactionDTO dto);


}
