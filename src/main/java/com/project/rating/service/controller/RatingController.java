package com.project.rating.service.controller;

import com.project.rating.service.entities.Rating;
import com.project.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
    }

    @GetMapping
    public ResponseEntity<List<Rating>> findAll(){
        return ResponseEntity.ok(ratingService.findAll());
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> findByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.findByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> findByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.findByHotelId(hotelId));
    }


}
