package com.example.library_management.service;

import com.example.library_management.dto.PersonDTO;
import com.example.library_management.entity.Person;

import java.util.List;

public interface PersonService {
    public List<PersonDTO> getAllPersons();

    public PersonDTO getPersonById(String id);

    public PersonDTO createPerson(PersonDTO personDTO);

    public PersonDTO updatePerson(String id, PersonDTO personDTO);
}
