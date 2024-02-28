package com.project.rating.service.services.impl;

import com.project.rating.service.entities.Rating;
import com.project.rating.service.repositories.RatingRepository;
import com.project.rating.service.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> findAll() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> findByUserId(String id) {
        return ratingRepository.findByUserId(id);
    }

    @Override
    public List<Rating> findByHotelId(String id) {
        return ratingRepository.findByHotelId(id);
    }
}
