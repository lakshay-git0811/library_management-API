package com.example.library_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.library_management.enums.BookStatus;

@Document
@Data // for getter and setter
@AllArgsConstructor // makes the constructor which accepts every field
@NoArgsConstructor
public class Book {

    @Id
    private String id;

    private long book_id;

    private String image_url;

    private String title;

    private String category;

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
