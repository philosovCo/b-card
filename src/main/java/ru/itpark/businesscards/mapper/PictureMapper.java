package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.Picture;
import ru.itpark.businesscards.entity.PictureEntity;

public class PictureMapper {
    public static Picture toModel(PictureEntity entity) {
        if (entity == null) {
            return null;
        }

        return Picture.builder()
                .id(entity.getId())
                .fileName(entity.getName())
                .build();
    }
}
