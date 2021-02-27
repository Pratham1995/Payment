package com.example.PaymentValidation.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.PaymentValidation.Model.Transaction;


@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

}