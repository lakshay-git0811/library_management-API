package com.example.library_management.service;

import com.example.library_management.dto.AuthorDTO;
import com.example.library_management.entity.Author;

import java.util.List;


public interface AuthorService {

    public List<AuthorDTO> getAllAuthors();

    public AuthorDTO getAuthorById(String id);

    public AuthorDTO createAuthor(AuthorDTO authorDTO);

    public AuthorDTO updateAuthor(String id, AuthorDTO authorDTO);

    public void deleteAuthor(String id);
}
