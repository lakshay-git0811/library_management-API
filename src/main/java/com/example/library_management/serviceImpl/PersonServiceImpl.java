package com.example.library_management.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.library_management.dto.PersonDTO;
import com.example.library_management.entity.Person;
import com.example.library_management.repository.PersonRepository;

public class PersonServiceImpl {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<PersonDTO> getAllPersons() {
        List<PersonDTO> result = new ArrayList<PersonDTO>();
        personRepository.findAll().forEach(person -> {
            result.add(modelMapper.map(person, PersonDTO.class));
        });
        return result;
    }

    public PersonDTO getPersonById(String id) {
        Optional<Person> personFromDB = personRepository.findById(id);
        if (personFromDB.isPresent()) {
            var person = modelMapper.map(personFromDB, PersonDTO.class);
            return person;
        }
        return null;
    }

    public PersonDTO createPerson(PersonDTO personDTO) {
        Person person = modelMapper.map(personDTO, Person.class);
        Person newPerson = personRepository.save(person);
        return modelMapper.map(newPerson, PersonDTO.class);
    }

    public PersonDTO updatePerson(String id, PersonDTO personDTO) {
        Optional<Person> personFromDB = personRepository.findById(id);

        if (personFromDB.isPresent()) {
            Person person = personFromDB.get();

            if (personDTO.getName() != null) {
                person.setName(personDTO.getName());
            }
            if (personDTO.getImage_url() != null) {
                person.setImage_url(personDTO.getImage_url());
            }
            if (personDTO.getGender() != null) {
                person.setGender(personDTO.getGender());
            }
            if (personDTO.getAddress() != null) {
                person.setAddress(personDTO.getAddress());
            }
            if (personDTO.getContact_no() != 0) {
                person.setContact_no(personDTO.getContact_no());
            }

            Person updatedPerson = personRepository.save(person);
            return modelMapper.map(updatedPerson, PersonDTO.class);
        }
        return null;
    }

    public void deletePerson(String id) {
        Optional<Person> person = personRepository.findById(id);
        if (person.isPresent()) {
            personRepository.deleteById(id);
        }
    }
}
