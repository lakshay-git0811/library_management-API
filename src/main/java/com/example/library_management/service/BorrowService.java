package com.example.library_management.service;

import com.example.library_management.dto.BorrowDTO;

import java.util.List;

public interface BorrowService {
    public List<BorrowDTO> getAllBorrows();

    public BorrowDTO getBorrowById(String id);

    public BorrowDTO createBorrow(BorrowDTO borrowDTO);

    public BorrowDTO updateBorrow(String id, BorrowDTO borrowDTO);

    public List<BorrowDTO> getBorrowsByPersonId(String personId);
}
