package com.example.matoshritoursandtravels.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bookings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerName;
    private String email;
    private String mobile;
    private String travelDate;
    private String travelTime;
    private String tourPackageName;
    private int numberOfPersons;
    private double totalAmount;
    private boolean paymentStatus;
}
