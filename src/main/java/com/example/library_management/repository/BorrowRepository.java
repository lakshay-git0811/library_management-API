package com.example.library_management.repository;

import com.example.library_management.dto.BorrowDTO;
import com.example.library_management.entity.Borrow;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends MongoRepository<Borrow, String> {

    @Query(" {person_id: ?0} ")
    public List<Borrow> findBorrowsByPersonId(String personId);

}
