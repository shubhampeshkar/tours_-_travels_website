package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.Booking;
import com.example.matoshritoursandtravels.model.User;
import com.example.matoshritoursandtravels.repository.BookingRepository;
import com.example.matoshritoursandtravels.service.BookingService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking-tour-packages")
@CrossOrigin(origins = "*")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/create")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping("/all")
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @PutMapping("/update-payment/{id}")
    public Booking updatePaymentStatus(@PathVariable Long id) {
        return bookingService.updatePaymentStatus(id, true);
    }



}
