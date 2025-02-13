package com.example.library_management.controller;

import com.example.library_management.dto.BookDTO;
import com.example.library_management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("")
    public List<BookDTO> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookDTO getBookById(@PathVariable String id) {
        return bookService.getBookById(id);
    }

    @PostMapping("")
    public BookDTO createBook(@RequestBody BookDTO bookDTO) {
        return bookService.createBook(bookDTO);
    }

    @PutMapping("/{id}")
    public BookDTO updateBook(@PathVariable String id, @RequestBody BookDTO bookDTO) {
        return bookService.updateBook(id, bookDTO);
    }

    @GetMapping("/author/{id}")
    public List<BookDTO> getBooksByAuthorId(@PathVariable("id") String authorId) {
        return bookService.getBooksByAuthorId(authorId);
    }

}

// pagination
// filtering
// sorting
// searching

// get borrows by person id