package com.example.matoshritoursandtravels.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String dob;
    private String address;
    private String password;

    public User() {}

    public User(String name, String email, String phone, String dob, String address, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.address = address;
        this.password = password;
    }

}
