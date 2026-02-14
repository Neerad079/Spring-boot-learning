package com.example.demo;

public class OrderService {
    private PaymentService paymentService;
    public OrderService(PaymentService paymentService){ // Constructor to inject dependency
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        paymentService.processPayment(10);
    }
}
