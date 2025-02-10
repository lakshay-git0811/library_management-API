package com.example.library_management.repository;

import com.example.library_management.entity.Borrow;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BorrowRepository extends MongoRepository<Borrow, ObjectId> {
}
