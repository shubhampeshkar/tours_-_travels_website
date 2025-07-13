package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.RentalCarBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RentalCarBookingRepository extends JpaRepository<RentalCarBooking, Long> {
    List<RentalCarBooking> findByCustomerEmail(String customerEmail);
}
