package ru.itpark.businesscards.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.businesscards.dto.Person;
import ru.itpark.businesscards.entity.PersonEntity;
import ru.itpark.businesscards.entity.UserEntity;
import ru.itpark.businesscards.exeptions.PersonNotFoundException;
import ru.itpark.businesscards.mapper.PersonMapper;
import ru.itpark.businesscards.repository.PersonRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository repository;

    public Person findById(long id) {
        return repository.findById(id)
                .map(PersonMapper::toModel)
                .orElseThrow(PersonNotFoundException::new);
    }

    public Person create(Person person,UserEntity user) {
        PersonEntity entity = new PersonEntity();
        PersonMapper.fillEntity(entity, person);
        entity.setUser(user);
        return PersonMapper.toModel(repository.save(entity));
    }

    public Person update(Person person, UserEntity user) {
        PersonEntity entity =
                repository.findById(person.getId())
                        .orElseThrow(PersonNotFoundException::new);
        PersonMapper.fillEntity(entity, person);
        entity.setUser(user);
        return PersonMapper.toModel(repository.save(entity));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
