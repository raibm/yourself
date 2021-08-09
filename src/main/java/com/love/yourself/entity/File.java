package com.love.yourself.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "file")
public class File {

    @Id
    private ObjectId _id;

    @NotEmpty(message = "File name may not be empty.")
    @Size(min = 2, max = 60, message = "File name must be between 2 and 60 characters long.")
    private String fileName;

    @Size(max = 60, message = "S3 file name size exceeds limit.")
    private String s3FileName;

    @NotEmpty(message = "File type may not be empty.")
    @Size(max = 5, message = "File type size exceeds limit.")
    private String type;
}
