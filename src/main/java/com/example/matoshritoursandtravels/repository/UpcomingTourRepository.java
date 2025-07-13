package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.UpcomingTour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UpcomingTourRepository extends JpaRepository<UpcomingTour, Long> {
    List<UpcomingTour> findByEnabledTrue(); // New method

    UpcomingTour findByTrekNameAndDateAndTime(String trekName, String date, String time);
}
