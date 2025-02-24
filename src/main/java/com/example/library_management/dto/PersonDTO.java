package com.example.library_management.dto;

import com.example.library_management.enums.PersonStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO {

    private String id;

    private String name;

    private String image_url;

    private String gender;

    private String address;

    private long contact_no;

    private PersonStatus status;

    private String role;
}
