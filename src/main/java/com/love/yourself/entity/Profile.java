package com.love.yourself.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

/**
 * @author rai.maciel
 * Profile é a principal entidade gerenciável do sistema, reponsável por armazenar .
 *
 * @version 0.0.1
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "profile")
public class Profile {

    @Id
    private ObjectId _id;

    private String name;

    private String description;

    @CreatedDate
    private Date createdAt;

    @LastModifiedDate
    private Date updatedAt;

    @Size(max = 32, message = "Profile avatar name size exceeds limit.")
    private String avatarFileName;

    private String base64;

    @Size(max = 6, message = "Profile avatar type size exceeds limit.")
    private String fileType;


//    @DBRef
//    private List<Item> items;
}
