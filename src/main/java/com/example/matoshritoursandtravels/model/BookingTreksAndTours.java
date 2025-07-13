package com.example.matoshritoursandtravels.model;

import jakarta.persistence.*;

@Entity
@Table(name = "BookingTreksAndTours")
public class BookingTreksAndTours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trekName;
    private String date;
    private String time;
    private double price;

    private String customerName;
    private String email;
    private String phone;
    private int seatsToBook;
    private double totalAmount;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTrekName() { return trekName; }
    public void setTrekName(String trekName) { this.trekName = trekName; }

    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public int getSeatsToBook() { return seatsToBook; }
    public void setSeatsToBook(int seatsToBook) { this.seatsToBook = seatsToBook; }

    public double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(double totalAmount) { this.totalAmount = totalAmount; }
}
