package com.example.CloudGateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/orderServiceFallback")
    private String orderServiceFallback() {
        return "order service is down";
    }

    @GetMapping("/paymentServiceFallback")
    private String paymentServiceFallback() {
        return "order service is down";
    }

    @GetMapping("/productServiceFallback")
    private String productServiceFallback() {
        return "product service is down";
    }
}
