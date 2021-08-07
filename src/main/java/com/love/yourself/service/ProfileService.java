package com.love.yourself.service;

import com.love.yourself.service.dto.ProfileDTO;
import org.bson.types.ObjectId;

public interface ProfileService {

    /**
     * @apiNote Used to search a object of type ProfileDTO and return it.
     * @param _id
     * @return a ProfileDTO
     */
    ProfileDTO getById(ObjectId _id);
}
