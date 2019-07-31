package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.PersonDto;
import ru.itpark.businesscards.entity.PersonEntity;

public class PersonMapper {

    public static PersonDto toModel(PersonEntity entity) {
        if (entity == null) {
            return null;
        }

        return PersonDto.builder()
                        .surName(entity.getSurName())
                        .name(entity.getName())
                        .patrName(entity.getPatrName())
                        .birthDate(entity.getBirthDate())
                        .build();
    }

    public static void fillEntity(PersonEntity entity, PersonDto model) {
        if (entity == null) {
            entity = new PersonEntity();
        }
        entity.setSurName(model.getSurName());
        entity.setName(model.getName());
        entity.setPatrName(model.getPatrName());
        entity.setBirthDate(model.getBirthDate());
    }

}
