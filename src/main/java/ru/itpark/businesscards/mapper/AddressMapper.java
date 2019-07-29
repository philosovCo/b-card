package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.Address;
import ru.itpark.businesscards.entity.AddressEntity;

public class AddressMapper{

    public static Address toModel(AddressEntity entity) {
        if (entity == null) {
            return null;
        }

        return Address.builder()
                .id(entity.getId())
                .index(entity.getIndex())
                .country(entity.getCountry())
                .city(entity.getCity())
                .street(entity.getStreet())
                .home(entity.getHome())
                .type(entity.getType().name())
                .build();
    }
}
