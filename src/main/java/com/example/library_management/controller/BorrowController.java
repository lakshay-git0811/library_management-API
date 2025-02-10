package com.example.library_management.controller;

import com.example.library_management.dto.BorrowDTO;
import com.example.library_management.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/borrow")
public class BorrowController {

    @Autowired
    BorrowService borrowService;

    @GetMapping("")
    public List<BorrowDTO> getAllBorrows() {
        return borrowService.getAllBorrows();
    }

    @GetMapping("/{id}")
    public BorrowDTO getBorrowById(@PathVariable String id) {
        return borrowService.getBorrowById(id);
    }

    @PostMapping("/")
    public BorrowDTO createBorrow(@RequestBody BorrowDTO borrowDTO) {
        return borrowService.createBorrow(borrowDTO);
    }

    @PutMapping("/{id}")
    public BorrowDTO updateBorrow(@PathVariable String id, @RequestBody BorrowDTO borrowDTO) {
        return borrowService.updateBorrow(id, borrowDTO);
    }

}
