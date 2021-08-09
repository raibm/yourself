package com.love.yourself.cotroller;

import com.love.yourself.service.ItemService;
import com.love.yourself.service.dto.ItemDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

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

    /**
     * Save a Item.
     * @param itemDTO
     * @return ItemDTO
     */
    @PostMapping("")
    public ResponseEntity<ItemDTO> saveItem(@RequestBody ItemDTO itemDTO) throws URISyntaxException {
        log.info("Saving item {}...", itemDTO.toString());
        ItemDTO item = itemService.save(itemDTO);
        return ResponseEntity.created(new URI("/item"))
                .body(item);
    }
}
