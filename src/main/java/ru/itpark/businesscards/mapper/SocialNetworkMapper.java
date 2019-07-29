package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.SocialNetwork;
import ru.itpark.businesscards.entity.SocialNetworkEntity;

public class SocialNetworkMapper {

    public static SocialNetwork toModel(SocialNetworkEntity entity) {
        if (entity == null) {
            return null;
        }

        return SocialNetwork.builder()
                .id(entity.getId())
                .account(entity.getAccount())
                .type(entity.getType().name())
                .build();
    }
}
