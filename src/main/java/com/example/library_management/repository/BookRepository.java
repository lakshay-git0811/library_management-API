package com.example.library_management.repository;

import com.example.library_management.dto.BookDTO;
import com.example.library_management.entity.Book;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

    @Query("{ author_id: ?0 }")
    public List<Book> findByAuthorId(String authorId);
}

// @Query("{ author_id: ?0 , status: ?1}")
// public List<Book> findByAuthorId(String authorId, String status);