package ru.itpark.businesscards.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
    private long id;
    private String shortName;
    private String fullName;
    private Picture logotype;
    private List<Address> addressList = new ArrayList<>();
    private String webSite;
}
