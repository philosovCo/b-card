package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.Card;
import ru.itpark.businesscards.entity.CardEntity;

import java.util.stream.Collectors;

public class CardMapper {

    public static Card toModel(CardEntity entity) {
        if (entity == null) {
            return null;
        }

        return Card.builder()
                .id(entity.getId())
                .job(JobMapper.toModel(entity.getJob()))
                .person(PersonMapper.toModel(entity.getPerson()))
                .contactList(
                        entity.getContactList().stream()
                                .map(ContactMapper::toModel)
                                .collect(Collectors.toList()))
                .socialNetworkList(
                        entity.getSocialNetworkList().stream()
                        .map(SocialNetworkMapper::toModel)
                        .collect(Collectors.toList())
                )
                .build();
    }
}
