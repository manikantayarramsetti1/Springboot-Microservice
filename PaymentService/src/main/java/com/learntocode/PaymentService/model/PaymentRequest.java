package com.learntocode.PaymentService.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentRequest {
    private long id;
    private long orderId;
    private String referenceNumber;
    private long amount;
    private PaymentMode paymentMode;
}
