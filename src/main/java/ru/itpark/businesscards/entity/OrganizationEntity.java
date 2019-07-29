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
public class OrganizationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private PictureEntity logotype;

    @ManyToMany
    private List<AddressEntity> addressList = new ArrayList<>();

    private String shortName;
    private String fullName;
    private String webSite;
}
