package com.example.matoshritoursandtravels.service;

import com.example.matoshritoursandtravels.model.TourPackage;
import com.example.matoshritoursandtravels.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourPackageService {
    @Autowired
    private TourPackageRepository repository;

    public List<TourPackage> getAllPackages() {
        return repository.findAll();
    }

    public TourPackage addPackage(TourPackage tourPackage) {
        return repository.save(tourPackage);
    }

    public TourPackage updatePackage(Long id, TourPackage updatedPackage) {
        TourPackage existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setImageUrl(updatedPackage.getImageUrl());
            existing.setDescription(updatedPackage.getDescription());
            existing.setPrice(updatedPackage.getPrice());
            existing.setEnabled(updatedPackage.isEnabled());
            return repository.save(existing);
        }
        return null;
    }

    public void toggleStatus(Long id, boolean status) {
        TourPackage pkg = repository.findById(id).orElse(null);
        if (pkg != null) {
            pkg.setEnabled(status);
            repository.save(pkg);
        }
    }
}
