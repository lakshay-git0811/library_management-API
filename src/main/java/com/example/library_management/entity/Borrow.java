package com.example.library_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Borrow {
    // Borrow
    // book_id, user_id, borrow_date, due_date, return_date, status

    @Id
    private String id;

    private String book_id;

    private String user_id;

    private Date borrow_date;

    private Date due_date;

    private Date return_date;

    private String status;

}
