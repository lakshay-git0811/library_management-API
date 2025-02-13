package com.example.library_management.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.example.library_management.enums.PersonStatus;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    // Person
    // name, image_url, gender, address, contact, status, role, password

    @Id
    private String id;

    private String name;

    private String image_url;

    private String gender;

    private String address;

    private long contact_no;

    private PersonStatus status;

    private String role;

    private String password;

}
