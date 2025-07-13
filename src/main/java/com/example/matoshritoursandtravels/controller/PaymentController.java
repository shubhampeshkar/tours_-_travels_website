// src/main/java/com/example/matoshritoursandtravels/controller/PaymentController.java
package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.Payment;
import com.example.matoshritoursandtravels.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin
public class PaymentController {

    @Autowired
    private PaymentRepository paymentRepository;

    @PostMapping("/save")
    public Payment savePayment(@RequestBody Payment payment) {
        return paymentRepository.save(payment);
    }
}
