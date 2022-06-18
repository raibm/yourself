package com.love.yourself.service.mapper;

import com.love.yourself.entity.Profile;
import com.love.yourself.service.dto.ProfileDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Component
@Mapper(componentModel = "spring")
public interface ProfileMapper extends EntityMapper<ProfileDTO, Profile> {

    @Override
    ProfileDTO toDto(Profile entity);

    @Override
    Profile toEntity(ProfileDTO dto);
}
