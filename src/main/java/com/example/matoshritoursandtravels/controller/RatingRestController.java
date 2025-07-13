package com.example.matoshritoursandtravels.controller;

import com.example.matoshritoursandtravels.model.Rating;
import com.example.matoshritoursandtravels.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ratings")
@CrossOrigin // Allow fetch from HTML JS
public class RatingRestController {

    @Autowired
    private RatingRepository ratingRepository;

    @PostMapping
    public Rating submitRating(@RequestBody Rating rating) {
        return ratingRepository.save(rating);
    }

    @GetMapping
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }
}
