package com.love.yourself.cotroller;

import com.love.yourself.service.ItemService;
import com.love.yourself.service.dto.ItemDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    /**
     * Search a Item by id.
     * @param _id
     * @return ItemDTO
     */
    @GetMapping("/{id}")
    public ResponseEntity<ItemDTO> getItem(@PathVariable(value="id") ObjectId _id){
        log.info("Searching a Item by id {}...", _id);
        ItemDTO item = itemService.getById(_id);
        return ResponseEntity.ok().body(item);
    }
}
