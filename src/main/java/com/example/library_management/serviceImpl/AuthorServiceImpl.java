package com.example.library_management.serviceImpl;

import com.example.library_management.dto.AuthorDTO;
import com.example.library_management.entity.Author;
import com.example.library_management.repository.AuthorRepository;
import com.example.library_management.service.AuthorService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<AuthorDTO> getAllAuthors() {
        List<AuthorDTO> result = new ArrayList<AuthorDTO>();
        authorRepository.findAll().forEach(author -> {
            result.add(modelMapper.map(author, AuthorDTO.class));
        });
        return result;
    }

    public AuthorDTO getAuthorById(String id) {
        Optional<Author> authorFromDB = authorRepository.findById(id);
        if (authorFromDB.isPresent()) {
            var author = modelMapper.map(authorFromDB.get(), AuthorDTO.class);
            return author;
        }
        return null;
    }

    public AuthorDTO createAuthor(AuthorDTO authorDTO) {
        Author author = modelMapper.map(authorDTO, Author.class);
        Author newAuthor = authorRepository.save(author);
        return modelMapper.map(newAuthor, AuthorDTO.class);
    }

    public AuthorDTO updateAuthor(String id, AuthorDTO authorDTO) {
        Optional<Author> authorFromDB = authorRepository.findById(id);

        if (authorFromDB.isPresent()) {
            Author author = authorFromDB.get();

            if (authorDTO.getName() != null) {
                author.setName(authorDTO.getName());
            }
            if (authorDTO.getEmail() != null) {
                author.setEmail(authorDTO.getEmail());
            }
            if (authorDTO.getContact_no() != 0) {
                author.setContact_no(authorDTO.getContact_no());
            }
            if (authorDTO.getImage_url() != null) {
                author.setImage_url(authorDTO.getImage_url());
            }

            Author updatedAuthor = authorRepository.save(author);
            return modelMapper.map(updatedAuthor, AuthorDTO.class);
        }
        return null;
    }

    public void deleteAuthor(String id) {
        Optional<Author> authorFromDB = authorRepository.findById(id);
        if (authorFromDB.isPresent()) {
            authorRepository.deleteById(id);
        }
    }

}
