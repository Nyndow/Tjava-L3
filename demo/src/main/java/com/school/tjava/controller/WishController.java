package com.school.tjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.tjava.model.Wish;
import com.school.tjava.service.MoneyService;
import com.school.tjava.service.TransactionService;
import com.school.tjava.service.WishService;

@RestController
@RequestMapping("/api")
public class WishController {

    @Autowired
    private TransactionService transactionService;

    @Autowired 
    private WishService wishService;
   

    @PostMapping("/giveWishInExchangeForMoney")
    public String giveWishInExchangeForMoney(@RequestBody Wish wish, @RequestParam Double amount) {
        transactionService.giveWishInExchangeForMoney(wish, amount);
        return "Transaction réussie";
    }

    @PostMapping("/createWish")
    public Wish createWish(@RequestBody Wish wish) {
        return wishService.addWish(wish);
    }
 
}
