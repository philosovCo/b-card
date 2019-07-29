package ru.itpark.businesscards.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private long id;
    private String index;
    private String country;
    private String city;
    private String street;
    private String home;
    private String type;
}
