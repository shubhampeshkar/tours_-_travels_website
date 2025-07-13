package com.example.matoshritoursandtravels.model;

import jakarta.persistence.*;
import lombok.Setter;

@Entity
public class Rating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String name;   // ✅ Changed from email to name
    private String review;
    @Setter
    private int stars;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReview() {
        return review;
    }

    public int getStars() {
        return stars;
    }

}
