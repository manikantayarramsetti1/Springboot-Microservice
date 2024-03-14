package com.learntocode.PaymentService.service;

import com.learntocode.PaymentService.entity.TransactionDetails;
import com.learntocode.PaymentService.model.PaymentRequest;
import com.learntocode.PaymentService.repository.PaymentRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
@Log4j2
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;
    @Override
    public Long doPayment(PaymentRequest paymentRequest) {
        log.info("Recording the payment details" + paymentRequest);
        TransactionDetails transactionDetails = TransactionDetails.builder()
                .paymentDate(Instant.now())
                .paymentMode(paymentRequest.getPaymentMode().name())
                .referenceNumber(paymentRequest.getReferenceNumber())
                .paymentStatus("SUCCESS")
                .orderId(paymentRequest.getOrderId())
                .amount(paymentRequest.getAmount())
                .build();
        paymentRepository.save(transactionDetails);
        log.info("Transaction completed with the Id: {} ", transactionDetails.getId());
        return transactionDetails.getId();
    }
}
