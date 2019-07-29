package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.Contact;
import ru.itpark.businesscards.entity.ContactEntity;

public class ContactMapper {

    public static Contact toModel(ContactEntity entity) {
        if (entity == null) {
            return null;
        }

        return Contact.builder()
                .id(entity.getId())
                .value(entity.getValue())
                .type(entity.getType().name())
                .build();
    }
}
