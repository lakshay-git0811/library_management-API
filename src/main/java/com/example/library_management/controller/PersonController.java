package com.example.library_management.controller;


import com.example.library_management.dto.PersonDTO;
import com.example.library_management.entity.Person;
//import com.example.library_management.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
//
//    @Autowired
//    PersonService personService;
//
//    @GetMapping("")
//    public List<PersonDTO> getAllPersons() {
//        return personService.getAllPersons();
//    }
//
//    @GetMapping("/{id}")
//    public PersonDTO getPersonById(@PathVariable String id) {
//        return personService.getPersonById(id);
//    }
//
//    @PostMapping("/")
//    public Person createPerson(@RequestBody PersonDTO personDTO) {
//        return  personService.createPerson(personDTO);
//    }
//


}
