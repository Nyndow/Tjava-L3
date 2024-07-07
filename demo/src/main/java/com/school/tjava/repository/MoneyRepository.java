package com.school.tjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.tjava.model.Money;

public interface MoneyRepository extends JpaRepository<Money, Long> {
}
