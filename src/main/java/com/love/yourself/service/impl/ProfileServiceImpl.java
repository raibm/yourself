package com.love.yourself.service.impl;

import com.love.yourself.entity.Profile;
import com.love.yourself.repository.ProfileRepository;
import com.love.yourself.service.ProfileService;
import com.love.yourself.service.dto.ProfileDTO;
import com.love.yourself.service.mapper.ProfileMapper;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfileServiceImpl implements ProfileService {

    private final ProfileRepository profileRepository;
    private final ProfileMapper profileMapper;

    @Override
    public ProfileDTO getById(ObjectId _id) {
        Profile profile = profileRepository.findById(_id).orElse(new Profile());
        return profileMapper.toDto(profile);
    }
}
