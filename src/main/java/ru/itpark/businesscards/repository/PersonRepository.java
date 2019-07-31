package ru.itpark.businesscards.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itpark.businesscards.entity.PersonEntity;

import java.util.Optional;


public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    Optional<PersonEntity> getByUserId(Long userId);
}
