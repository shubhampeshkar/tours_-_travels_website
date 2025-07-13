package com.example.matoshritoursandtravels.service;

import com.example.matoshritoursandtravels.model.CarRental;
import com.example.matoshritoursandtravels.repository.CarRentalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarRentalService {
    @Autowired
    private CarRentalRepository carRentalRepository;

    public List<CarRental> getAllCarRentals() {
        return carRentalRepository.findAll();
    }

    public List<CarRental> getEnabledCarRentals() {
        return carRentalRepository.findByEnabledTrue();
    }

    public CarRental saveCarRental(CarRental carRental) {
        return carRentalRepository.save(carRental);
    }

    public void deleteCarRental(Long id) {
        carRentalRepository.deleteById(id);
    }

    public CarRental updateCarRental(Long id, CarRental updatedCar) {
        CarRental existing = carRentalRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setCarName(updatedCar.getCarName());
            existing.setCarNumber(updatedCar.getCarNumber());
            existing.setImageUrl(updatedCar.getImageUrl());
            existing.setSeater(updatedCar.getSeater());
            existing.setPrice(updatedCar.getPrice());
            existing.setEnabled(updatedCar.isEnabled());
            return carRentalRepository.save(existing);
        }
        return null;
    }
}