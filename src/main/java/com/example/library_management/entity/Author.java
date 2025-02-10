package com.example.library_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Author {

    // Author
    // name, email, phone, image_url
    @Id
    private String id;

    private String name;

    private String email;

    private long contact_no;

    private String image_url;

}
