package com.example.matoshritoursandtravels.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tour_packages")
public class TourPackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;
    private String description;
    private double price;
    private boolean enabled = true; // default to enabled

    public TourPackage() {}

    public TourPackage(String imageUrl, String description, double price, boolean enabled) {
        this.imageUrl = imageUrl;
        this.description = description;
        this.price = price;
        this.enabled = enabled;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}
