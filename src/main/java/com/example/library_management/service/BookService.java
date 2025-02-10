package com.example.library_management.service;

import com.example.library_management.dto.BookDTO;

import java.util.List;

public interface BookService {
    public List<BookDTO> getAllBooks();

    public BookDTO getBookById(String id);

    public BookDTO createBook(BookDTO bookDTO);

    public BookDTO updateBook(String id, BookDTO bookDTO);
}
