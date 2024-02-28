package com.project.rating.service.services;

import com.project.rating.service.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating createRating(Rating rating);
    List<Rating> findAll();
    List<Rating> findByUserId(String id);
    List<Rating> findByHotelId(String id);
}
