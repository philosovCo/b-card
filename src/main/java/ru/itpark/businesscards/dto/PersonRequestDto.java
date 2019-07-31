package ru.itpark.businesscards.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequestDto {

    @NotBlank
    private String surName;
    @NotBlank
    private String name;
    private String patrName;
    private LocalDate birthDate;
}
