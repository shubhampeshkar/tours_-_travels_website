package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.CarRental;
import com.example.matoshritoursandtravels.service.CarRentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carrentals")
@CrossOrigin("*")
public class CarRentalController {

    @Autowired
    private CarRentalService carRentalService;

    @GetMapping
    public List<CarRental> getAllCarRentals() {
        return carRentalService.getAllCarRentals();
    }

    @GetMapping("/enabled")
    public List<CarRental> getEnabledCarRentals() {
        return carRentalService.getEnabledCarRentals();
    }

    @PostMapping
    public CarRental addCarRental(@RequestBody CarRental carRental) {
        return carRentalService.saveCarRental(carRental);
    }

    @PutMapping("/{id}")
    public CarRental updateCarRental(@PathVariable Long id, @RequestBody CarRental carRental) {
        return carRentalService.updateCarRental(id, carRental);
    }

    @DeleteMapping("/{id}")
    public void deleteCarRental(@PathVariable Long id) {
        carRentalService.deleteCarRental(id);
    }
}
