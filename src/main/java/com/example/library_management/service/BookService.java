package com.example.library_management.service;

import com.example.library_management.dto.AuthorDTO;
import com.example.library_management.dto.BookDTO;
import com.example.library_management.entity.Author;
import com.example.library_management.entity.Book;

import java.util.List;

public interface BookService {
    public List<BookDTO> getAllBooks();

    public BookDTO getBookById(String id);

    public BookDTO createBook(BookDTO bookDTO);
}
