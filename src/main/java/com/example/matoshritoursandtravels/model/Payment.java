// src/main/java/com/example/matoshritoursandtravels/model/Payment.java
package com.example.matoshritoursandtravels.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Table(name = "payment")
public class Payment {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(name = "card_type")
    private String cardType;

    @Setter
    @Column(name = "card_holder_name")
    private String cardHolderName;

    @Setter
    @Column(name = "card_number")
    private String cardNumber;

    @Setter
    @Column(name = "expiry")
    private String expiry;

    @Setter
    @Column(name = "cvv")
    private String cvv;

    @Setter
    @Column(name = "total_amount")
    private double totalAmount;

    // Constructors
    public Payment() {}

    public Payment(String cardType, String cardHolderName, String cardNumber, String expiry, String cvv, double totalAmount) {
        this.cardType = cardType;
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expiry = expiry;
        this.cvv = cvv;
        this.totalAmount = totalAmount;
    }

}
