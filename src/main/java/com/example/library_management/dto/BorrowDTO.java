package com.example.library_management.dto;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.Date;

public class BorrowDTO {

    private ObjectId id;

    @DBRef
    private ObjectId book_id;

    @DBRef
    private ObjectId user_id;

    private Date borrow_date;

    private Date due_date;

    private Date return_date;

    private String status;

}
