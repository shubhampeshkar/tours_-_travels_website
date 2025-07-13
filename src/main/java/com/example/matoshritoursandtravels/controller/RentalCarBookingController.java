package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.RentalCarBooking;
import com.example.matoshritoursandtravels.service.RentalCarBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentalcarbooking")
@CrossOrigin("*")
public class RentalCarBookingController {

    @Autowired
    private RentalCarBookingService rentalCarBookingService;

    @PostMapping("/save")
    public RentalCarBooking saveBooking(@RequestBody RentalCarBooking rentalCarBooking) {
        return rentalCarBookingService.saveBooking(rentalCarBooking);
    }


    @GetMapping("/all")
    public List<RentalCarBooking> getAllBookings() {
        return rentalCarBookingService.getAllBookings();
    }



}
