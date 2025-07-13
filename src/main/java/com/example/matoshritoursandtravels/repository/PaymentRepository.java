// src/main/java/com/example/matoshritoursandtravels/repository/PaymentRepository.java
package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
