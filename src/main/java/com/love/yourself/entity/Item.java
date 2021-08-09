package com.love.yourself.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author rai.maciel
 * Item é uma entidade multiuso usada para gerênciar pequenas postagems.
 *
 * @version 0.0.1
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "item")
public class Item {

    @Id
    private ObjectId _id;

    @NotEmpty(message = "Item name may not be empty.")
    @Size(min = 2, max = 32, message = "Item name must be between 2 and 32 characters long.")
    private String title;

    @Size(max = 500, message = "Item description size exceeds limit.")
    private String description;

    @DBRef
    private File file;
}
