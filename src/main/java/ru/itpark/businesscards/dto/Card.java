package ru.itpark.businesscards.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itpark.businesscards.entity.CardEntity;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    private long id;
    private Person person;
    private Job job;
    private List<Contact> contactList;
    private List<SocialNetwork> socialNetworkList;

    public static Card from(CardEntity cardEntity) {
        return new Card();
    }
}
