package com.love.yourself.service.impl;

import com.love.yourself.entity.Item;
import com.love.yourself.repository.ItemRepository;
import com.love.yourself.service.ItemService;
import com.love.yourself.service.dto.ItemDTO;
import com.love.yourself.service.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;
    private final ItemMapper itemMapper;

    @Override
    public ItemDTO getById(ObjectId _id) {
        Item item = itemRepository.findById(_id).orElse(new Item());
        return itemMapper.toDto(item);
    }
}
