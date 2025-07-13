package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.BookingTreksAndTours;
import com.example.matoshritoursandtravels.service.BookingTreksAndToursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin("*")
public class BookingTreksAndToursController {

    @Autowired
    private BookingTreksAndToursService bookingService;

    @PostMapping
    public BookingTreksAndTours bookTour(@RequestBody BookingTreksAndTours booking) {
        return bookingService.bookTour(booking);
    }

    @GetMapping
    public List<BookingTreksAndTours> getAllBookings() {
        return bookingService.getAllBookings();
    }



}
