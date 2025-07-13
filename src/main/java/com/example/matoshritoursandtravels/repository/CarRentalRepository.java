package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.CarRental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRentalRepository extends JpaRepository<CarRental, Long> {
    List<CarRental> findByEnabledTrue();
}