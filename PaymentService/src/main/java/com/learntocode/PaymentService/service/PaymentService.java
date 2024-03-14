package com.learntocode.PaymentService.service;

import com.learntocode.PaymentService.model.PaymentRequest;

public interface PaymentService {
    Long doPayment(PaymentRequest paymentRequest);
}
