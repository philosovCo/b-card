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
                .patrName(entity.getPatrName())
                .birthDate(entity.getBirthDate())
                .build();
    }

    public static void fillEntity(PersonEntity entity, Person model) {
        if (entity == null) {
            entity = new PersonEntity();
        }

        entity.toBuilder()
                .id(model.getId())
                .surName(model.getSurName())
                .name(model.getName())
                .patrName(model.getPatrName())
                .birthDate(model.getBirthDate())
                .build();
    }
}
