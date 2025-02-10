package com.example.library_management.dto;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private String id;

    private long book_id;

    private String image_url;

    private String title;

    private String category;

    @DBRef // for reference field
    private String author_id;

    private String status;

    private int stock;

}

// Author
// name, email, phone, image_url

// Book
// book_id, image_url, title, category, author, status, stock

// Person
// name, image_url, gender, address, contact, status, role, password

// Borrow
// book_id, user_id, borrow_date, due_date, return_date, status

