package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.UpcomingTour;
import com.example.matoshritoursandtravels.service.UpcomingTourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tours")
@CrossOrigin("*")
public class UpcomingTourController {

    @Autowired
    private UpcomingTourService service;

    @GetMapping
    public List<UpcomingTour> getAllTours() {
        return service.getAllTours();
    }

    @GetMapping("/enabled")
    public List<UpcomingTour> getEnabledTours() {
        return service.getEnabledTours();
    }

    @PostMapping
    public UpcomingTour addTour(@RequestBody UpcomingTour tour) {
        return service.addTour(tour);
    }

    @PutMapping("/{id}")
    public UpcomingTour updateTour(@PathVariable Long id, @RequestBody UpcomingTour updatedTour) {
        return service.updateTour(id, updatedTour);
    }

    @PutMapping("/{id}/toggle")
    public void toggleStatus(@PathVariable Long id) {
        service.toggleTourStatus(id);
    }

    @DeleteMapping("/{id}")
    public void deleteTour(@PathVariable Long id) {
        service.deleteTour(id);
    }

    @GetMapping("/{id}")
    public Optional<UpcomingTour> getTourById(@PathVariable Long id) {
        return service.getTourById(id);
    }
}
