package com.example.matoshritoursandtravels.model;

import jakarta.persistence.*;

@Entity
@Table(name = "car_rentals")
public class CarRental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;
    private String carName;
    private String carNumber;
    private int seater;
    private int price = 1000;
    private boolean enabled = true;

    public CarRental() {}

    public CarRental(String imageUrl, String carName, String carNumber, int seater, int price, boolean enabled) {
        this.imageUrl = imageUrl;
        this.carName = carName;
        this.carNumber = carNumber;
        this.seater = seater;
        this.price = price;
        this.enabled = enabled;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getImageUrl() { return imageUrl; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }

    public String getCarName() { return carName; }
    public void setCarName(String carName) { this.carName = carName; }

    public String getCarNumber() { return carNumber; }
    public void setCarNumber(String carNumber) { this.carNumber = carNumber; }

    public int getSeater() { return seater; }
    public void setSeater(int seater) { this.seater = seater; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}
