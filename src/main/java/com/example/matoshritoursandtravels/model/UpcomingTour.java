package com.example.matoshritoursandtravels.model;

import jakarta.persistence.*;

@Entity
@Table(name = "upcoming_tours")
public class UpcomingTour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;
    private String trekName;
    private String date;
    private String time;
    private int seats;
    private double price;

    @Column(length = 1000)
    private String description;

    private boolean enabled = true; // New field

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getTrekName() { return trekName; }
    public void setTrekName(String trekName) { this.trekName = trekName; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public int getSeats() { return seats; }
    public void setSeats(int seats) { this.seats = seats; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}
