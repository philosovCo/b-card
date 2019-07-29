package ru.itpark.businesscards.mapper;

import ru.itpark.businesscards.dto.Job;
import ru.itpark.businesscards.entity.JobEntity;

public class JobMapper {

    public static Job toModel(JobEntity entity) {
        if (entity == null) {
            return null;
        }

        return Job.builder()
                .organization(OrganizationMapper.toModel(entity.getOrganization()))
                .position(PositionMapper.toModel(entity.getPosition()))
                .build();
    }
}
