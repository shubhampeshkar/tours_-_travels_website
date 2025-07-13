package com.example.matoshritoursandtravels.service;

import com.example.matoshritoursandtravels.model.RentalCarBooking;
import com.example.matoshritoursandtravels.repository.RentalCarBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RentalCarBookingService {

    @Autowired
    private RentalCarBookingRepository rentalCarBookingRepository;

    public List<RentalCarBooking> getAllBookings() {
        return rentalCarBookingRepository.findAll();
    }



    public RentalCarBooking saveBooking(RentalCarBooking rentalCarBooking) {
        // Only set booking time if it's null
        if (rentalCarBooking.getBookingDateTime() == null) {
            rentalCarBooking.setBookingDateTime(LocalDateTime.now());
        }
        return rentalCarBookingRepository.save(rentalCarBooking);
    }
}

