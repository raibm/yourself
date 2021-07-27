package com.love.yourself.service.mapper;

import com.love.yourself.entity.Item;
import com.love.yourself.service.dto.ItemDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Component
@Mapper(componentModel = "spring")
public interface ItemMapper extends EntityMapper<ItemDTO, Item>{

    @Override
    ItemDTO toDto(Item entity);
}
