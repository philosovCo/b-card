package ru.itpark.businesscards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.businesscards.entity.CardEntity;


public interface CardRepository extends JpaRepository<CardEntity, Long> {
}
