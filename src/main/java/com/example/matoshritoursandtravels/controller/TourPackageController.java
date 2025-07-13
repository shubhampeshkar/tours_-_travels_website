package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.TourPackage;
import com.example.matoshritoursandtravels.service.TourPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/packages")
@CrossOrigin("*")
public class TourPackageController {
    @Autowired
    private TourPackageService service;

    @GetMapping
    public List<TourPackage> getAllPackages() {
        return service.getAllPackages();
    }

    @PostMapping("/add")
    public TourPackage addPackage(@RequestBody TourPackage tourPackage) {
        return service.addPackage(tourPackage);
    }

    @PutMapping("/update/{id}")
    public TourPackage updatePackage(@PathVariable Long id, @RequestBody TourPackage pkg) {
        return service.updatePackage(id, pkg);
    }

    @PutMapping("/status/{id}")
    public void toggleStatus(@PathVariable Long id, @RequestParam boolean status) {
        service.toggleStatus(id, status);
    }
}
