package com.love.yourself.service.impl;

import com.amazonaws.services.s3.AmazonS3;
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
    private final AmazonS3 s3Client;

    @Override
    public ItemDTO getById(ObjectId _id) {
         Item item = itemRepository.findById(_id).orElseThrow();
        return itemMapper.toDto(item);
    }

    @Override
    public ItemDTO save(ItemDTO item) {
        return null;
    }
}
