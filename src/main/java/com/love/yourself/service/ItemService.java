package com.love.yourself.service;

import com.love.yourself.service.dto.ItemDTO;
import org.bson.types.ObjectId;

public interface ItemService {

    /**
     * @apiNote Use to search a object type ItemDTO and return it.
     * @param _id
     * @return a ItemDTO
     */
    ItemDTO getById(ObjectId _id);

    /**
     * @apiNote Use to save a object type ItemDTO and return it.
     * @param item
     * @return a ItemDTO
     */
    ItemDTO save(ItemDTO item);
}
