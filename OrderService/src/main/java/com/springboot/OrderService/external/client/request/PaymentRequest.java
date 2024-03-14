package com.springboot.OrderService.external.client.request;


import com.springboot.OrderService.model.PaymentMode;
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
