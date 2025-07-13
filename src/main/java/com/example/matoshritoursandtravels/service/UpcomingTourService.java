package com.example.matoshritoursandtravels.service;

import com.example.matoshritoursandtravels.model.UpcomingTour;
import com.example.matoshritoursandtravels.repository.UpcomingTourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UpcomingTourService {

    @Autowired
    private UpcomingTourRepository repository;

    public List<UpcomingTour> getAllTours() {
        return repository.findAll();
    }

    public List<UpcomingTour> getEnabledTours() {
        return repository.findByEnabledTrue();
    }

    public UpcomingTour addTour(UpcomingTour tour) {
        return repository.save(tour);
    }

    public void deleteTour(Long id) {
        repository.deleteById(id);
    }

    public Optional<UpcomingTour> getTourById(Long id) {
        return repository.findById(id);
    }

    public UpcomingTour updateTour(Long id, UpcomingTour updatedTour) {
        return repository.findById(id).map(existing -> {
            existing.setImageUrl(updatedTour.getImageUrl());
            existing.setTrekName(updatedTour.getTrekName());
            existing.setDate(updatedTour.getDate());
            existing.setTime(updatedTour.getTime());
            existing.setSeats(updatedTour.getSeats());
            existing.setPrice(updatedTour.getPrice());
            existing.setDescription(updatedTour.getDescription());
            existing.setEnabled(updatedTour.isEnabled());
            return repository.save(existing);
        }).orElse(null);
    }

    public void toggleTourStatus(Long id) {
        repository.findById(id).ifPresent(tour -> {
            tour.setEnabled(!tour.isEnabled());
            repository.save(tour);
        });
    }
}
