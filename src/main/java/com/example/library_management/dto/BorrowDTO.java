package com.example.library_management.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BorrowDTO {

    private String id;

    private String book_id;

    private String user_id;

    private Date borrow_date;

    private Date due_date;

    private Date return_date;

    private String status;

}
