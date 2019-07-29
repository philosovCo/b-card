package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.Position;
import ru.itpark.businesscards.entity.PositionEntity;

public class PositionMapper {

    public static Position toModel(PositionEntity entity) {
        return Position.builder()
                .id(entity.getId())
                .name(entity.getName())
                .build();
    }
}
