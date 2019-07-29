package ru.itpark.businesscards.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private PersonEntity person;

    @ManyToOne(fetch = FetchType.LAZY)
    private JobEntity job;

    @ManyToMany
    private List<ContactEntity> contactList = new ArrayList<>();

    @ManyToMany
    private List<SocialNetworkEntity> socialNetworkList= new ArrayList<>();
}
