package com.example.library_management.serviceImpl;

import com.example.library_management.dto.BookDTO;
import com.example.library_management.entity.Book;
import com.example.library_management.repository.BookRepository;
import com.example.library_management.service.BookService;
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
            result.add(modelMapper.map(book, BookDTO.class));
        });
        return result;
    }

    public BookDTO getBookById(String id) {
        Optional<Book> bookFromDB = bookRepository.findById(id);
        if (bookFromDB.isPresent()) {
            var book = modelMapper.map(bookFromDB, BookDTO.class);
            return book;
        }
        return null;
    }

    public BookDTO createBook(BookDTO bookDTO) {
        Book book = modelMapper.map(bookDTO, Book.class);
        Book newBook = bookRepository.save(book);
        return modelMapper.map(newBook, BookDTO.class);
    }

    public BookDTO updateBook(String id, BookDTO bookDTO) {
        Optional<Book> bookFromDB = bookRepository.findById(id);

        if (bookFromDB.isPresent()) {
            Book book = bookFromDB.get();

            if (bookDTO.getBook_id() != 0) {
                book.setBook_id(bookDTO.getBook_id());
            }
            if (bookDTO.getImage_url() != null) {
                book.setImage_url(bookDTO.getImage_url());
            }
            if (bookDTO.getCategory() != null) {
                book.setCategory(bookDTO.getCategory());
            }
            if (bookDTO.getAuthor_id() != null) {
                book.setAuthor_id(bookDTO.getAuthor_id());
            }
            if (bookDTO.getStatus() != null) {
                book.setStatus(bookDTO.getStatus());
            }
            if (bookDTO.getStock() != 0) {
                book.setStock(bookDTO.getStock());
            }

            Book updatedBook = bookRepository.save(book);
            return modelMapper.map(updatedBook, BookDTO.class);
        }
        return null;
    }

    public void deleteBook(String id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()) {
            bookRepository.deleteById(id);
        }
    }
}
