package com.love.yourself.service;

import com.love.yourself.service.dto.ProfileDTO;
import org.bson.types.ObjectId;

public interface ProfileService {

    /**
     * @apiNote Use to search a object type ProfileDTO and return it.
     * @param _id
     * @return a ProfileDTO
     */
    ProfileDTO getById(ObjectId _id);

    /**
     * @apiNote Use to save a object type ProfileDTO and return it.
     * @param dto
     * @return a ProfileDTO
     */
    ProfileDTO save(ProfileDTO dto);
}
