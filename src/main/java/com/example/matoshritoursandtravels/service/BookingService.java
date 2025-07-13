package com.example.matoshritoursandtravels.service;

import com.example.matoshritoursandtravels.model.Booking;
import com.example.matoshritoursandtravels.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking updatePaymentStatus(Long id, boolean status) {
        Booking booking = bookingRepository.findById(id).orElse(null);
        if (booking != null) {
            booking.setPaymentStatus(status);
            return bookingRepository.save(booking);
        }
        return null;
    }
}
