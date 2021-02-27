package com.example.PaymentValidation.Service;

import org.springframework.stereotype.Component;

import org.springframework.stereotype.Service;

import com.example.PaymentValidation.DTO.TransactionDTO;
import com.example.PaymentValidation.Exception.PaymentProcessException;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

@Service
public class ValidationService implements PaymentService {

    private static String accountRegex = "^[A-Za-z0-9]{0,35}$";
    

    @Override
    public TransactionResponseDto makePayment(TransactionDTO dto) {

        try {
            validate(dto);

        } catch (PaymentProcessException  e) {
            return new TransactionResponseDto(e.getMsg(), "Failed");
        }

        return new TransactionResponseDto("", "PaymentSuccess");
    }

    private void validate(TransactionDTO paymentMessage) throws  PaymentProcessException{

    	//checkDecimal(paymentMessage.getPaymentAmount(), 2, 1 );
        checkContent(paymentMessage.getPaymentCurrency());
        validPatternMatch(paymentMessage.getCreditorAccount());
        validPatternMatch(paymentMessage.getDebtorAccount());
        validateDate(paymentMessage.getValueDate());
       // validateAgentIdentifier(paymentMessage.getCreditorAgentIdentifier());
       // validateAgentIdentifier(paymentMessage.getDebtorAgentIdentifier());

    }

    private void checkDecimal(double value, int maxLength, int minLength) throws PaymentProcessException {
        if (!(BigDecimal.valueOf(value).scale() > minLength) || !(BigDecimal.valueOf(value).scale() <= maxLength))

            throw new PaymentProcessException("Validation Exception");

    }

    private void validateAgentIdentifier(String value) throws PaymentProcessException {


            throw new PaymentProcessException("Validation Exception");


    }

    private void validateDate(String value) throws PaymentProcessException {

        DateFormat sdfrmt = new SimpleDateFormat("MM/dd/yyyy");
        String todayDate = "";
        String msgDate ="";
        try {
         todayDate = sdfrmt.format(new Date());
         
     
         msgDate= sdfrmt.format(sdfrmt.parse(value));

        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        
        if (!msgDate.equals(todayDate)) {
            throw new PaymentProcessException("Validation Exception");
        }


    }

    private void validPatternMatch(String value) throws PaymentProcessException {
        Pattern pattern = Pattern.compile(accountRegex);
        if (!pattern.matcher(value).matches())
            throw new PaymentProcessException("Validation Exception");
    }

    private void checkContent(String value) throws PaymentProcessException {
        if (!value.contentEquals("EUR")) {
            throw new PaymentProcessException("Validation Exception");
        }

    }


    private boolean sanctionCheck() {

        //rest controller call

        return false;
    }

    private boolean creditCheck() {
        //rest controller call

        return false;
    }
}

