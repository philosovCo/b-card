package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.Organization;
import ru.itpark.businesscards.entity.OrganizationEntity;

import java.util.stream.Collectors;

public class OrganizationMapper {

    public static Organization toModel(OrganizationEntity entity) {
        if (entity == null) {
            return null;
        }

        return Organization.builder()
                .id(entity.getId())
                .shortName(entity.getShortName())
                .fullName(entity.getFullName())
                .webSite(entity.getWebSite())
                .logotype(PictureMapper.toModel(entity.getLogotype()))
                .addressList(
                        entity.getAddressList().stream()
                                .map(AddressMapper::toModel)
                                .collect(Collectors.toList()))
                .build();
    }

}
