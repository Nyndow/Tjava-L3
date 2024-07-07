package com.school.tjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.tjava.model.Wish;

public interface WishRepository extends JpaRepository<Wish, Long> {
}
