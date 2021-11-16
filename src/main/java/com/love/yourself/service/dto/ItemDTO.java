package com.love.yourself.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Valid
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDTO {
    private ObjectId _id;

    @NotNull(message = "The field 'title' cannot be null.")
    private String title;
    private String description;
    private MultipartFile multipartFile;
}
