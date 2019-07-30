package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.Person;
import ru.itpark.businesscards.entity.PersonEntity;

public class PersonMapper {

    public static Person toModel(PersonEntity entity) {
        if (entity == null) {
            return null;
        }

        return Person.builder()
                     .id(entity.getId())
                     .surName(entity.getSurName())
                     .name(entity.getName())
                     .patrName(entity.getPatrName())
                     .birthDate(entity.getBirthDate())
                     .build();
    }

    public static void fillEntity(PersonEntity entity, Person model) {
        if (entity == null) {
            entity = new PersonEntity();
        }
        entity.setId(model.getId());
        entity.setSurName(model.getSurName());
        entity.setName(model.getName());
        entity.setPatrName(model.getPatrName());
        entity.setBirthDate(model.getBirthDate());
    }

}
