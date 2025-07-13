package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.BookingTreksAndTours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingTreksAndToursRepository extends JpaRepository<BookingTreksAndTours, Long> {
    List<BookingTreksAndTours> findByEmail(String email);
}
