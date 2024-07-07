package com.school.tjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.tjava.model.Wish;

import jakarta.transaction.Transactional;

@Service
public class TransactionService {

    @Autowired
    private WishService wishService;

    @Autowired
    private MoneyService moneyService;

    @Transactional
    public void giveWishInExchangeForMoney(Wish wish, Double amount) {
        moneyService.removeMoney(amount); // Remove money from user's account
        wishService.addWish(wish); // Add the wish
    }
}	