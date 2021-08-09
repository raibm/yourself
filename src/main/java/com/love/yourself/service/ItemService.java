package com.love.yourself.service;

import com.love.yourself.service.dto.ItemDTO;
import org.bson.types.ObjectId;

public interface ItemService {

    /**
     * @apiNote Used to search a object of type ItemDTO and return it.
     * @param _id
     * @return a ItemDTO
     */
    ItemDTO getById(ObjectId _id);

    /**
     * @apiNote Used to save a object of type ItemDTO and return it converted at DTO.
     * @param item
     * @return a ItemDTO
     */
    ItemDTO save(ItemDTO item);
}
