package com.example.library_management.serviceImpl;

import com.example.library_management.dto.BookDTO;
import com.example.library_management.entity.Book;
import com.example.library_management.repository.BookRepository;
import com.example.library_management.service.BookService;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    ModelMapper modelMapper;

    public List<BookDTO> getAllBooks() {
        List<BookDTO> result = new ArrayList<BookDTO>();
        bookRepository.findAll().forEach(book -> {
            result.add(modelMapper.map(book,BookDTO.class));
        });
        return result;
    }

    public BookDTO getBookById(String id) {
        ObjectId objectId = new ObjectId(id);
        Optional<Book> bookFromDB = bookRepository.findById(objectId);
        return modelMapper.map(bookFromDB, BookDTO.class);
    }

    public BookDTO createBook(BookDTO bookDTO) {
        Book book = modelMapper.map(bookDTO, Book.class);
        Book newBook = bookRepository.save(book);
        return modelMapper.map(newBook, BookDTO.class);
    }
}
