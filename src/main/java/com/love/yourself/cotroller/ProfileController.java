package com.love.yourself.cotroller;

import com.love.yourself.service.ProfileService;
import com.love.yourself.service.dto.ProfileDTO;
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
@RequestMapping("/profile")
@RequiredArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    /**
     * Search a Profile by id.
     * @param _id
     * @return ProfileDTO
     */
    @GetMapping("/{id}")
    public ResponseEntity<ProfileDTO> getItem(@PathVariable(value="id") ObjectId _id){
        log.info("Searching a Item by id {}...", _id);
        ProfileDTO profile = profileService.getById(_id);
        return ResponseEntity.ok().body(profile);
    }
}
