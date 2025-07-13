package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.Booking;
import com.example.matoshritoursandtravels.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByEmail(String email);
}
