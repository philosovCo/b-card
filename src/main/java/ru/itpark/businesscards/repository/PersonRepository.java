package ru.itpark.businesscards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.businesscards.entity.PersonEntity;


public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
