package ru.itpark.businesscards.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itpark.businesscards.dto.PersonDto;
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

    public PersonDto findById(long id) {
        return repository.findById(id)
                         .map(PersonMapper::toModel)
                         .orElseThrow(PersonNotFoundException::new);
    }

    public PersonDto save(PersonDto person, UserEntity user) {
        PersonEntity entity = repository.getByUserId(user.getId()).orElse(new PersonEntity());
        PersonMapper.fillEntity(entity, person);
        entity.setUser(user);
        return PersonMapper.toModel(repository.save(entity));
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
