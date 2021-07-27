package com.love.yourself.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@Document(collection = "item")
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id
    private ObjectId _id;

    private String name;

    private BigDecimal value;
}
