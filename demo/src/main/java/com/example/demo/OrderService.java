package com.example.demo;

import org.springframework.stereotype.Component;

@Component // Annotation which tells the spring which class's objects should be created
public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){ // Constructor to inject dependency
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(10);
    }
}

