package com.school.tjava.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.school.tjava.model.Money;
import com.school.tjava.repository.MoneyRepository;

@Service
public class MoneyService {

    @Autowired
    private MoneyRepository moneyRepository;

    @Transactional
    public void addMoney(Money amount) {
        moneyRepository.save(amount);
    }

    @Transactional
    public void removeMoney(Double amount) {
        Money money = moneyRepository.findById(1L).orElseThrow();
        if (money.getAmount() >= amount) {
            money.setAmount(money.getAmount() - amount);
            moneyRepository.save(money);
        } else {
            throw new RuntimeException("Not enough money");
        }
    }
}