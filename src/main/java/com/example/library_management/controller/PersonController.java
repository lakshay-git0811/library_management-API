package com.example.library_management.controller;

import com.example.library_management.dto.PersonDTO;
import com.example.library_management.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("")
    public List<PersonDTO> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/{id}")
    public PersonDTO getPersonById(@PathVariable String id) {
        return personService.getPersonById(id);
    }

    @PostMapping("")
    public PersonDTO createPerson(@RequestBody PersonDTO personDTO) {
        return personService.createPerson(personDTO);
    }

    @PutMapping("/{id}")
    public PersonDTO updatePerson(@PathVariable String id, @RequestBody PersonDTO personDTO) {
        return personService.updatePerson(id, personDTO);
    }

}
