package com.school.tjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.tjava.model.Wish;
import com.school.tjava.repository.WishRepository;

@Service
public class WishService {

    @Autowired
    private WishRepository wishRepository;

    public Wish addWish(Wish wish) {
        return wishRepository.save(wish);
    }
}