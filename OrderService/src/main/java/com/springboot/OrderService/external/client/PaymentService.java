package com.springboot.OrderService.external.client;

import com.springboot.OrderService.exception.CustomException;
import com.springboot.OrderService.external.client.request.PaymentRequest;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CircuitBreaker(name = "external", fallbackMethod = "fallback")
@FeignClient(name = "PRODUCT-SERVICE/payment")
public interface PaymentService {

    @PostMapping()
    public ResponseEntity<Long> doPayment(@RequestBody PaymentRequest paymentRequest);

    default void fallback(Exception e) {
        throw new CustomException("Payment service is not available",
                "UNAVAILABLE",
                500);
    }
}
